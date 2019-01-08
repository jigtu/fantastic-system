package com.anti.common.util;

import com.jcraft.jsch.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

/**
 * @author ZiQiang
 */
public class SftpClient {
    private final static Logger logger = LoggerFactory.getLogger(SftpClient.class);

    private String server;
    private int port = 22;
    private String login;
    private String password;

    private Session session = null;
    private Channel channel = null;
    private ChannelSftp c = null;

    public SftpClient(String server, int port, String login, String password) {
        this.server = server;
        this.port = port;
        this.login = login;
        this.password = password;
    }

    /**
     * Connects to the server and does some commands.
     */
    private void connect() {
        try {
            logger.debug("Initializing jsch");
            JSch jsch = new JSch();
            session = jsch.getSession(login, server, 22);
            // Java 6 version
            session.setPassword(password.getBytes(Charset.forName("ISO-8859-1")));


            logger.debug("Jsch set to StrictHostKeyChecking=no");
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

            logger.info("Connecting to " + server + ":" + port);
            session.connect();
            logger.info("Connected !");

            // Initializing a channel
            logger.debug("Opening a channel ...");
            channel = session.openChannel("sftp");
            channel.connect();
            c = (ChannelSftp) channel;

            logger.debug("Channel sftp opened");
        } catch (JSchException e) {
            logger.error("", e);
        }
    }

    /**
     * Uploads a file to the sftp server
     *
     * @param sourceFile      String path to sourceFile
     * @param destinationFile String path on the remote server
     * @throws Exception if connection and channel are not available or if an error
     *                   occurs during upload.
     */
    public void uploadFile(String sourceFile, String destinationFile) throws Exception {
        if (c == null || session == null || !session.isConnected() || !c.isConnected()) {
            throw new Exception("Connection to server is closed. Open it first.");
        }

        try {
            logger.debug("Uploading file to server");
            c.put(sourceFile, destinationFile);
            logger.info("Upload successfull.");
        } catch (SftpException e) {
            throw new Exception(e);
        }
    }

    /**
     * Retrieves a file from the sftp server
     *
     * @param destinationFile String path to the remote file on the server
     * @param sourceFile      String path on the local fileSystem
     * @throws Exception if connection and channel are not available or if an error
     *                   occurs during download.
     */
    public void downloadFile(String sourceFile, String destinationFile) throws Exception {
        if (c == null || session == null || !session.isConnected() || !c.isConnected()) {
            throw new Exception("Connection to server is closed. Open it first.");
        }
        try {
            logger.debug("Downloading file to server");
            c.get(sourceFile, destinationFile);
            logger.info("Download successfull.");
        } catch (SftpException e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    public void deleteFile(String sourceFile) throws Exception {
        if (c == null || session == null || !session.isConnected() || !c.isConnected()) {
            throw new Exception("连接异常");
        }
        try {
            c.rm(sourceFile);
            logger.info("删除成功.");
        } catch (SftpException e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    /**
     * 获取目录下的所有文件
     *
     * @param sourceFile 指定目录
     * @return 文件明名集合
     * @throws Exception 异常
     */
    @SuppressWarnings("unchecked")
    public List<String> listFile(String sourceFile) throws Exception {
        List<String> list = new ArrayList<>();
        if (c == null || session == null || !session.isConnected() || !c.isConnected()) {
            throw new Exception("连接异常");
        }
        try {
            Vector<ChannelSftp.LsEntry> ls = c.ls(sourceFile);
            for (ChannelSftp.LsEntry next : ls) {
                if (!"..".equals(next.getFilename()) && !".".equals(next.getFilename())) {
                    list.add(next.getFilename());
                }
            }
            return list;
        } catch (SftpException e) {
            throw new Exception(e.getMessage(), e);
        }
    }


    private void disconnect() {
        if (c != null) {
            logger.debug("Disconnecting sftp channel");
            c.disconnect();
        }
        if (channel != null) {
            logger.debug("Disconnecting channel");
            channel.disconnect();
        }
        if (session != null) {
            logger.debug("Disconnecting session");
            session.disconnect();
        }
    }


    public static void main(String[] args) {
        String server = "111.205.128.7";
        int port = 22;
        String login = "sjdq";
        String pwd = "sjdq@GAB";
        SftpClient client = new SftpClient(server, port, login, pwd);
        client.connect();
        try {
            List<String> ls = client.listFile("/下发/SJDQ_001/");
            System.out.println(ls);
        } catch (Exception e) {
            logger.error("", e);
        } finally {
            client.disconnect();
        }
    }

    public SftpClient() {
    }
}

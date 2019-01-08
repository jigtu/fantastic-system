package com.anti.common.util;

import java.awt.Image;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ZiQiang
 */
public class Base64Util {
    private static Logger logger = LoggerFactory.getLogger(Base64Util.class);

    /**
     * 根据图片路径对图片进行BASE64编码
     *
     * @param imgFilePath 图片文件所在路径
     * @return 图片的base64编码字符串
     */
    public static String getImageStr(String imgFilePath) {
        if (imgFilePath == null || ("").equals(imgFilePath)) {
            return null;
        }
        byte[] data;
        InputStream in = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(imgFilePath);
            data = IOUtils.toByteArray(in);
        } catch (IOException e) {
            logger.error("异常：" + e);
            return null;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                logger.error("异常：" + e);
            }
        }
        // 对字节数组Base64编码
        return Base64.encodeBase64String(data);
    }

    /**
     * 对BASE64字符串解码并保存成文件
     *
     * @param imgStr      base64编码的字符串
     * @param imgFilePath 保存图片的文件路径
     * @return 成功或失败
     */
    public static boolean generateImage(String imgStr, String imgFilePath) {
        if (imgStr == null || ("").equals(imgStr)
                || imgFilePath == null || ("").equals(imgFilePath)) {
            return false;
        }
        OutputStream out = null;
        BufferedOutputStream bos = null;
        try {
            // Base64解码
            byte[] bytes = Base64.decodeBase64(imgStr);
            // 生成jpeg图片
            out = new FileOutputStream(imgFilePath);
            bos = new BufferedOutputStream(out);
            // 使用缓冲区写二进制字节数据
            bos.write(bytes);
            return true;
        } catch (Exception e) {
            logger.error("异常：" + e);
            return false;
        } finally {
            try {
                if (out != null && bos != null) {
                    out.close();
                    bos.close();
                }
            } catch (IOException e) {
                logger.error("异常：" + e);
            }
        }
    }

    /**
     * 对BASE64字符串解码并保存成字节数组
     *
     * @param imgStr base64编码的字符串
     * @return 返回Base64解码后的字节数组
     */
    public static byte[] generateImageByte(String imgStr) {
        if (imgStr == null || ("").equals(imgStr)) {
            return null;
        }
        try {
            // Base64解码
            byte[] bytes = Base64.decodeBase64(imgStr);
            for (int i = 0, j = bytes.length; i < j; ++i) {
                if (bytes[i] < 0) {
                    bytes[i] += 256;
                }
            }
            return bytes;
        } catch (Exception e) {
            logger.error("异常：" + e);
            return null;
        }
    }

    /**
     * @param str Base64编码的字符串
     * @return byte[]类型的照片信息
     */
    public static byte[] fromBase64(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decodeBase64(str);
    }

    /**
     * @param bytes byte[]类型的照片信息
     * @return Java Image对象。可以直接在java程序中绘制到UI界面
     */
    public static Image getImage(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        Image img = null;
        InputStream isPhoto = null;
        try {
            isPhoto = new ByteArrayInputStream(bytes);
            img = ImageIO.read(isPhoto);
        } catch (IOException e) {
            logger.error("异常：" + e);
        } finally {
            try {
                if (isPhoto != null) {
                    isPhoto.close();
                }
            } catch (IOException e) {
                logger.error("异常：" + e);
            }
        }
        return img;
    }

    /**
     * 对图片进行BASE64编码
     *
     * @param file 图片
     * @return 图片的base64编码字符串
     */
    public static String getImageBase64(MultipartFile file) {
        byte[] data;
        InputStream in = null;
        // 读取图片字节数组
        try {
            in = file.getInputStream();
            data = IOUtils.toByteArray(in);
        } catch (IOException e) {
            return null;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                logger.error("异常：" + e);
            }
        }
        // 对字节数组Base64编码
        return Base64.encodeBase64String(data);
    }
}

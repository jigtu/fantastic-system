package com.anti.common.ljy;

import com.alibaba.fastjson.JSONObject;
import com.anti.common.util.BaseClient;
import com.anti.common.util.Constant;
import com.anti.common.util.JYMD5;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.apache.commons.io.IOUtils;
import org.codehaus.xfire.XFire;
import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.Client;
import org.codehaus.xfire.client.XFireProxy;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.codehaus.xfire.transport.http.CommonsHttpMessageSender;
import org.codehaus.xfire.transport.http.EasySSLProtocolSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * @author ZiQiang
 */
public class FaceRecognition {
    private static Logger logger = LoggerFactory.getLogger(FaceRecognition.class);

    /**
     * 两照对比
     *
     * @param url            url
     * @param strName        strName
     * @param strId          strId
     * @param strPhoto1      strPhoto1
     * @param strPhoto2      strPhoto2
     * @param strTime        strTime
     * @param strLicenseCode strLicenseCode
     * @param strSecretValue strSecretValue
     * @return 对比结果
     */
    public static String compare(String url, String strName, String strId,
                                 String strPhoto1, String strPhoto2, String strTime,
                                 String strLicenseCode, String strSecretValue) {
        String result = null;
        try {
            BaseClient.executeHTTPS();
            Service service = new ObjectServiceFactory()
                    .create(IJYCompareWebservice.class);
            XFire xfire = XFireFactory.newInstance().getXFire();
            XFireProxyFactory factory = new XFireProxyFactory(xfire);
            IJYCompareWebservice mWebService = (IJYCompareWebservice) factory.create(service, url);
            BaseClient.setHttpParams(mWebService);
            result = mWebService.compare(strName, strId, strPhoto1, strPhoto2,
                    strTime, strLicenseCode, JYMD5.md5(strId + strTime
                            + strLicenseCode + strSecretValue, "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 假体验证
     */
    public static String prosthesisCheck(String url, String filePath, String strLicenseCode, String strEncry) {
        try {
            JSONObject json = new JSONObject();
            json.put("type", "28");
            JSONObject paramIn = new JSONObject();
            paramIn.put("license_code", strLicenseCode);
            paramIn.put("time", DateTimeFormatter.ofPattern(Constant.DEFAULT_PATTERN).format(LocalDateTime.now()));
            paramIn.put("strVideo", getStrIdPhoto(filePath));
            String strHeadIn = json.toString();
            String strParamIn = paramIn.toString();
            String strEncryValue = JYMD5.md5(strHeadIn + strParamIn + strEncry, "UTF-8");
            return client(url, strHeadIn, strParamIn, strEncryValue);
        } catch (Exception e) {
            logger.error("识别失败：" + e);
            // throw new RuntimeException(e.getMessage())
            return null;
        }
    }

    /**
     * 根据文件地址，将文件转换为base64编码返回
     *
     * @param fileName 文件地址
     * @return 结果
     */
    private static String getStrIdPhoto(String fileName) {
        byte[] buffer;
        try {
            File file = new File(fileName);
            FileInputStream inputStream = new FileInputStream(file);
            buffer = IOUtils.toByteArray(inputStream);
            return Base64.encodeBase64String(buffer).replaceAll("\r", "").replaceAll("\n", "");
        } catch (IOException e) {
            logger.info("异常" + e);
        }
        return null;
    }

    /**
     * 发起xfire链接
     *
     * @param seviceUrl     链接名
     * @param strHeadIn     strHeadIn
     * @param strParamIn    strParamIn
     * @param strEncryValue strEncryValue
     * @return 结果
     */
    private static String client(String seviceUrl, String strHeadIn, String strParamIn, String strEncryValue) {
        String result = null;
        try {
            // 此为支持Xfire HTTPS的代码实现
            ProtocolSocketFactory easy = new EasySSLProtocolSocketFactory();
            Protocol protocol = new Protocol("https", easy, 543);
            Protocol.registerProtocol("https", protocol);

            Service service = new ObjectServiceFactory().create(IJYWebservice.class);

            XFire xfire = XFireFactory.newInstance().getXFire();
            XFireProxyFactory factory = new XFireProxyFactory(xfire);
            IJYWebservice client = (IJYWebservice) factory.create(service, seviceUrl);

            HttpClientParams params = new HttpClientParams();
            params.setParameter(HttpClientParams.USE_EXPECT_CONTINUE, Boolean.FALSE);
            params.setParameter(HttpClientParams.CONNECTION_MANAGER_TIMEOUT, 60000L);
            params.setParameter(HttpClientParams.SO_TIMEOUT, 60000);

            Client xfireClient = ((XFireProxy) Proxy.getInvocationHandler(client)).getClient();
            xfireClient.setProperty(CommonsHttpMessageSender.HTTP_CLIENT_PARAMS, params);

            result = client.method(strHeadIn, strParamIn, strEncryValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    interface IJYWebservice {
        /**
         * 两照对比
         *
         * @param strHeadIn     strHeadIn
         * @param strParamIn    strParamIn
         * @param strEncryValue strEncryValue
         * @return 对比结果
         * @throws Exception 异常
         */
        String method(String strHeadIn, String strParamIn, String strEncryValue) throws Exception;
    }
}

package com.anti.common.util;


import com.alibaba.fastjson.JSONObject;
import com.anti.common.ljy.FaceRecognition;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * 赛福特相关的接口：人脸对比，ocr识别
 *
 * @author ZiQiang
 */
public class SaiFuTeUtil {

    private static Logger logger = LoggerFactory.getLogger(SaiFuTeUtil.class);

    /**
     * 调用赛福特人脸比对接口
     *
     * @param compareUrl     对比接口
     * @param compare2Key    接口key
     * @param compare2Secret 接口安全码
     * @param frontBase64    证件照base64编码
     * @param photoBase64    照片
     * @return code
     */
    public static Integer faceComparison(String compareUrl, String compare2Key, String compare2Secret, String frontBase64, String photoBase64) {
        String comparaResult = FaceRecognition.compare(
                compareUrl,
                null,
                null,
                frontBase64,
                photoBase64,
                DateTimeFormatter.ofPattern(Constant.DEFAULT_PATTERN).format(LocalDateTime.now()),
                compare2Key,
                compare2Secret);
        JSONObject comparaObject = JSONObject.parseObject(comparaResult);
        Integer comparaCode = (Integer) comparaObject.get("code");
        System.out.println("赛福特人脸对比返回结果：" + comparaCode);
        return comparaCode;
    }
    /**
     * 赛弗特 OCR识别
     *
     * @param url         接口地址
     * @param inputStream 输入流
     * @return 识别结果
     */
   /* public static Map<String, String> ocrDiscern(String url, InputStream inputStream) {
        Map<String, String> map = new HashMap<>(2);
        try {
            RPCServiceClient serviceClient = new RPCServiceClient();
            serviceClient.getOptions().setTimeOutInMilliSeconds(600000L);
            Options options = serviceClient.getOptions();
            EndpointReference targetEPR = new EndpointReference(url);
            options.setTo(targetEPR);
            options.setAction("getOcrResult");
            byte[] b = new byte[inputStream.available()];
            int i = inputStream.read(b);
            Object[] opAddEntryArgs = new Object[]{b};
            Class<?>[] classes = new Class[]{String.class};
            QName opAddEntry = new QName("http://njsafety.com", "getOcrResult");
            Object result = serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0];
            if (result != null && !"".equals(result)) {
                if (result.toString().contains("-ERR")) {
                    logger.error("ocr识别出现异常：" + result);
                    System.out.println("ocr识别出现异常：" + result);
                    map.put("people_name", "");
                    map.put("people_idCard", "");
                } else {
                    String[] strings = result.toString().split(",");
                    map.put("people_name", strings[0]);
                    map.put("people_idCard", strings[strings.length - 2]);
                }
            } else {
                map.put("people_name", "");
                map.put("people_idCard", "");
            }
        } catch (Exception e) {
            logger.error("异常:" + e);
            System.out.println("异常:" + e);
        }
        return map;
    }*/

    /**
     * 赛弗特 OCR识别
     *
     * @param url   接口地址
     * @param bytes byte[] 输入流
     * @return 识别结果
     */
    public static Map<String, String> ocrDiscern(String url, byte[] bytes) {
        Map<String, String> map = new HashMap<>(2);
        try {
            RPCServiceClient serviceClient = new RPCServiceClient();
            serviceClient.getOptions().setTimeOutInMilliSeconds(600000L);
            Options options = serviceClient.getOptions();
            EndpointReference targetEPR = new EndpointReference(url);
            options.setTo(targetEPR);
            options.setAction("getOcrResult");
            Object[] opAddEntryArgs = new Object[]{bytes};
            Class<?>[] classes = new Class[]{String.class};
            QName opAddEntry = new QName("http://njsafety.com", "getOcrResult");
            Object result = serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0];
            if (result != null && !"".equals(result)) {
                if (result.toString().contains("-ERR")) {
                    logger.error("ocr识别出现异常：" + result);
                    System.out.println("ocr识别出现异常：" + result);
                    map.put("people_idCard", "");
                    map.put("people_name", "");
                } else {
                    String[] strings = result.toString().split(",");
                    map.put("people_name", strings[0]);
                    map.put("people_idCard", strings[strings.length - 2]);
                }
            } else {
                map.put("people_name", "");
                map.put("people_idCard", "");
            }
        } catch (Exception e) {
            logger.error("异常:" + e);
            System.out.println("异常:" + e);
        }
        return map;
    }

    /**
     * IMEI ocr识别
     *
     * @param url         请求接口地址
     * @param inputStream 图片输入流
     * @return 识别结果
     */
   /* public static String imeiDiscern(String url, InputStream inputStream) {
        String result = "";
        try {
            RPCServiceClient serviceClient = new RPCServiceClient();
            serviceClient.getOptions().setTimeOutInMilliSeconds(600000L);
            Options options = serviceClient.getOptions();
            EndpointReference targetEPR = new EndpointReference(url);
            options.setTo(targetEPR);
            options.setAction("getOcrResult");
            byte[] b = new byte[inputStream.available()];
            int i = inputStream.read(b);
            Object[] opAddEntryArgs = new Object[]{b};
            Class<?>[] classes = new Class[]{String.class};
            QName opAddEntry = new QName("http://ocr.njsafety.com", "getOcrResult");
            Object object = serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0];
            if (!"".equals(object) && object != null) {
                result = object.toString();
                if (result.contains("-ERR")) {
                    logger.error("ocr识别出现异常、异常代码：" + result);
                    System.out.println("ocr识别出现异常、异常代码：" + result);
                }
            }
        } catch (Exception e) {
            logger.error("异常" + e);
            System.out.println("异常" + e);
        }
        return result;
    }*/

    /**
     * IMEI ocr识别
     *
     * @param url   请求接口地址
     * @param bytes 图片字节流
     * @return 识别结果
     */
    public static String imeiDiscern(String url, byte[] bytes) {
        String result = "";
        try {
            RPCServiceClient serviceClient = new RPCServiceClient();
            serviceClient.getOptions().setTimeOutInMilliSeconds(600000L);
            Options options = serviceClient.getOptions();
            EndpointReference targetEPR = new EndpointReference(url);
            options.setTo(targetEPR);
            options.setAction("getOcrResult");
            Object[] opAddEntryArgs = new Object[]{bytes};
            Class<?>[] classes = new Class[]{String.class};
            QName opAddEntry = new QName("http://ocr.njsafety.com", "getOcrResult");
            Object object = serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0];
            if (!"".equals(object) && object != null) {
                result = object.toString();
                if (result.contains("-ERR")) {
                    System.out.println("ocr识别出现异常、异常代码：" + result);
                    logger.error("ocr识别出现异常、异常代码：" + result);
                }
            }
        } catch (Exception e) {
            logger.error("异常" + e);
            System.out.println("异常" + e);
        }
        return result;
    }
}

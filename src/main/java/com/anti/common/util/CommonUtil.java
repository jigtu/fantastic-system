package com.anti.common.util;

import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CommonUtil {

    private static Logger logger = LoggerFactory.getLogger(CommonUtil.class);

    public static void main(String[] args) {
        try {
            String getImageStr = Base64Util.getImageStr("E:/photo/back.jpg");
            System.out.println(getImageStr);
            byte[] fromBase64 = Base64Util.fromBase64(getImageStr);
            InputStream inputStream = new ByteArrayInputStream(fromBase64);
            FtpUtils f = new FtpUtils.Builder("123.207.236.103", 21).userName("ZiQiang").pwd("123456").build();
            f.open();
            f.uploadInputStream(inputStream, "test.jpg", "test" + "/" + 8);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void uploadPhotoToFtp(String server, int port, String userName,
                                        String password, String id, String photoBase64, String model, String ftpFileName) {
        try {
            //Base64编码转换为字节数组
            byte[] bytes = Base64Util.fromBase64(photoBase64);
            //字节数组转换成文件输入流
            InputStream inputStream = new ByteArrayInputStream(bytes);
            FtpUtils f = new FtpUtils.Builder(server, port).userName(userName).pwd(password).build();
            if (f.open()) {
                boolean flag = f.uploadInputStream(inputStream, ftpFileName, model + "/" + id);
                System.out.println("是否操作成功：" + flag);
                f.close();
            }

        } catch (Exception e) {
            logger.error("异常：" + e);
        }
    }


    /**
     * 通过五粮液接口请求邢专接口
     *
     * @param url    请求接口地址
     * @param params 请求参数
     * @return 返回结果
     */
    public static String wuLiangYe(String url, String params) {
        OkHttpClient client = new OkHttpClient();
        MediaType json = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = FormBody.create(json, params);
        Request build = new Request.Builder().url(url).post(body).build();
        Call call = client.newCall(build);
        try {
            Response response = call.execute();
            Integer succCode = 200;
            if (response.code() == succCode) {
                assert response.body() != null;
                return response.body().string();
            }
        } catch (Exception e) {
            logger.error("异常：" + e);
        }
        return null;
    }
}

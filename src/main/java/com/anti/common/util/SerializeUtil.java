package com.anti.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化 反序列化工具
 *
 * @author ZiQiang
 */
public class SerializeUtil {

    private static Logger logger = LoggerFactory.getLogger(SerializeUtil.class);
    /**
     * 序列化
     *
     * @param object 待系列化的对象
     * @return byte 数组
     */
    public static byte[] serialize(Object object) {
        ObjectOutputStream outputStream;
        ByteArrayOutputStream baOutputStream;
        try {
            // 序列化
            baOutputStream = new ByteArrayOutputStream();
            outputStream = new ObjectOutputStream(baOutputStream);
            outputStream.writeObject(object);
            return baOutputStream.toByteArray();
        } catch (Exception e) {
            logger.error("序列化失败：" + e);
        }
        return null;
    }

    /**
     * 反序列化
     *
     * @param bytes 反序列化byte数组
     * @return Object对象
     */
    public static Object unSerialize(byte[] bytes) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            // 反序列化
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
            return ois.readObject();
        } catch (Exception e) {
            logger.error("反序列化失败：" + e);
        }
        return null;
    }
}

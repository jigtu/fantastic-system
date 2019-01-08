package com.anti.common.util;

import java.security.MessageDigest;


/**
 * @author ZiQiang
 */
public class JYMD5 {

    public final static String md5(String s, String charset) {
        try {
            byte[] btInput = s.getBytes(charset);
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            StringBuilder sb = new StringBuilder(40);
            for (byte x : md) {
                if ((x & 0xff) >> 4 == 0) {
                    sb.append("0").append(Integer.toHexString(x & 0xff));
                } else {
                    sb.append(Integer.toHexString(x & 0xff));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }
}

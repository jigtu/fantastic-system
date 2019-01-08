package com.anti.common.util;

import java.lang.reflect.Proxy;

import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.codehaus.xfire.client.Client;
import org.codehaus.xfire.client.XFireProxy;
import org.codehaus.xfire.transport.http.CommonsHttpMessageSender;
import org.codehaus.xfire.transport.http.EasySSLProtocolSocketFactory;

/**
 * @author ZiQiang
 */
public class BaseClient {

    private static final int TIME_OUT_DEFAULT = 1000 * 60;

    /**
     * 支持Xfire HTTPS的代码实现
     */
    public static void executeHTTPS() {
        ProtocolSocketFactory easy = new EasySSLProtocolSocketFactory();
        Protocol protocol = new Protocol("https", easy, 443);
        Protocol.registerProtocol("https", protocol);
    }

    public static void setHttpParams(Object interfaceService) {
        setHttpParams(interfaceService, TIME_OUT_DEFAULT);
    }

    /**
     * 设置读取超时事件
     *
     * @param interfaceService 接口名
     * @param iReadTimeOut     超时时间,单位毫秒
     */
    public static void setHttpParams(Object interfaceService, int iReadTimeOut) {
        Client xfireClient = ((XFireProxy) Proxy.getInvocationHandler(interfaceService)).getClient();
        HttpClientParams params = new HttpClientParams();
        params.setBooleanParameter(HttpClientParams.USE_EXPECT_CONTINUE, Boolean.FALSE);
        params.setIntParameter(HttpClientParams.SO_TIMEOUT, iReadTimeOut);
        xfireClient.setProperty(CommonsHttpMessageSender.DISABLE_KEEP_ALIVE, "1");
        xfireClient.setProperty(CommonsHttpMessageSender.DISABLE_EXPECT_CONTINUE, "1");
        xfireClient.setProperty(CommonsHttpMessageSender.HTTP_CLIENT_PARAMS, params);
    }
}

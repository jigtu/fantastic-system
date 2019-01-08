package com.anti.common.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.time.Clock;

/**
 * 公共返回结果
 *
 * @author ZiQiang
 */
public class BaseResponse implements Serializable {
    private static Logger logger = LoggerFactory.getLogger(BaseResponse.class);
    private final Integer code;
    private final Object data;
    private final Object desc;
    private final Long time;

    private BaseResponse(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.desc = builder.desc;
        this.time = builder.time;
    }

    public static class Builder {
        /**
         * 时间为当前时钟
         */
        private final Long time = Clock.systemUTC().millis();
        /**
         * success code： 200 fail code：300
         */
        private final Integer code;

        private final Object desc;

        private Object data;

        public Builder(Object desc, Integer code) {
            Integer minCode = 300;
            if ("".equals(desc) || desc == null) {
                logger.warn("Please add a description");
                desc = "Please add a description";
            }
            if (code < minCode) {
                code = 300;
            }
            this.code = code;
            this.desc = desc;
        }

        public BaseResponse.Builder data(Object data) {
            this.data = data;
            return this;
        }

        public BaseResponse build() {
            return new BaseResponse(this);
        }
    }

    public Integer getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public Object getDesc() {
        return desc;
    }

    public Long getTime() {
        return time;
    }
}

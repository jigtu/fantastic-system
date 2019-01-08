package com.anti.theft.handler;

import com.anti.common.entity.BaseResponse;
import org.springframework.beans.factory.annotation.Value;


/**
 * BaseHandler
 *
 * @author ZiQiang
 * 2017-04-28
 */
public class BaseHandler {
    /**
     * 两照比对
     */
    @Value("${compare2.key}")
    public String compare2Key;
    @Value("${compare2.secret}")
    public String compare2Secret;

    @Value("${compare.url}")
    public String compareUrl;

    /**
     * 身份证OCR
     */
    @Value("${ocr.url}")
    public String ocrUrl;

    /**
     * imei 识别URL
     */
    @Value("${imei.url}")
    public String imeiUrl;

    @Value("${prosthesis.key}")
    public String prosthesisKey;

    @Value("${prosthesis.secret}")
    public String prosthesisSecret;

    @Value("${prosthesis.url}")
    public String prosthesisUrl;

    /**
     * 成功 和 错误代码
     */
    private static final Integer SUCC_CODE = 200;

    private static final Integer FAIL_CODE = 200;

    BaseResponse ajaxSucc(Object data, Object desc) {
        return new BaseResponse.Builder(desc, SUCC_CODE).data(data).build();
    }

    BaseResponse ajaxFail(Object desc) {
        return new BaseResponse.Builder(desc, FAIL_CODE).build();
    }

    @Value("${file.uploadPath}")
    protected String uploadPath;

    /**
     * 上传的文件大小
     */
    protected Integer size = 15 * 1024 * 1024;
    String reg = "[0-9]+";

    Integer imeiMinLength = 15;
    Integer imeiMaxLength = 15;
    String[] videoFormat = new String[]{".mp4", ".avi", ".wav"};

    Integer phoneLength = 11;
    Integer idCardLength = 18;
    /**
     * 案件撤销
     */
    String backout = "backout";
    /**
     * 图片
     */
    String photo = "photo";
    /**
     * 报警信息
     */
    String alarm = "alarm";
    /**
     * 申诉信息
     */
    String appeal = "appeal";
    /**
     * 反面
     */
    String back = "back";
    /**
     * 正面
     */
    String front = "front";

    /**
     * 案件提取
     */
    String extract = "extract";
}

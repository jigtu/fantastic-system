package com.anti.common.ljy;

public interface IJYCompareWebservice {

    /**
     * 两照比对
     *
     * @param strName        strName
     * @param strId          strId
     * @param strPhoto1      strPhoto1
     * @param strPhoto2      strPhoto2
     * @param strTime        strTime
     * @param strLicenseCode strLicenseCode
     * @param strEncryValue  strEncryValue
     * @return 结果
     * @throws Exception 异常
     */
    String compare(String strName, String strId, String strPhoto1,
                   String strPhoto2, String strTime, String strLicenseCode,
                   String strEncryValue) throws Exception;
}
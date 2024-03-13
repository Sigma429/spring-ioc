package com.sigma429.framework.utils;

/**
 * ClassName:StringUtils
 * Package:com.sigma429.framework.utils
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/13 - 20:23
 * @Version:v1.0
 */
public class StringUtils {
    private StringUtils() {

    }

    // userDao   ==>   setUserDao
    public static String getSetterMethodByFieldName(String fieldName) {
        String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        return methodName;
    }
}

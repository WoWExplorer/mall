package com.mall.utils;

import java.util.regex.Pattern;

/**
 * 校验工具
 */
public class ValidatorUtils {
    // 手机号码校验（简单示例，适用于中国）
    private static final String MOBILE_PATTERN = "^1[3-9]\\d{9}$";

    // 身份证号码校验（简单示例，适用于中国）
    private static final String ID_CARD_PATTERN = "^(\\d{15}|\\d{18}|\\d{17}[Xx])$";

    // 邮箱校验
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";

    // 中国姓名校验（只包含中文字符）
    private static final String CHINESE_NAME_PATTERN = "^[\\u4e00-\\u9fa5]{2,4}$";

    // 密码校验
    // 低强度：至少6位
    private static final String PASSWORD_WEAK_PATTERN = "^.{6,}$";
    // 中等强度：至少6位，包含字母和数字
    private static final String PASSWORD_MEDIUM_PATTERN = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$";
    // 高强度：8-32位，包含大写字母、小写字母、数字，不包含空格
    private static final String PASSWORD_STRONG_PATTERN = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

    public static boolean isMobileValid(String mobile) {
        return Pattern.matches(MOBILE_PATTERN, mobile);
    }

    public static boolean isIdCardValid(String idCard) {
        return Pattern.matches(ID_CARD_PATTERN, idCard);
    }

    public static boolean isEmailValid(String email) {
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    public static boolean isChineseNameValid(String name) {
        return Pattern.matches(CHINESE_NAME_PATTERN, name);
    }

    public static boolean isPasswordWeakValid(String password) {
        return Pattern.matches(PASSWORD_WEAK_PATTERN, password);
    }

    public static boolean isPasswordMediumValid(String password) {
        return Pattern.matches(PASSWORD_MEDIUM_PATTERN, password);
    }

    public static boolean isPasswordStrongValid(String password) {
        return Pattern.matches(PASSWORD_STRONG_PATTERN, password);
    }

}

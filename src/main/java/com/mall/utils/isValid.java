package com.mall.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isValid {
    // 正则表达式
    private static final String IMAGE_URL_PATTERN = "^(.*\\.(?:png|jpg|jpeg|gif))$";

    public static boolean isValidImageUrl(String url) {
        Pattern pattern = Pattern.compile(IMAGE_URL_PATTERN, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // 测试
        String url1 = "/imagepng";
        String url2 = "https://example.com/image.jpg";
        String url3 = "https://example.com/image.jpeg";
        String url4 = "https://example.com/image.gif";
        String url5 = "https://example.com/image.pdf";

        System.out.println(isValidImageUrl(url1)); // true
        System.out.println(isValidImageUrl(url2)); // true
    }
}


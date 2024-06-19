package com.mall.utils;

import java.util.Random;

public class WOWNicknameGenerator {

    // 一些WOW相关的中文前缀和后缀
    private static final String[] PREFIXES = {
            "暗影", "烈焰", "寒冰", "光明", "黑暗", "钢铁", "血色", "火焰", "雷霆", "银色"
    };

    // 更多的WOW相关的中文后缀
    private static final String[] SUFFIXES = {
            "使者", "之怒", "打击", "之歌", "之刃", "之心", "之风", "之星", "之盾", "之焰"
    };

    // 随机数生成器
    private static final Random RANDOM = new Random();

    public static String generateWOWNickname() {
        String prefix = PREFIXES[RANDOM.nextInt(PREFIXES.length)];
        String suffix = SUFFIXES[RANDOM.nextInt(SUFFIXES.length)];
        int number = RANDOM.nextInt(1000); // 为确保唯一性，添加一个随机数字
        return prefix + suffix + number;
    }
}

package com.mall.enums;

/**
 * 时长枚举
 */
public enum DurationEnum {
    // 秒
    SECONDS_30 (30, "30秒"),
    SECONDS_60 (60, "60秒"),
    SECONDS_90 (90, "90秒"),

    // 分钟
    MINUTES_1 (60, "1分钟"),
    MINUTES_5 (300, "5分钟"),
    MINUTES_10 (600, "10分钟"),
    MINUTES_15 (900, "15分钟"),
    MINUTES_30 (1800, "30分钟"),

    // 小时
    HOURS_1 (3600, "1小时"),
    HOURS_2 (7200, "2小时"),
    HOURS_4 (14400, "4小时"),
    HOURS_8 (28800, "8小时"),
    HOURS_12 (43200, "12小时"),
    HOURS_24 (86400, "24小时"),

    // 天
    DAYS_1 (86400, "1天"),
    DAYS_2 (172800, "2天"),
    DAYS_3 (259200, "3天"),
    DAYS_7 (604800, "7天"),
    DAYS_14 (1209600, "14天"),
    DAYS_30 (2592000, "30天"),

    // 月
    MONTHS_1 (2592000, "1个月"),
    MONTHS_3 (7776000, "3个月"),
    MONTHS_6 (15552000, "6个月"),

    // 年
    YEARS_1 (31536000, "1年");

    private final int seconds;
    private final String description;

    DurationEnum(int seconds, String description) {
        this.seconds = seconds;
        this.description = description;
    }

    public int getSeconds() {
        return seconds;
    }

    public String getDescription() {
        return description;
    }
}

package com.mall.enums;


public enum ResultCodeEnum {
    CODE_200 (200, "请求成功"),
    CODE_400 (400, "请求参数错误"),
    CODE_401 (401, "未授权"),
    CODE_403 (403, "禁止访问"),
    CODE_404 (404, "请求资源不存在"),
    CODE_500 (500, "服务器内部错误"),
    CODE_503 (503, "服务器暂时不可用"),
    CODE_600 (600, "请求超时"),
    CODE_601 (601, "请求被拒绝");

    private Integer code;

    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}

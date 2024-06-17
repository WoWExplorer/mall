package com.mall.entity.vo;


/**
 *  @Description: Mapper
 *  @Author: 王同學
 *  @Date: 2024年05月17日
 */
public class ResultVo<T> {
    private int code;
    private String message;
    private T  data;
    private static  <T> ResultVo<T> buildResult(int code, T data, String message) {
        ResultVo<T> result = new ResultVo<>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> ResultVo<T> success(String massage) {
        return buildResult(200, null, massage);
    }
    public static <T> ResultVo<T> success(T data, String massage) {
        return buildResult(200, data, massage);
    }
    public static <T> ResultVo<T> success(T data) {
        return buildResult(200, data, "查询成功");
    }

    public static <T> ResultVo<T> success(int code, String massage) {
        return buildResult(code, null, massage);
    }

    public static <T> ResultVo<T> success(int code, T data, String massage) {
        return buildResult(code, data, massage);
    }


    public static <T> ResultVo<T> fail() {
        return buildResult(400, null, "接口异常");
    }

    public static <T> ResultVo<T> fail(int code, String massage) {
        return buildResult(code, null, massage);
    }
    public static <T> ResultVo<T> fail(String massage) {
        return buildResult(101, null, massage);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

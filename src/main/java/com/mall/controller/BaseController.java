package com.mall.controller;

import com.mall.entity.vo.ResultVo;
import com.mall.enums.ResultCodeEnum;

public class BaseController {
    protected static final String STATUS_SUCCESS = "success";
    protected static final String STATUS_ERROR = "error";

    protected <T> ResultVo<T> getSuccessResultVo(T data) {
        ResultVo<T> resultVo = new ResultVo<>();
        resultVo.setMessage(STATUS_SUCCESS);
        resultVo.setCode(ResultCodeEnum.CODE_200.getCode());
        resultVo.setData(data);
        return resultVo;
    }
}

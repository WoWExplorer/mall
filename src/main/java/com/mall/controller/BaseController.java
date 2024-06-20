package com.mall.controller;

import com.mall.entity.vo.ResultVo;
import com.mall.enums.ResultCodeEnum;

public class BaseController {
    protected <T> ResultVo<T> getSuccessResultVo(T data) {
        return ResultVo.success( ResultCodeEnum.CODE_200.getCode(), data, ResultCodeEnum.CODE_200.getMessage());
    }
}

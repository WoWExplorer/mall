package com.mall.handler;

import com.mall.controller.BaseController;
import com.mall.entity.vo.ResultVo;
import com.mall.enums.ResultCodeEnum;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandlerController extends BaseController {

    // 全局异常处理
//    @ExceptionHandler(value = Exception.class)
//    Object handleException(Exception e, HttpServletRequest request){
//        ResultVo resultVo = new ResultVo();
//        if (e instanceof NoHandlerFoundException) {
//            resultVo.setCode(ResultCodeEnum.CODE_404.getCode());
//            resultVo.setMessage(ResultCodeEnum.CODE_404.getMessage());
//        } else if(e instanceof RuntimeException) {
//            resultVo.setCode(ResultCodeEnum.CODE_400.getCode());
//            resultVo.setMessage(ResultCodeEnum.CODE_400.getMessage());
//        }
//        return resultVo;
//    }
}

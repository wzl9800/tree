package com.wzl.exceptionHandler;

import com.wzl.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 统一异常处理类
 *
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    /**
     * 自定义异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(GlobalException.class)
    @ResponseBody
    public R error(GlobalException e) {
        e.printStackTrace();
        return R.error().code(e.getCode()).message(e.getMsg());
    }

    /**
     * 全局异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        e.printStackTrace();
        return R.error().code(50000).message("全局异常");
    }


    /**
     * 特殊异常(特定异常)
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e) {
        log.error("异常信息："+e.getMessage());
        e.printStackTrace();
        return R.error().code(50000).message("特殊异常");
    }


}

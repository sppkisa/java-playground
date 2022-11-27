package com.chuan.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author xucy-e
 */
@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler
    public String handle(Throwable e) {
        return "出错啦！";
    }
}

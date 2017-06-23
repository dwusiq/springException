package com.wusiq.Base;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 抛出的异常
 * 异常处理的方法之一：只要Controller中抛出MyException异常的都返回错误码HttpStatus.REQUEST_TIMEOUT
 */
@ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT,reason = "系统繁忙，请稍后重试")
public class MyException extends RuntimeException{
}

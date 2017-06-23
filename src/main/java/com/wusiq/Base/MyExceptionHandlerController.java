package com.wusiq.Base;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理的方法之二：建一个被@ControllerAdvice注解的通知控制器类，这样所有的控制器抛出异常都会被这个类的@ExceptionHandler
 * 注解的方法捕获和处理。
 */
@ControllerAdvice
@ResponseBody//表明这个控制器的所有方法返回的都是字符串，而不是页面
public class MyExceptionHandlerController {
    private static Logger LOGGER =  LoggerFactory.getLogger(MyExceptionHandlerController.class);

    /***
     * 处理异常
     */
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception ex, HttpServletRequest request, HttpServletResponse response){
        LOGGER.warn("捕获到控制器异常",ex);
        Map<String,String> map = new HashMap<>();
        map.put("status","0");
        JSONObject object = JSONObject.fromObject(map);
        String res = object.toString();
        System.out.println(res);
        return res;
    }
}

package com.wusiq.Controller;

import com.wusiq.Base.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

/**
 * 控制器
 */
@ResponseBody
@Controller
@RequestMapping(value = "/loginManage")
public class LoginController {
    private static Logger LOGGER =  LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/doLogin.do",method = RequestMethod.GET)
    public String doLogin(){
        LOGGER.info("开始");
        int i = 0;
        int j = 2;
        try{
            int m = j/i;
        }catch (Exception ex){
            LOGGER.warn("除法计算失败",ex);
            throw new MyException();
        }

        LOGGER.info("结束");
        return "successPage";
    }

    @RequestMapping(value = "/doAdd.do",method = RequestMethod.GET)
    public String doAdd(){
        LOGGER.info("开始");
       int i = 0;
        int j = 2;
        int m = j/i;
        LOGGER.info("结束");
        return "successPage";
    }


    @RequestMapping(value = "/pageChange.do",method = RequestMethod.GET)
    public String pageChange(){
        LOGGER.info("开始");
        LOGGER.info("结束");
        return "successPage";
    }
}

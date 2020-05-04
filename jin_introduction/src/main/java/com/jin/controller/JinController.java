package com.jin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName JinController
 * @program: Jin_SpringBoot
 * @Description: 测试访问类
 * @author: HuangJing
 * @Date: 2020/04/18 16:41
 * @create: 2020-04-18 16:41
 * @version: V1.0
 */
@Controller
public class JinController {
    @RequestMapping("/jin")
    @ResponseBody
    private static String jin(){
        return "我们的爱6656745465874568456784  Jin";
    }
}

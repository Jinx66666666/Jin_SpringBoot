package com.jin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName JinController
 * @program: Jin_SpringBoot
 * @Description: 测试
 * @author: HuangJing
 * @Date: 2020/04/18 21:30
 * @create: 2020-04-18 21:30
 * @version: V1.0
 */
@RestController
public class JinController {

    @Value("${name}")
    private  String name;//获取application.yml中name的配置

    @Value("${Persions.name}")//获取application.yml中Persions的配置
    private String names;

    @RequestMapping("/jinx")
    public static  String jin(){
        return "额大丰收 是打发点发";
    }

    @RequestMapping("/jinxx")
    private String jinx(){
        return name + names;
    }
}

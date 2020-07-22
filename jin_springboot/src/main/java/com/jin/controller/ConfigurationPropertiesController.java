package com.jin.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName ConfigurationPropertiesController
 * @program: Jin_SpringBoot
 * @Description: 使用注解@ConfigurationProperties映射，将配置文件的每一个属性的值，映射到这个组件中，告诉SpringBoot将本类中所有属性和配置文件中相关的配置进行绑定
 * @author: HuangJing
 * @Date: 2020/04/19 0:03
 * @create: 2020-04-19 00:03
 * @version: V1.0
 */
@Controller
@ConfigurationProperties(prefix = "persion")//配置文件中对象下的所有属性进行一一映射
public class ConfigurationPropertiesController {

    private String name;
    private String age;
    private String sex;

    @RequestMapping("/jinxxx")
    @ResponseBody
    public String jin(){
        return name + age + sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

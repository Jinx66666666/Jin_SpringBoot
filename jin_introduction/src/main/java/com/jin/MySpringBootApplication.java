package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @program: Jin_SpringBoot
 * @Description: 引导类
 * @author: HuangJing
 * @Date: 2020/04/18 16:32
 * @create: 2020-04-18 16:32
 * @version: V1.0
 */
@SpringBootApplication//声明该类是SpringBoot的引导类
public class MySpringBootApplication {
//    main方法是java程序的入口
    public static void main(String[] args) {
        //run方法，表示运行SpringBoot的引导类  run参数就是 SpringBoot引导类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }
}

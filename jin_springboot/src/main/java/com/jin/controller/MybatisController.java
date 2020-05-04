package com.jin.controller;

import com.jin.domain.User;
import com.jin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 测试Mapper
 * @author: HuangJing
 * @create: 2020-04-19 01:12
 * @version: V1.0
 */
@RestController
public class MybatisController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/mybatis")
    public List<User> jin(){
        List<User> users = userMapper.queryUserList();
        return users;
    }


}

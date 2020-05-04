package com.jin;

import com.jin.domain.User;
import com.jin.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description: 测试整合Mybatis
 * @author: HuangJing
 * @create: 2020-04-19 01:26
 * @version: V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JinSpringbootQuickApplication.class)
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void  jin(){
        List<User> users = userMapper.queryUserList();
        System.out.println( users);


    }
}

package com.jin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jin.domain.User;
import com.jin.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description: Redis测试
 * @author: HuangJing
 * @create: 2020-04-19 15:43
 * @version: V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JinSpringbootQuickApplication.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private UserRepository userRepository;
    @Test
    public void jin() throws JsonProcessingException {
//        1.从redis中获取数据，数据形式一般是json字符串
        String userListJson = redisTemplate.boundValueOps("user.findAll").get();
//        2.判断redis中是否存在数据
        if (userListJson == null) {
            List<User> all = userRepository.findAll();
//            将查询出的数据存储到Redis缓存中
//            将list集合转换成json格式的字符串  使用Jackson进行转换
            ObjectMapper objectMapper = new ObjectMapper();
            userListJson = objectMapper.writeValueAsString(all);
            redisTemplate.boundValueOps("user.findAll").set(userListJson);
            System.out.println("从数据库中获取 user的数据===========");

        }else {
//        3.如果不存在，从数据库中查询
            System.out.println("从Redis缓存中获取 user数据");
        }
//        4.将数据从控制台打印
        System.out.println(userListJson);
    }
}

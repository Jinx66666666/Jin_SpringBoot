package com.jin;

import com.jin.domain.User;
import com.jin.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description: Jpa测试
 * @author: HuangJing
 * @create: 2020-04-19 15:28
 * @version: V1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JinSpringbootQuickApplication.class)
public class JpaTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void jin(){
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }
}

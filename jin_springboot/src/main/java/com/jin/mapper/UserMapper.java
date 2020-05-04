package com.jin.mapper;

import com.jin.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @program: Jin_SpringBoot
 * @Description: User
 * @author: HuangJing
 * @Date: 2020/04/19 1:06
 * @create: 2020-04-19 01:06
 * @version: V1.0
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}

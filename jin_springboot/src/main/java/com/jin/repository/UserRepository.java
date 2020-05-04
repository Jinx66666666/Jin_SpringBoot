package com.jin.repository;

import com.jin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description: Repository
 * @author: HuangJing
 * @create: 2020-04-19 15:22
 * @version: V1.0
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    public List<User> findAll();


}

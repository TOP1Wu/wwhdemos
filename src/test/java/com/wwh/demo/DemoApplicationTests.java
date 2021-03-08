package com.wwh.demo;

import entity.User;
import mapper.UserMapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
 public class DemoApplicationTests {

 @Autowired
private UserMapper userMapper;
    @Test
  public  void contextLoads() {
       List<User> users= userMapper.selectList(null);
       System.out.println(users);
    }

    @Test
    public void  addUser( ){


    }

}

package com.wwh.demo;

import entity.User;
import lombok.var;
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

    User user=new User();
    user.setId(10L);
        user.setAge(12);
        user.setName("12");
        var row=userMapper.insert(user);
        System.out.println(row);

    }

}

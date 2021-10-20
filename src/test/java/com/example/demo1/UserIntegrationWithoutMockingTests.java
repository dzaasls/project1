/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1;

import com.example.demo1.models.User;
import com.example.demo1.services.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Dell
 */
@SpringBootTest
public class UserIntegrationWithoutMockingTests {
    
    @Autowired
    UserService service;
    
    @Test
    public void createUserTest() throws Exception {
        User user = new User();
        user.setEmail("nonmocking@mail.com");
        user.setName("Non Mocking");
        user.setPassword("123456");
        
        service.register(user);
        User checkUser = service.auth("nonmocking@mail.com", "123456");
        
        Assertions.assertEquals(user.getEmail(), checkUser.getEmail());
    }
}

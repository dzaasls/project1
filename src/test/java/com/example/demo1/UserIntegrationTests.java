/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1;

/**
 *
 * @author Dzakirah Septialisa
 */


import com.example.demo1.models.User;
import com.example.demo1.repositories.UserRepository;
import com.example.demo1.services.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserIntegrationTests {

    @InjectMocks
    @Autowired
    UserService service;

    @Mock
    UserRepository repository;

    @Test
    public void createUserTest() throws Exception {
        User user = new User();
        user.setEmail("test@mail.com");
        user.setName("Test");
        user.setPassword("test-strong-password");

        when(repository.save(user)).thenReturn(user);
        service.register(user);

        when(repository.findByEmail("test@mail.com")).thenReturn(user);

        User checkUser = this.repository.findByEmail("test@mail.com");

        Assertions.assertEquals(user, checkUser);
    }

    @Test
    public void createUserTestWithEmptyName() throws Exception {
        User user = new User();
        user.setEmail("test@mail.com");
        user.setName("");
        user.setPassword("test-strong-password");

        when(repository.save(user)).thenReturn(user);
        service.register(user);

        when(repository.findByEmail("test@mail.com")).thenReturn(user);

        User checkUser = this.repository.findByEmail("test@mail.com");

        Assertions.assertEquals(user, checkUser);
    }

    @Test
    public void createUserTestWithEmptyEmail() throws Exception {
        Throwable e = null;
        String message = null;
  
        try {
            User user = new User();
            user.setEmail("");
            user.setName("Test");
            user.setPassword("test-strong-password");

            when(repository.save(user))
                    .thenThrow(new Exception(e));
            
            service.register(user);
        } catch (Exception ex) {
            e = ex;
            message = ex.getMessage();
        }
        
        Assertions.assertTrue(e instanceof Exception);
        Assertions.assertEquals(e, message);
    }
}


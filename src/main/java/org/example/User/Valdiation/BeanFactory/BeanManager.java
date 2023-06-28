package org.example.User.Valdiation.BeanFactory;

import org.example.User.Valdiation.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

//Remember that bean manager provides you with the data structure you need.
@Configuration
public class BeanManager {

    @Bean
    public List<User> getUserList()
    {
        return new ArrayList<>();
    }
}

package org.example.User.Valdiation.Repository;

import org.example.User.Valdiation.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//Remember that the data structure returned from bean manager will be caught by repo and this will return it to service
@Repository
public class UserRepo {

    @Autowired
    public List<User> userList;

    public List<User> getUserList()
    {
        return userList;
    }
}

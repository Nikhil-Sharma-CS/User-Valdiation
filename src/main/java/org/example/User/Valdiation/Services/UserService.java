package org.example.User.Valdiation.Services;

import org.example.User.Valdiation.Model.User;
import org.example.User.Valdiation.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getUserList()
    {
        return userRepo.getUserList();
    }

    public User getUserByID(Integer id) {
        List<User> originalList = getUserList();

        for(User users : originalList)
        {
            if(users.getUserId().equals(id))
                return users;
        }
        return null;
    }

    public String addUsers(List<User> users) {
        List<User> originalList = getUserList();
        originalList.addAll(users);
        return "Users added";
    }

    public String deleteUser(Integer id) {
        List<User> originalList = getUserList();

        for(User users : originalList)
        {
            if(users.getUserId().equals(id)) {
                originalList.remove(users);
                return "User Removed";
            }
        }
        return "User Not Found";
    }

    public  String updateEmail(Integer id, String email)
    {
        List<User> originalList = getUserList();

        for(User users : originalList)
        {
            if(users.getUserId().equals(id)) {
                users.setUserEmail(email);
                return "Email Updated";
            }
        }
        return "User Not Found";
    }
}

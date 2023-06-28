package org.example.User.Valdiation.Controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.example.User.Valdiation.Model.User;
import org.example.User.Valdiation.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    //Post Mapping to addUser
    @PostMapping("addUsers")
    public String addUsers(@RequestBody @Valid List<User> users)
    {
        return userService.addUsers(users);
    }

    //Get Mapping to get User by ID
    @GetMapping("userByID/{ID}")
    public User getUserByID(@PathVariable @NotNull Integer ID)
    {
        return userService.getUserByID(ID);
    }

    //Get Mapping to get all User
    @GetMapping("users")
    public List<User> getUserList()
    {
        return userService.getUserList();
    }

    //Put Mappings to update user info
    //Updating user email
    @PutMapping("updateEmail/{Id}/{Email}")
    public String updateEmail(@PathVariable @NotNull Integer Id, @PathVariable @Email String Email)
    {
        return  userService.updateEmail(Id, Email);
    }

    //Delete Mapping to delete user
    @DeleteMapping("deleteUser/{Id}")
    public String deleteUser(@PathVariable @Valid Integer Id)
    {
        return userService.deleteUser(Id);
    }
}

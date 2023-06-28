# User Management Validation

This is the code for User Management System which uses various types of **Validation** for **Spring Boot**.

- **Validation** : These are the types of annotation which are used to validate data to a certain type.


## 🚀 About Me
Hi, My name is Nikhil Sharma,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA.


## Data Flow

### Controller
-   This section contains a class named UserController which user functions as mentioned below :

       #### 1. GetMapping("users") : This returns the list of all the users.
       #### 2. GetMapping("userByID/{ID}") : This returns the details of the user by entering its ID in path variable.
       #### 3. @PostMapping("addUsers") : This helps in entering the list of users with their attributes and details.
       #### 4. @PutMapping("updateEmail/{Id}/{Email}") : This helps in updating the Email attribute of a user.
       #### 5 : @DeleteMapping("deleteUser/{ID}") : This deletes the user whose ID is been provided.


### Services
-   This section contains a class UserServices with functions that helps API to perform their specific tasks : 

    #### 1. List<User> getUserList()
    #### 2. User getUserByID(Integer id)
    #### 3. String addUsers(List<User> users)
    #### 4. String deleteUser(Integer id)
    #### 5. String updateEmail(Integer id, String email)
    

###  Repository
-   This section contains a class UserRepo which returns the list of User type.

    #### 1. private List<User>

### Database Design
-   In this section we used a User class to define a particular User  with its attributes like name, Id, email, phonenumber, DOB, etc.


## Data Structure Used

- We used a array list of type users which is used to store different types of Users.
## Summary

This project performs the task of managing user data with various types of API's like **Get, Post, Put, Delete**.

This project shows the implementation of various types of **validations** that are used in **SpringBoot**. Such as **Size()**, **NotNull()**, **Pattern()**, etc.

We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)

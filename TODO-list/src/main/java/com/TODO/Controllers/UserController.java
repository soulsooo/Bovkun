package com.TODO.Controllers;


import com.TODO.Componets.User;
import com.TODO.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TODO.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    TaskService taskService;

    @GetMapping("")
    public List<User> getALL(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getAll(@PathVariable Integer id){
        try{
            User user = userService.getUserById(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/name/{name}")
    public List<User> gettingUsersByName(@PathVariable String name){
        return userService.getUsersByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }


}

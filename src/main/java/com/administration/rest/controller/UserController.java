package com.administration.rest.controller;

import com.administration.rest.domain.User;
import com.administration.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * @author Ehtiram Etibarovich Abdullayev on 21.10.2019
 * @project rest-admin-api
 */
@RequestMapping("/userServices")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = {"application/json"})
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/listUsers")
    public Set<User> getUsers() {
        return userService.listUsers();
    }


    @RequestMapping(value = "/changeUser", method = RequestMethod.PUT, consumes = {"application/json"})
    public User changeUser(User user) {
        return userService.changeUser(user);
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET, produces = {"application/json"})
    public User findUserById(Long id) {
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/deleteUserById", method = RequestMethod.PUT, produces = {"application/json"})
    public User deleteUserById(Long id) {
        return userService.deleteUserById(id);
    }


}

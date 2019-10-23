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

    @RequestMapping(value = "v1/addUser", method = RequestMethod.POST, consumes = {"application/json"})
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "v1/listUsers")
    public Set<User> getUsers() {
        return userService.listUsers();
    }


    @RequestMapping(value = "v1/changeUser", method = RequestMethod.PUT, consumes = {"application/json"})
    public User changeUser(@RequestBody User user) {
        return userService.changeUser(user);
    }

    @RequestMapping(value = "v1/getUserById", method = RequestMethod.GET, produces = {"application/json"})
    public User findUserById(@RequestBody Long id) {
        return userService.findUserById(id);
    }

    @RequestMapping(value = "v1/deleteUserById", method = RequestMethod.PUT, produces = {"application/json"})
    public User deleteUserById(@RequestBody Long id) {
        return userService.deleteUserById(id);
    }


}

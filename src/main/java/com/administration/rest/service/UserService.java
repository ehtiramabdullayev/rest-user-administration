package com.administration.rest.service;

import com.administration.rest.domain.User;
import com.administration.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Ehtiram Etibarovich Abdullayev on 21.10.2019
 * @project rest-admin-api
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User changeUser(User user) {
        return userRepository.save(user);
    }


    public Set<User> listUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.findById(id);
    }

    public User deleteUserById(Long id) {
        return userRepository.deleteById(id);
    }


}

package com.administration.rest.repository;

import com.administration.rest.domain.User;
import com.administration.rest.repository.BasicRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ehtiram Etibarovich Abdullayev on 21.10.2019
 * @project rest-admin-api
 */
public interface UserRepository extends BasicRepository<User, Long> {

}

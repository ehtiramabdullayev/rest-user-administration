package com.administration.rest.repository.map;

import com.administration.rest.domain.User;
import com.administration.rest.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


/**
 * @author Ehtiram Etibarovich Abdullayev on 23.10.2019
 * @project rest-admin-api
 */
@Repository
public class UserMapRepository extends AbstractMapService<User, Long> implements UserRepository {
    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

    @Override
    public User save(User object) {
        return super.save(object);
    }

    @Override
    public void delete(User object) {
        super.delete(object);
    }

    @Override
    public User deleteById(Long id) {
        return super.deleteById(id);
    }
}

package com.administration.rest.repository;

import java.util.Set;

/**
 * @author Ehtiram Etibarovich Abdullayev on 20.10.2019
 * @project rest-admin-api
 */
public interface BasicRepository<T,ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}

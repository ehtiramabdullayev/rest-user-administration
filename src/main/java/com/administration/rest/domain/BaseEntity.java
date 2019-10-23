package com.administration.rest.domain;

import java.io.Serializable;

/**
 * @author Ehtiram Etibarovich Abdullayev on 23.10.2019
 * @project rest-admin-api
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

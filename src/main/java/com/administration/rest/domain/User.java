package com.administration.rest.domain;

import java.io.Serializable;

/**
 * @author Ehtiram Etibarovich Abdullayev on 20.10.2019
 * @project rest-admin-api
 */
public class User extends BaseEntity implements Serializable {
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

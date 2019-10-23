package com.administration.rest.domain;

/**
 * @author Ehtiram Etibarovich Abdullayev on 23.10.2019
 * @project rest-admin-api
 */
public class UserNew extends BaseEntity {
    private String name;
    private String lastName;
    private String state;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

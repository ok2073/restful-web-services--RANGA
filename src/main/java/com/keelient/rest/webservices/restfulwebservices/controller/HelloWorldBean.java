package com.keelient.rest.webservices.restfulwebservices.controller;

import lombok.Data;

@Data
public class HelloWorldBean {
    private final String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}

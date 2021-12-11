package org.exceptionly.demo.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class QuarkusService {

    public String greeting(String name) {
        return "hello " + name;
    }

}
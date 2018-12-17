package com.az.demo;




import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;


@Controller
@RequestScoped
public class HelloWorldBean {
    public String getHello() {
        return "Hello from PrimeFaces and Spring Boot!";
    }

    @PostConstruct
    public void init(){
        System.out.println("Init Method calling...");
    }

    public void search(){
        System.out.println("Search Method calling...");
    }
}
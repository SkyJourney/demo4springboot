package com.example.demo4springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ASUS
 */
@RestController
@RequestMapping("/test")    
public class Test {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}

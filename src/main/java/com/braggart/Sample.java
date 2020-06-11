package com.braggart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class Sample {

    @RequestMapping("/one")
    public String one(){
        return "This is a sample";
    }

    @RequestMapping("/two")
    public String two(){
        return "This is a sample, too";
    }

}

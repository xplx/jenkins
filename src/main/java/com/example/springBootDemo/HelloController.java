package com.example.springBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaopeng
 * @description:
 * @date 2019/12/6 16:31
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(String userName){
        String result = "hello world" + userName;
        return result;
    }
}

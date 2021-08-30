package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // Handles request at path /hello
    @GetMapping("hello") //this method will only accept Get requests
    @ResponseBody //tells our program to accept http requests
    public String hello(){
        return "Hello, Spring!";
    }

    @GetMapping("goodbye") //this method will only accept Get requests
    @ResponseBody //tells our program to accept http requests
    public String goodbye(){
        return "Goodbye, Spring!";
    }
}

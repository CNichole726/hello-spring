package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "post", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloPost(@RequestParam String name, @RequestParam String language){
        if (name == null) {
            name = "World";
        }
        return createMessage(name, language);
    }

    @ResponseBody
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }

    @GetMapping("form")
    public String createForm(){
       return "form";
    }

    @ResponseBody
    @PostMapping("form")
    public static String createMessage(@RequestParam String name, String language){
        String greet = "";

        if(language.equals("english")){
            greet = "Hello";
        } else if (language.equals("french")){
            greet = "Bonjour";
        } else if(language.equals("portuguese")){
            greet = "Ola";
        } else if(language.equals("italian")){
            greet = "Bonjourno";
        } else if(language.equals("spanish")){
            greet = "Hola";
        }
        return greet + " " + name;
    }
}

package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    @RequestMapping(value = "post", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloPost(@RequestParam String name, @RequestParam String language){
        if (name == null) {
            name = "World";
        }
        return createMessage(name, language);
    }

    @GetMapping("form")
    public String createForm(){
        String html =  "<html>" +
                    "<body>" +
                        "<form action='/post' method='post'>" + //submit a request to /hello
                            "<input type = 'text' name= 'name'>" +
                            "<select name ='language' id='language>" +
                                "<option value=' '> --Please choose a language--</option>" +
                                "<option value='french'>French</option>" +
                            "<input type='submit' value='Greet me!'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
        return html;
    }

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

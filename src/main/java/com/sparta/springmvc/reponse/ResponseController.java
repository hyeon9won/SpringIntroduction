package com.sparta.springmvc.reponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reponse")
public class ResponseController {
    // Json 형태를 String 타입으로
    // Content-Type: text/html
    // Response Body
    // {"name":"Robbie", "age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // Content-Type: application/json
    // Response Body
    // {"name":"Robbie", "age":95}
    @GetMapping("/json/class")
    @ResponseBody
    public com.sparta.springmvc.response.Star helloClassJson() {
        return new com.sparta.springmvc.response.Star("Robbie", 95);
    }
}
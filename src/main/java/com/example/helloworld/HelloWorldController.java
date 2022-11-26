package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = {"/hello"})
    public String sayHelloWorld() {
        String responseMsg = "<h1>" + "Hey...Hello World !!" + "</h1>";
        return responseMsg;
    }

    @GetMapping(value = {"/hello/{msg}"})
    public String sayHelloMsg(@PathVariable String msg) {
        String responseMsg = "Hello World";
        try {
            responseMsg = "<h1>" + "Hello " + msg + "</h1>";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMsg;
    }
}

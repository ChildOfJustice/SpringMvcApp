package ru.yuldashev.learning.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/url/to/the/page")
public class LandingPageController {

    @GetMapping("/landingPage")
    public String sayHello(){
        return "some_view";
    } //the name of the view


}

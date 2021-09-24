package com.example.bootsecure.simple.conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {

    @RequestMapping(value="/")
    private String hello(Model model){
    	model.addAttribute("message", "Hello Goodbye!!");
        return "hello";
    }
    
    @RequestMapping(value="/bye", method=RequestMethod.GET)
    private String bye(Model model){
        model.addAttribute("message", "Bye Thymeleaf!!");
        
        return "bye";
    }
    
    @RequestMapping(value="/me")
    private String me(Model model) {
    	model.addAttribute("message", "Modelna Vaccine");
    	
    	return "me";
    }
}
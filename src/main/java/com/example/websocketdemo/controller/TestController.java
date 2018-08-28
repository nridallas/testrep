package com.example.websocketdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	    @GetMapping("/test")
	    public String testMessage() {
	        return "This is a test message";
	    }
}

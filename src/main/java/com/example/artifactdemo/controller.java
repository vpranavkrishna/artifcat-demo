package com.example.artifactdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@GetMapping("/home")
public String home()
{
	return "Welcome to home";
}
}

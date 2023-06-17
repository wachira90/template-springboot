package com.exampleapp.demoapp;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAppController {

@RequestMapping("/")
public String rootpath() 
{
    System.out.println("GET PATH /");
    return "HELLO JAVA SPRING BOOT";
}

@RequestMapping("/login")
public String login() 
{
    System.out.println("GET PATH /login");
    return "HELLO JAVA SPRING BOOT /login";
}

@RequestMapping("/getprod")
public String getprod() 
{
    System.out.println("GET PATH /getprod");
    return "HELLO JAVA SPRING BOOT /getprod";
}
}

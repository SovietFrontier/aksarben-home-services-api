package com.tim.creationsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello-world")
  public String getHelloWorld() {
    return "Greetings from Spring Boot!";
  }
}

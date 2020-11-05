package com.aksarbenhomeservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Slf4j
@RestController
public class HelloController {

  @GetMapping("/hello-world")
  public String getHelloWorld() {
    //    log.info("");
    return "Greetings from Spring Boot!";
  }
}

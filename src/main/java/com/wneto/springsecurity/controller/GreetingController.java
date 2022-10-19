package com.wneto.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @GetMapping("/")
  public String getAll() {
    return "Hello World!";
  }

  @GetMapping("/user")
  public String getUser() {
    return "Hello User!";
  }

  @GetMapping("/admin")
  public String getAdmin() {
    return "Hello Admin";
  }
}

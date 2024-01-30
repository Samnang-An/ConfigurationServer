package com.example.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

  @Value("${greeting}")
  private String greeting;

  @GetMapping("/greeting")
  public String greeting(){
    return greeting;
  }
}

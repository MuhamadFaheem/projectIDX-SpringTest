package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

  @Value("${NAME:World}")
  String name;
  @CrossOrigin(origins = "https://9000-idx-test-1727254965192.cluster-nx3nmmkbnfe54q3dd4pfbgilpc.cloudworkstations.dev") // Allow your frontend origin
  @RestController
  class HelloworldController {
    
    
    @GetMapping("/hellows")
    String hello() {
      return "Helloess " + name + "!";
    }

    @GetMapping("/world")
    String world() {
      return "World!";
    }

    @PostMapping("/greeting")
    String greeting(@RequestBody String name) {
      return "Hello " + name + "!";
    }
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}

package com.jhsolution.pyeongtaek_smartcity.api.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
@Controller
public class HelloController {
  @GetMapping
  public Object hello() {
    return ResponseEntity.status(200).body("Hello World!");
  }
}

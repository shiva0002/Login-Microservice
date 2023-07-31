package com.login.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/sayHello")
    public ResponseEntity<String> sayHello(){
        System.out.println("Hello");
        return ResponseEntity.ok("Hello from secured api");
    }
    
}

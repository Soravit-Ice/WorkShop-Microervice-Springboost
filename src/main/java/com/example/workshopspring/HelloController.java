package com.example.workshopspring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/say/{message}")
    public ResponseEntity<HelloResponse> sayHello(@PathVariable String message){
        return ResponseEntity.status(200).body(new HelloResponse(message));
    }
}

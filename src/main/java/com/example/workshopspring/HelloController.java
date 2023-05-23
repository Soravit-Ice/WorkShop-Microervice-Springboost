package com.example.workshopspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {


    @GetMapping("/say/{message}")
    public ResponseEntity<HelloResponse> sayHello(@PathVariable String message) throws UnknownHostException {
        return ResponseEntity.status(200).body(new HelloResponse(message));
    }
}

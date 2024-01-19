package com.httpbin.httpbin.controllers;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/methods")
public class MethodsController {

    @GetMapping(value = "/get")
    public ResponseEntity<Void> getMethod(){
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/post")
    public ResponseEntity<Void> postMethod(){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<Void> deleteMethod(){
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/put")
    public ResponseEntity<Void> putMethod(){
        return ResponseEntity.ok().build();
    }
}

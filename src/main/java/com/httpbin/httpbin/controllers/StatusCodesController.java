package com.httpbin.httpbin.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class StatusCodesController {

    @GetMapping(value = "/{status_code}")
    public ResponseEntity<Void> getStatusCode(@PathVariable int status_code){
        return ResponseEntity.status(status_code).build();
    }

    @PostMapping(value = "/{status_code}")
    public ResponseEntity<Void> postStatusCode(@PathVariable int status_code){
       return ResponseEntity.status(status_code).build();
    }

    @DeleteMapping(value = "/{status_code}")
    public ResponseEntity<Void> deleteStatusCode(@PathVariable int status_code){
        return ResponseEntity.status(status_code).build();
    }

    @PutMapping(value = "/{status_code}")
    public ResponseEntity<Void> putStatusCode(@PathVariable int status_code){
        return ResponseEntity.status(status_code).build();
    }
}

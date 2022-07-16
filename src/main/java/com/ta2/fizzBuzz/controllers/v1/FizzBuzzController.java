package com.ta2.fizzBuzz.controllers.v1;


import com.ta2.fizzBuzz.services.v1.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("v1")
public class FizzBuzzController {

    @Autowired
    private FizzBuzzService service;

    @GetMapping("/fizzBuzzSinglaValue/{value}")
    public ResponseEntity<String> fizzBuzzSinglaValue(@PathVariable Integer value){
        return ResponseEntity.ok(service.singleValue(value));
    }
}

package com.ta2.fizzBuzz.controllers.v1;


import com.ta2.fizzBuzz.services.v1.FizzBuzzService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("v1")
public class FizzBuzzController {

    @Autowired
    private FizzBuzzService service;

    @GetMapping("/fizzBuzzSinglaValue/{value}")
    public ResponseEntity<String> fizzBuzzSinglaValue(@PathVariable Integer value){
        return ResponseEntity.ok(service.singleValue(value));
    }

    @PostMapping("/fizzBuzzSinglaValue")
    public ResponseEntity<List<String>> fizzBuzzListValues(@RequestBody List<Integer> lista){
        return ResponseEntity.ok(service.ListValues(lista));
    }
}

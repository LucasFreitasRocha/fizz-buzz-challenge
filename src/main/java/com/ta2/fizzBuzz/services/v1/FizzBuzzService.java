package com.ta2.fizzBuzz.services.v1;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public String singleValue(Integer value) {
        String response = "";
        if((value % 3 == 0) || value.toString().contains("3")  ){
            return "Fizz";
        }else if((value % 5 == 0) || value.toString().contains("5")){
            return "Buzz";
        }else if((value % 5 == 0) && (value % 3 == 0)){
            return "FizzBuzz";
        }else {
            return value.toString();
        }

    }
}

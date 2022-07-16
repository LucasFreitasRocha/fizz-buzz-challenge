package com.ta2.fizzBuzz.services.v1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzService {
    public String singleValue(Integer value) {
        String response = "";
        if((value % 3 == 0) || value.toString().contains("3")) response += "Fizz";
        if((value % 5 == 0) || value.toString().contains("5")) response += "Buzz";
        return (response.isEmpty()) ? value.toString() : response;
       /* old logic
       if( (value % 5 == 0) && (value % 3 == 0) ){
            return "FizzBuzz";
        }else if((value % 5 == 0) || value.toString().contains("5")){
            return "Buzz";
        }else if((value % 3 == 0) || value.toString().contains("3")){
            return "Fizz";
        }else {
            return value.toString();
        }*/
    }

    public List<String> ListValues(List<Integer> lista) {
        List<String> response = new ArrayList<>();
        lista.forEach(value -> {
            response.add(this.singleValue(value));
        });
        return response;
    }
}

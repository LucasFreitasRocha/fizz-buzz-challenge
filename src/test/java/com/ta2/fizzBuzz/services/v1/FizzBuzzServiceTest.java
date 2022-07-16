package com.ta2.fizzBuzz.services.v1;





import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class FizzBuzzServiceTest {

    @InjectMocks
    private FizzBuzzService service;

    @Test
    public void singleValueFizz() {
        assertEquals("Fizz", service.singleValue(3));
    }

    @Test
    public void singleValueBuzz() {
        assertEquals("Buzz", service.singleValue(5));
    }

    @Test
    public void singleValueFIzzBuzz() {
        assertEquals("FizzBuzz", service.singleValue(15));
    }

    @Test
    public void singleValueResponseNumber() {
        assertEquals("7", service.singleValue(7));
    }


    @Test
    public void ListValues(){
        List<String> expect = new ArrayList<>();
        expect.add("Fizz");
        expect.add("7");
        expect.add("Buzz");
        expect.add("FizzBuzz");
        List<Integer> request = new ArrayList<>();
        request.add(3);
        request.add(7);
        request.add(5);
        request.add(15);
        List<String> response = service.ListValues(request);
        for(var i = 0; i< expect.size();i++){
            assertEquals(expect.get(i),response.get(i) );
        }

    }

}
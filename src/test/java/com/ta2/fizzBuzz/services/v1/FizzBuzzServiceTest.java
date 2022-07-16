package com.ta2.fizzBuzz.services.v1;





import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
package com.epam.cicddemo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HomeTest {

    @InjectMocks
    Home homeTest;

    @Test
    void doSomething(){
        Assertions.assertDoesNotThrow(()-> homeTest.doSomething());
    }
}

package com.epam.cicddemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Home {

    public void doSomething(){
        log.info("Hello World");
        log.info("New Change");

    }
}

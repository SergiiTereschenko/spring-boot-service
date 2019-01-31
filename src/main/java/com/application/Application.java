package com.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        try {
            log.info("Attempt to start class " + Application.class.getCanonicalName());
            SpringApplication.run(Application.class, args);
        } catch (Exception ex) {
            log.debug(ex.getMessage());
        }
    }
}

package com.examenfinal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages= {"com.examenfinal.app.domain.donacion.entities"})
public class ExamenFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenFinalApplication.class, args);
    }

}

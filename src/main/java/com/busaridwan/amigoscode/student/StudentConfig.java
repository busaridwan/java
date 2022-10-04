package com.busaridwan.amigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

import static java.time.Month.DECEMBER;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student ridwan = new Student(
                        "Ridwan",
                        "busaridwan@gmail.com",
//                        20,
                        LocalDate.of(2000, MARCH, 12)
                );
           Student mariam = new Student(
                        "Mariam",
                        "giditriben@gmail.com",
//                        20,
                        LocalDate.of(2000, DECEMBER, 14)
                );
           repository.saveAll(
                   Arrays.asList(ridwan,mariam)
           );
        };
    }
}

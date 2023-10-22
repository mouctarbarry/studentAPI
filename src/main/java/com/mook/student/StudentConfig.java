package com.mook.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mouctar = new Student(1L, "Mouctar",
                    "mouctar.bary@gmail.com",
                    LocalDate.of(1994, Month.OCTOBER, 23)
            );

            Student mamadou = new Student( "Mamadou",
                    "mamadou.bary@gmail.com",
                    LocalDate.of(1995, Month.OCTOBER, 23)
            );

            repository.saveAll( List.of(mouctar, mamadou));
        };
    }
}

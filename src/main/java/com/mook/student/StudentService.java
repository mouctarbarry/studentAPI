package com.mook.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(1L, "Mouctar", "mouctar.bary@gmail.com",
                        26, LocalDate.of(1996, Month.OCTOBER, 23)
                        )
        );
    }
}

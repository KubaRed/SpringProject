package com.kubacode.FirstSpringProject.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L, "Kuba", "kuba@gmail.com",
                        LocalDate.of(1997, Month.APRIL,
                                13), 24)
        );
    }
}

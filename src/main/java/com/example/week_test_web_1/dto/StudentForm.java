package com.example.week_test_web_1.dto;


import com.example.week_test_web_1.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class StudentForm {
    private String name;
    private String major;
    private int age;
    private int grade;
    private String kisa;
    private String job;


    public Student toEntity() {
        return new Student(null, name, major, age, grade, kisa, job);
    }
}

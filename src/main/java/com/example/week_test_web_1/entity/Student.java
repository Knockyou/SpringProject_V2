package com.example.week_test_web_1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Student {
    @Id
    @GeneratedValue

    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String major;
    @Column
    private int age;
    @Column
    private int grade;
    @Column
    private String kisa;
    @Column
    private String job;
}

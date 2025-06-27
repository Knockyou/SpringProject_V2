package com.example.week_test_web_1.Repository;

import com.example.week_test_web_1.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface StudentRepository extends CrudRepository<Student, Long> {
    @Override
    ArrayList<Student> findAll();
}

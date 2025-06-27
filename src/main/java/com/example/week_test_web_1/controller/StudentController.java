package com.example.week_test_web_1.controller;

import com.example.week_test_web_1.Repository.StudentRepository;
import com.example.week_test_web_1.dto.StudentForm;
import com.example.week_test_web_1.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Slf4j
@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/main")
    public String mainPage()
    {
        log.info("메인 확인");
        return "/index";
    }
    
    @PostMapping("/students/create")
    public String newStudentForm(StudentForm studentForm)
    {
        log.info("데이터 추가 확인");
        //System.out.println("1.확인용 : " + articleForm.toString());
        // 로그 작성
        log.info(studentForm.toString());
        // DTO -> Entity
        Student student = studentForm.toEntity();
        //System.out.println("2.확인용 Article : " + article.toString());
        log.info(studentForm.toString());
        // Repo -> DB save
        Student saved = studentRepository.save(student);
        //System.out.println("3.확인용 Article save : " + saved.toString());
        log.info(saved.toString());

        return "/index";
    }

    @GetMapping("/students/list")
    public String studentList(Model model)
    {
        ArrayList<Student> studentList = studentRepository.findAll();


        // 모델에 데이터 등록
        model.addAttribute("students", studentList);
        return "students/showList";
    }
    


}

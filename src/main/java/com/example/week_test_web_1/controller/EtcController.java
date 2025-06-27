package com.example.week_test_web_1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
public class EtcController {

    @GetMapping("/random/img")
    public String showRandomImg(Model model)
    {
        log.info("이미지 보기");
        // 랜덤으로 번호 만듬
        int ranNum = (int)(Math.random() * 10) + 1;
        String imgPath = "/Images/" + ranNum + ".jpg";
        log.info("이미지 보기 확인 랜덤수 경로 : " + imgPath);
        model.addAttribute("imgPath", imgPath);
        return "etc/showImg";
    }

}

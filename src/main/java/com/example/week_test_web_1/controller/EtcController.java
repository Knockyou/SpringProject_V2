package com.example.week_test_web_1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Controller
public class EtcController {
    static public String GetNowTime()
    {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("현재 시간 yyyy.MM.dd a HH:mm");
        log.info("시간 확인 : " + dateFormat.format(today).toString());
        return dateFormat.format(today).toString();
    }

    @GetMapping("/random/img")
    public String showRandomImg(Model model)
    {
        log.info("이미지 보기");
        // 랜덤으로 번호 만듬
        int ranNum = (int)(Math.random() * 10) + 1;
        String imgPath = "/Images/" + ranNum + ".jpg";
        log.info("이미지 보기 확인 랜덤수 경로 : " + imgPath);
        model.addAttribute("imgPath", imgPath);
        model.addAttribute("nowTime", GetNowTime());
        return "etc/showImg";
    }

}

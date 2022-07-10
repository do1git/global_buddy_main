package com.example.global_buddy_main.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class MenuController {

//    @GetMapping("/")
//    public String menuSelect(){
//
    //    log.info("go to intro");
//        return "layout/menuSelect";
//    }
    @GetMapping("/")
    public String intro(){
        log.info("go to intro");
        return "intro";
//        return "member/memberList";
    }
}

package com.example.global_buddy_main.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    @GetMapping("/")
    public String memberList(){
        log.info("VISITING memberList");
        return "/member/memberList";
    }
    @GetMapping("/register")
    public String memberRegister(){
        return "member/memberRegister";
    }

}

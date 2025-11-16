package com.example.backend.controller;

import com.example.backend.Entity.Member;
import com.example.backend.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/toy/project/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/register")
    public void RegisterMember(@RequestBody Member member) {
        memberService.saveMember(member);
    }
}

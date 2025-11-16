package com.example.backend.service;

import com.example.backend.Entity.Member;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    @Transactional
    void saveMember() {
        // given
        Member member = new Member();
        member.setAge(20);
        member.setName("member1");

        memberService.saveMember(member);
    }
}
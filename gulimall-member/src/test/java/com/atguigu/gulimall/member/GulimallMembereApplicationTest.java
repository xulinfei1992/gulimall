package com.atguigu.gulimall.member;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.atguigu.gulimall.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xulinfei
 */
@SpringBootTest
@Slf4j
public class GulimallMembereApplicationTest {

    @Autowired
    MemberService memberService;

    @Test
    public void test() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUsername("Test");
        memberService.save(memberEntity);
        log.info("save success!");
    }
}
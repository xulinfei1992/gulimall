package com.atguigu.gulimall.member.api.controller;


import com.atguigu.gulimall.member.protocol.CommonRequest;
import com.atguigu.gulimall.member.protocol.CommonResponse;
import com.atguigu.gulimall.member.service.MessageService;
import com.atguigu.gulimall.member.util.Urls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulinfei
 */
@RestController
public class MemberHttpMessageSkeletonController {

    @Autowired
    private MessageService messageService;

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request) {
        return messageService.testFeign(request);
    }

}

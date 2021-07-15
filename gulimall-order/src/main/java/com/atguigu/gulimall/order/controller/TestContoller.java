package com.atguigu.gulimall.order.controller;

import com.atguigu.gulimall.product.protocol.CommonRequest;
import com.atguigu.gulimall.product.protocol.CommonResponse;
import com.atguigu.gulimall.product.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulinfei
 */
@RestController
@RequestMapping("/order/test")
public class TestContoller {
    @Autowired
    private MessageService productMessageService;
    @Autowired
    private com.atguigu.gulimall.coupon.service.MessageService couponMessageService;
    @Autowired
    private com.atguigu.gulimall.member.service.MessageService memberMessageService;
    @Autowired
    private com.atguigu.gulimall.ware.service.MessageService wareMessageService;


    @GetMapping("/getCouponMsg")
    public String getCouponMsg() {
        com.atguigu.gulimall.coupon.protocol.CommonRequest commonRequest = new com.atguigu.gulimall.coupon.protocol.CommonRequest();
        commonRequest.setReq("test");
        com.atguigu.gulimall.coupon.protocol.CommonResponse response = couponMessageService.testFeign(commonRequest);
        return response.getMsg();
    }

    @GetMapping("/getMemberMsg")
    public String getMemberMsg() {
        com.atguigu.gulimall.member.protocol.CommonRequest commonRequest = new com.atguigu.gulimall.member.protocol.CommonRequest();
        commonRequest.setReq("test");
        com.atguigu.gulimall.member.protocol.CommonResponse response = memberMessageService.testFeign(commonRequest);
        return response.getMsg();
    }

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        CommonRequest commonRequest = new CommonRequest();
        commonRequest.setReq("test");
        CommonResponse response = productMessageService.testFeign(commonRequest);
        return response.getMsg();
    }

    @GetMapping("/getWareMsg")
    public String getWareMsg() {
        com.atguigu.gulimall.ware.protocol.CommonRequest commonRequest = new com.atguigu.gulimall.ware.protocol.CommonRequest();
        commonRequest.setReq("test");
        com.atguigu.gulimall.ware.protocol.CommonResponse response = wareMessageService.testFeign(commonRequest);
        return response.getMsg();
    }
}

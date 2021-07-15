package com.atguigu.gulimall.coupon.api.controller;

import com.atguigu.gulimall.coupon.protocol.CommonRequest;
import com.atguigu.gulimall.coupon.protocol.CommonResponse;
import com.atguigu.gulimall.coupon.service.MessageService;
import com.atguigu.gulimall.coupon.util.Urls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulinfei
 */
@RestController
public class CouponHttpMessageSkeletonController {

    @Autowired
    private MessageService messageService;

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request) {
        return messageService.testFeign(request);
    }

}

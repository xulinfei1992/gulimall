package com.atguigu.gulimall.product.api.controller;

import com.atguigu.gulimall.product.protocol.CommonRequest;
import com.atguigu.gulimall.product.protocol.CommonResponse;
import com.atguigu.gulimall.product.service.MessageService;
import com.atguigu.gulimall.product.util.Urls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulinfei
 */
@RestController
public class ProductHttpMessageSkeletonController {

    @Autowired
    private MessageService messageService;

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request) {
        return messageService.testFeign(request);
    }

}

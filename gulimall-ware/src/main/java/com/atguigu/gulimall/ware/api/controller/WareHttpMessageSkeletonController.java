package com.atguigu.gulimall.ware.api.controller;

import com.atguigu.gulimall.ware.protocol.CommonRequest;
import com.atguigu.gulimall.ware.protocol.CommonResponse;
import com.atguigu.gulimall.ware.service.MessageService;
import com.atguigu.gulimall.ware.util.Urls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulinfei
 */
@RestController
public class WareHttpMessageSkeletonController {

    @Autowired
    private MessageService messageService;

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request) {
        return messageService.testFeign(request);
    }

}

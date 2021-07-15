package com.atguigu.gulimall.order.api.controller;



import com.atguigu.gulimall.order.protocol.CommonRequest;
import com.atguigu.gulimall.order.protocol.CommonResponse;
import com.atguigu.gulimall.order.service.MessageService;
import com.atguigu.gulimall.order.util.Urls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulinfei
 */
@RestController
public class OrderHttpMessageSkeletonController {

    @Autowired
    private MessageService messageService;

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request) {
        return messageService.testFeign(request);
    }

}

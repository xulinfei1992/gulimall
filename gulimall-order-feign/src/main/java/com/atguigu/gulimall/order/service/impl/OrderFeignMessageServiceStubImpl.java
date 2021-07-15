package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.protocol.CommonRequest;
import com.atguigu.gulimall.order.protocol.CommonResponse;
import com.atguigu.gulimall.order.service.MessageService;
import com.atguigu.gulimall.order.service.adapter.OrderFeignMessageServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class OrderFeignMessageServiceStubImpl implements MessageService {

    @Autowired
    private OrderFeignMessageServiceAdapter serviceAdapter;

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        return serviceAdapter.testFeign(request);
    }
}

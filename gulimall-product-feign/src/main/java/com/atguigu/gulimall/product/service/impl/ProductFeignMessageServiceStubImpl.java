package com.atguigu.gulimall.product.service.impl;

import com.atguigu.gulimall.product.protocol.CommonRequest;
import com.atguigu.gulimall.product.protocol.CommonResponse;
import com.atguigu.gulimall.product.service.MessageService;
import com.atguigu.gulimall.product.service.adapter.ProductFeignMessageServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class ProductFeignMessageServiceStubImpl implements MessageService {

    @Autowired
    private ProductFeignMessageServiceAdapter serviceAdapter;

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        return serviceAdapter.testFeign(request);
    }
}

package com.atguigu.gulimall.coupon.service.impl;

import com.atguigu.gulimall.coupon.protocol.CommonRequest;
import com.atguigu.gulimall.coupon.protocol.CommonResponse;
import com.atguigu.gulimall.coupon.service.MessageService;
import com.atguigu.gulimall.coupon.service.adapter.CouponFeignMessageServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class CouponFeignMessageServiceStubImpl implements MessageService {

    @Autowired
    private CouponFeignMessageServiceAdapter serviceAdapter;

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        return serviceAdapter.testFeign(request);
    }
}

package com.atguigu.gulimall.coupon.service;


import com.atguigu.gulimall.coupon.protocol.CommonRequest;
import com.atguigu.gulimall.coupon.protocol.CommonResponse;

/**
 * @author xulinfei
 */
public interface MessageService {

    CommonResponse testFeign(CommonRequest request);
}

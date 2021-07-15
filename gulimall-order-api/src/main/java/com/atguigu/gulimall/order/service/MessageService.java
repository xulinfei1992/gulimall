package com.atguigu.gulimall.order.service;

import com.atguigu.gulimall.order.protocol.CommonRequest;
import com.atguigu.gulimall.order.protocol.CommonResponse;

/**
 * @author xulinfei
 */
public interface MessageService {

    CommonResponse testFeign(CommonRequest request);
}

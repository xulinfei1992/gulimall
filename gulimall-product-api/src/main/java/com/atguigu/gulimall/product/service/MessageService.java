package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.protocol.CommonRequest;
import com.atguigu.gulimall.product.protocol.CommonResponse;

/**
 * @author xulinfei
 */
public interface MessageService {

    CommonResponse testFeign(CommonRequest request);
}

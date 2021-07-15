package com.atguigu.gulimall.ware.service;


import com.atguigu.gulimall.ware.protocol.CommonRequest;
import com.atguigu.gulimall.ware.protocol.CommonResponse;

/**
 * @author xulinfei
 */
public interface MessageService {

    CommonResponse testFeign(CommonRequest request);
}

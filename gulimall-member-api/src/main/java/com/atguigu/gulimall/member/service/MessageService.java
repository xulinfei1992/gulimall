package com.atguigu.gulimall.member.service;


import com.atguigu.gulimall.member.protocol.CommonRequest;
import com.atguigu.gulimall.member.protocol.CommonResponse;

/**
 * @author xulinfei
 */
public interface MessageService {

    CommonResponse testFeign(CommonRequest request);
}

package com.atguigu.gulimall.member.service.impl;


import com.atguigu.gulimall.member.protocol.CommonRequest;
import com.atguigu.gulimall.member.protocol.CommonResponse;
import com.atguigu.gulimall.member.service.MessageService;
import com.atguigu.gulimall.member.service.adapter.MemberFeignMessageServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class MemberFeignMessageServiceStubImpl implements MessageService {

    @Autowired
    private MemberFeignMessageServiceAdapter serviceAdapter;

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        return serviceAdapter.testFeign(request);
    }
}

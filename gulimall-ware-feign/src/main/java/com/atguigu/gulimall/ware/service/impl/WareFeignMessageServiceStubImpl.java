package com.atguigu.gulimall.ware.service.impl;

import com.atguigu.gulimall.ware.protocol.CommonRequest;
import com.atguigu.gulimall.ware.protocol.CommonResponse;
import com.atguigu.gulimall.ware.service.MessageService;
import com.atguigu.gulimall.ware.service.adapter.WareFeignMessageServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class WareFeignMessageServiceStubImpl implements MessageService {

    @Autowired
    private WareFeignMessageServiceAdapter serviceAdapter;

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        return serviceAdapter.testFeign(request);
    }
}

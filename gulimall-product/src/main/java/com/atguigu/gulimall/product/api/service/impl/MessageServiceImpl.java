package com.atguigu.gulimall.product.api.service.impl;

import com.atguigu.gulimall.product.protocol.CommonRequest;
import com.atguigu.gulimall.product.protocol.CommonResponse;
import com.atguigu.gulimall.product.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        CommonResponse response = new CommonResponse();
        response.setMsg("测试MessageService。。。" + request.getReq());
        return response;
    }
}

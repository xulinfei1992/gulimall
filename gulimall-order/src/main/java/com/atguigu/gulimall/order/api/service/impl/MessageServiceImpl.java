package com.atguigu.gulimall.order.api.service.impl;


import com.atguigu.gulimall.order.protocol.CommonRequest;
import com.atguigu.gulimall.order.protocol.CommonResponse;
import com.atguigu.gulimall.order.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        CommonResponse response = new CommonResponse();
        response.setMsg("order测试MessageService。。。" + request.getReq());
        return response;
    }
}

package com.atguigu.gulimall.coupon.api.service.impl;


import com.atguigu.gulimall.coupon.protocol.CommonRequest;
import com.atguigu.gulimall.coupon.protocol.CommonResponse;
import com.atguigu.gulimall.coupon.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        CommonResponse response = new CommonResponse();
        response.setMsg("coupon测试MessageService。。。" + request.getReq());
        return response;
    }
}

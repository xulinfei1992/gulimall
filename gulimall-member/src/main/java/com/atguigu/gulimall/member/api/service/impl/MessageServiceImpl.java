package com.atguigu.gulimall.member.api.service.impl;


import com.atguigu.gulimall.member.protocol.CommonRequest;
import com.atguigu.gulimall.member.protocol.CommonResponse;
import com.atguigu.gulimall.member.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        CommonResponse response = new CommonResponse();
        response.setMsg("member测试MessageService。。。" + request.getReq());
        return response;
    }
}

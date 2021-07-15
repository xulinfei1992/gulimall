package com.atguigu.gulimall.ware.api.service.impl;


import com.atguigu.gulimall.ware.protocol.CommonRequest;
import com.atguigu.gulimall.ware.protocol.CommonResponse;
import com.atguigu.gulimall.ware.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author xulinfei
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public CommonResponse testFeign(CommonRequest request) {
        CommonResponse response = new CommonResponse();
        response.setMsg("ware测试MessageService。。。" + request.getReq());
        return response;
    }
}

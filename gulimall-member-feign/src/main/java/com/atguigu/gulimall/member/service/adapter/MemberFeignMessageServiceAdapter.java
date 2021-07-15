package com.atguigu.gulimall.member.service.adapter;


import com.atguigu.gulimall.member.protocol.CommonRequest;
import com.atguigu.gulimall.member.protocol.CommonResponse;
import com.atguigu.gulimall.member.util.Urls;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xulinfei
 */
@FeignClient("gulimall-member")
public interface MemberFeignMessageServiceAdapter {

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request);
}

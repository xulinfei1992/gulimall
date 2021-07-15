package com.atguigu.gulimall.order.service.adapter;


import com.atguigu.gulimall.order.protocol.CommonRequest;
import com.atguigu.gulimall.order.protocol.CommonResponse;
import com.atguigu.gulimall.order.util.Urls;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xulinfei
 */
@FeignClient("gulimall-order")
public interface OrderFeignMessageServiceAdapter {

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request);
}

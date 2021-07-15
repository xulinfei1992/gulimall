package com.atguigu.gulimall.ware.service.adapter;

import com.atguigu.gulimall.ware.protocol.CommonRequest;
import com.atguigu.gulimall.ware.protocol.CommonResponse;
import com.atguigu.gulimall.ware.util.Urls;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xulinfei
 */
@FeignClient("gulimall-ware")
public interface WareFeignMessageServiceAdapter {

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request);
}

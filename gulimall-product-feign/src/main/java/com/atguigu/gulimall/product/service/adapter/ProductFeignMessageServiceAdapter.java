package com.atguigu.gulimall.product.service.adapter;

import com.atguigu.gulimall.product.protocol.CommonRequest;
import com.atguigu.gulimall.product.protocol.CommonResponse;
import com.atguigu.gulimall.product.util.Urls;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xulinfei
 */
@FeignClient("gulimall-product")
public interface ProductFeignMessageServiceAdapter{

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request);
}

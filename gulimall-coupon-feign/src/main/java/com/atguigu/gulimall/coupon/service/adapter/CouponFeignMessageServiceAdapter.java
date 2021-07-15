package com.atguigu.gulimall.coupon.service.adapter;


import com.atguigu.gulimall.coupon.protocol.CommonRequest;
import com.atguigu.gulimall.coupon.protocol.CommonResponse;
import com.atguigu.gulimall.coupon.util.Urls;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xulinfei
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignMessageServiceAdapter {

    @PostMapping(value = Urls.TEST_FEIGN)
    public CommonResponse testFeign(@RequestBody CommonRequest request);
}

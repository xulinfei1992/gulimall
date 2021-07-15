package com.atguigu.gulimall.coupon.controller;

import com.atguigu.common.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xulinfei
 */
@RefreshScope
@RestController
@RequestMapping("/coupon/test")
public class TestController {

    @Value("${coupon.user.name}")
    private String name;

    @Value("${coupon.user.age}")
    private int age;

    @GetMapping("/user")
    public R user() {
        return R.ok().put("name", name).put("age", age);
    }
}

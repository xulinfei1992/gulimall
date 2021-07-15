package com.atguigu.gulimall.coupon;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.atguigu.gulimall.coupon.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author xulinfei
 */
@SpringBootTest
@Slf4j
public class GulimallCouponApplicationTest {

    @Autowired
    CouponService couponService;

    @Test
    public void test() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("xxx");
        couponService.save(couponEntity);
        log.info("save success!");
    }
}

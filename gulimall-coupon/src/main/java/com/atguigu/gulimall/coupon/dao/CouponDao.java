package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xulinfei
 * @email linf.xu@qq.com
 * @date 2021-07-14 10:31:21
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

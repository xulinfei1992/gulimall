package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xulinfei
 * @email linf.xu@qq.com
 * @date 2021-07-14 09:17:46
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

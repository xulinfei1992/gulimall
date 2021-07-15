package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author xulinfei
 * @email linf.xu@qq.com
 * @date 2021-07-14 14:10:52
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

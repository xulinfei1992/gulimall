package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xulinfei
 * @email linf.xu@qq.com
 * @date 2021-07-13 16:38:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

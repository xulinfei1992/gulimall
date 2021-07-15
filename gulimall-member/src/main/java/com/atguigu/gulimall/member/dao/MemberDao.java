package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xulinfei
 * @email linf.xu@qq.com
 * @date 2021-07-14 09:43:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

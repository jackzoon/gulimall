package com.halen.gulimall.member.dao;

import com.halen.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 16:26:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

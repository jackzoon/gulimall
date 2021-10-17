package com.halen.gulimall.coupon.dao;

import com.halen.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 16:06:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

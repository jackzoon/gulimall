package com.halen.gulimall.order.dao;

import com.halen.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 16:44:06
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

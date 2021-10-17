package com.halen.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halen.common.utils.PageUtils;
import com.halen.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 16:44:06
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


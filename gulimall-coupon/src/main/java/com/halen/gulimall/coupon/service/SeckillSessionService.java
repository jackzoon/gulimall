package com.halen.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halen.common.utils.PageUtils;
import com.halen.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 16:06:40
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


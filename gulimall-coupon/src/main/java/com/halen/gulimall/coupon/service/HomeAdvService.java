package com.halen.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halen.common.utils.PageUtils;
import com.halen.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 16:06:40
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


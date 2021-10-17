package com.halen.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halen.common.utils.PageUtils;
import com.halen.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 15:09:38
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


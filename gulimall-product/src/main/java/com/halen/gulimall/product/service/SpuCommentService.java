package com.halen.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halen.common.utils.PageUtils;
import com.halen.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 15:09:37
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


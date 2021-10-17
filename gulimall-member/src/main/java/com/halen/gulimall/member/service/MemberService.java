package com.halen.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.halen.common.utils.PageUtils;
import com.halen.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author halen
 * @email halen@gmail.com
 * @date 2021-10-17 16:26:52
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


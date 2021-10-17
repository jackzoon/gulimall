package com.halen.gulimall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halen.common.utils.PageUtils;
import com.halen.common.utils.Query;

import com.halen.gulimall.ware.dao.WareOrderTaskDetailDao;
import com.halen.gulimall.ware.entity.WareOrderTaskDetailEntity;
import com.halen.gulimall.ware.service.WareOrderTaskDetailService;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity> implements WareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskDetailEntity> page = this.page(
                new Query<WareOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskDetailEntity>()
        );

        return new PageUtils(page);
    }

}
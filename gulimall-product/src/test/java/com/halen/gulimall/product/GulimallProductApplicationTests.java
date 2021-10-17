package com.halen.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.halen.gulimall.product.entity.BrandEntity;
import com.halen.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void test1() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    @Test
    public void test_query() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(System.out::println);
    }

}

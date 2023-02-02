package com.qxw.gulimall.product;

import com.qxw.gulimall.product.entity.BrandEntity;
import com.qxw.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("测试");
        brandEntity.setName("测试品牌名字");
        brandService.save(brandEntity);
        System.out.println("saved...");
    }

}

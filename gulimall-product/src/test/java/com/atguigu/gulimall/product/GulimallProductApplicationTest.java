package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author xulinfei
 */
@SpringBootTest
@Slf4j
public class GulimallProductApplicationTest {

    @Autowired
    BrandService brandService;

    @Test
    public void test(){
        BrandEntity entity = new BrandEntity();
        entity.setName("华为");
        brandService.save(entity);
        log.info("save success!");
    }

}

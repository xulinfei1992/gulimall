package com.atguigu.gulimall.order;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.atguigu.gulimall.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xulinfei
 */
@SpringBootTest
@Slf4j
public class GulimallOrderApplicationTest {

    @Autowired
    OrderService orderService;

    @Test
    public void test() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setReceiverName("Test");
        orderService.save(orderEntity);
        log.info("save success!");
    }
}
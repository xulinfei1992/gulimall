package com.atguigu.gulimall.ware;

import com.atguigu.gulimall.ware.entity.UndoLogEntity;
import com.atguigu.gulimall.ware.service.UndoLogService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xulinfei
 */
@SpringBootTest
@Slf4j
public class GulimallWareApplicationTest {

    @Autowired
    UndoLogService undoLogService;

    @Test
    public void test() {
        UndoLogEntity undoLogEntity = new UndoLogEntity();
        undoLogEntity.setContext("Test");
        undoLogEntity.setBranchId(111L);
        undoLogEntity.setXid("100");
        undoLogEntity.setRollbackInfo(new byte[]{1,2});
        undoLogEntity.setLogStatus(1);
        undoLogEntity.setLogCreated(new Date());
        undoLogEntity.setLogModified(new Date());
        undoLogService.save(undoLogEntity);
        log.info("save success!");
    }
}
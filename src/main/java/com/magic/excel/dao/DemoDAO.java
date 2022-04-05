package com.magic.excel.dao;

import com.magic.excel.entity.DemoData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 假设这个是你的DAO存储。当然还要这个类让spring管理，当然你不用需要存储，也不需要这个类。
 **/
@Slf4j
public class DemoDAO {
    public void save(List<DemoData> list) {
        // 如果是mybatis,尽量别直接调用多次insert,自己写一个mapper里面新增一个方法batchInsert,所有数据一次性插入
        log.info("开始保存数据~~~~~");
        list.forEach(System.out::println);
        log.info("结束保存数据~~~~~");
    }
}
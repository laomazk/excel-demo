package com.magic.excel.dao;

import com.magic.excel.entity.UploadData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 假设这个是你的DAO存储。当然还要这个类让spring管理，当然你不用需要存储，也不需要这个类。
 *
 * @author Jiaju Zhuang
 **/
@Repository
@Slf4j
public class UploadDAO {

    public void save(List<UploadData> list) {
        // 如果是mybatis,尽量别直接调用多次insert,自己写一个mapper里面新增一个方法batchInsert,所有数据一次性插入
        log.info("开始保存数据~~~~~");
        list.forEach(System.out::println);
        log.info("结束保存数据~~~~~");
    }
}

package com.magic.excel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.magic.excel.converter.Long2StringConverter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 基础数据类
 *
 * @author Jiaju Zhuang
 **/
@Getter
@Setter
@EqualsAndHashCode
public class DownloadData {
    @ExcelProperty("字符串标题")
    private String string;
    @ExcelProperty("日期标题")
    private LocalDateTime date;
    @ExcelProperty("数字标题")
    private Double doubleData;
    @ExcelProperty(value = "长ID",converter = Long2StringConverter.class)
    private Long id;
    @ExcelProperty(value = "长Id数字")
    private Long idN;
}

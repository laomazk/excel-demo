package com.magic.excel.converter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

/**
 * @author laoma
 * @create 2022-04-05 11:15
 */

public class Long2StringConverter implements Converter<Object> {
    @Override
    public WriteCellData<?> convertToExcelData(Object value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        if(value instanceof Long){
            return new WriteCellData<>(String.valueOf(value));
        }
        return new WriteCellData<String>("");
    }
}

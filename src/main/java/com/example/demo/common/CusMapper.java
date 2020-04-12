package com.example.demo.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自定义Mapper
 * 关于Mapper详解：http://git.oschina.net/free/Mapper/blob/master/wiki/mapper3/5.Mappers.md
 *
 * @param <T>
 */
public interface CusMapper<T> extends
        Mapper<T>,
        MySqlMapper<T> {
}


package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface PositionMapper{

    @Select("SELECT * FROM POSITION WHERE created_by = #{name}")
    List<Map> findByName(@Param("name") String name);

}
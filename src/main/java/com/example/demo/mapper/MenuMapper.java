package com.example.demo.mapper;

import com.example.demo.common.CusMapper;
import com.example.demo.domain.MenuVO;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈〉<br>
 *
 * @author lilonghua
 * @create 2020/4/12
 * @since 1.0.0
 */
@Repository
public interface MenuMapper extends CusMapper<MenuVO> {

     List findByName(@Param("name") String name);
}
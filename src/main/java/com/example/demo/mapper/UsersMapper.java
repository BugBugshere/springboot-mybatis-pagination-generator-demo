package com.example.demo.mapper;

import com.example.demo.common.CusMapper;
import com.example.demo.domain.Users;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper extends CusMapper<Users> {

    Users findByName(@Param("name") String name);
}
package com.example.demo;

import cn.hutool.core.lang.Console;
import com.example.demo.domain.MenuVO;
import com.example.demo.domain.Users;
import com.example.demo.mapper.MenuMapper;
import com.example.demo.mapper.PositionMapper;
import com.example.demo.mapper.UsersMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class DemoApplicationTests {

	@Autowired
	private MenuMapper mapper;

	@Autowired
	private PositionMapper positionMapper;

	@Autowired
	private UsersMapper usersMapper;

	@Test
	void contextLoads() {
		List data = mapper.findByName("系统管理");
		Console.log(data);


		//分页插件，可以直接使用，无需配置
		PageHelper.startPage(2, 2);
		List<Map> value = positionMapper.findByName("system");
		PageInfo pageInfo = new PageInfo(value);
		Console.log(pageInfo);

		List<MenuVO> dss = mapper.selectAll();
		Console.log(dss);

		PageHelper.startPage(1,2);
		List<Users> users = usersMapper.selectAll();
		Console.log(users);

		Users manager = usersMapper.findByName("超级管理员");
		Console.log(manager);
	}

}

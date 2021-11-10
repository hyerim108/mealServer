package com.it.springboot.daodto;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserlistDao { 
	public List<UserlistDto> MEMBER();
	//�쉶�썝�씠 留욌뒗吏� 寃��궗
	//public List<UserlistDto> findUser(String username);
}

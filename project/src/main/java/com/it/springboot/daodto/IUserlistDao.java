package com.it.springboot.daodto;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserlistDao { 
	public List<UserlistDto> MEMBER();
}

package com.it.springboot.daodto;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
//DAO역할

@Mapper   //spring container에 담아라
public interface ISimple_bbsDAO {
	
	//*********************************************************
	public List<Simple_bbsDTO> board_list();
	
	//*******************************************************
	public Simple_bbsDTO getOne(String id);
	
	//*********************************************************
	public void save(String writer, String title, String content);

	//*********************************************************
	public void updateReal(String id, String writer, String title, String content);
	
	//*********************************************************
	public void delete(String id);
}









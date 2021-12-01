package com.mealProject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.mealProject.model.MemberModel;
import com.mealProject.model.MenuModel;

@Repository
@Mapper
public interface MemberMapper {
    List<MemberModel> findAll();
    MemberModel findByName(String name);
    
    List<MenuModel> menuAll();
}

package com.mealProject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.mealProject.model.MealModel;
import com.mealProject.model.MemberModel;
import com.mealProject.model.MenuModel;
import com.mealProject.model.OrderListModel;
import com.mealProject.model.OrderListModel2;

@Repository
@Mapper
public interface MemberMapper {
    List<MemberModel> findAll();
    MemberModel findByName(String name);
    
    List<MenuModel> menuAll();
	MenuModel menuFind(String name);
	
	List<MealModel> mealAll();
	List<MealModel> mealFind(int name);
	
	List<OrderListModel> orderAll();
	List<OrderListModel2> AllOrderlist();
	List<OrderListModel2> AllOrderitem(String name);
	
	List<MealModel> mealShow(String name);
	int mealCount(String name);
//	List<MealModel> mealAllH();
//   List<MealModel> mealAllJ();
//   List<MealModel> mealAllI();
//   List<MealModel> mealAllY();
	
	
}

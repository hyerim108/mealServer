package com.mealProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.mealProject.mapper.MemberMapper;
import com.mealProject.model.MealModel;
import com.mealProject.model.MemberModel;
import com.mealProject.model.MenuModel;
import com.mealProject.model.OrderListModel;
import com.mealProject.model.OrderListModel2;

@Service
@Transactional
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    //member
    public List<MemberModel> selectAllMember(){
        return memberMapper.findAll();
    }

    public MemberModel selectMemberByName(String name){
        return memberMapper.findByName(name);
    }
    
    //menu 한식 중식 양식 일식
    public List<MenuModel> selectAllMenu() {
    	return memberMapper.menuAll();
    }
    public MenuModel selectMenuByName(String name){
        return memberMapper.menuFind(name);
    }
    
    //Meal menu 내용
    public List<MealModel> selectAllMeal(){
    	return memberMapper.mealAll();
    }
    public List<MealModel> selectMealName(int name) {
    	return memberMapper.mealFind(name);
    }
    //OrderList 
    public List<OrderListModel> selectAllOrder(){
    	return memberMapper.orderAll();
    }
    public List<OrderListModel2> selectAllOrderlist(){
    	return memberMapper.AllOrderlist();
    }
    public List<OrderListModel2> selectAllOrderlistitem(String name){
    	return memberMapper.AllOrderitem(name);
    }
    
    public List<MealModel> ShowMeal(String name) {
    	return memberMapper.mealShow(name);
    }
    public int CountMeal(String name) {
    	return memberMapper.mealCount(name);
    }
//    public List<MealModel> selectAllH(){
//        return memberMapper.mealAllH();
//     }
//     public List<MealModel> selectAllJ(){
//        return memberMapper.mealAllJ();
//     }
//     public List<MealModel> selectAllI(){
//        return memberMapper.mealAllI();
//     }
//     public List<MealModel> selectAllY(){
//        return memberMapper.mealAllY();
//     }
}

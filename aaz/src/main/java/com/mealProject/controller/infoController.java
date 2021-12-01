package com.mealProject.controller;

import com.mealProject.model.MealModel;
import com.mealProject.model.MemberModel;
import com.mealProject.model.MenuModel;
import com.mealProject.model.OrderListModel;
import com.mealProject.model.OrderListModel2;
import com.mealProject.model.common.ResultMsg;
import com.mealProject.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class infoController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/")
	public String main(){
		return "d";
	}
	
	@GetMapping("/member/list")
	public @ResponseBody ResultMsg<MemberModel> getIndex() {
		return new ResultMsg<MemberModel>(true, "Anything you want to send",  memberService.selectAllMember());
	}

	@GetMapping("/member/item/{memberName}")
	public @ResponseBody ResultMsg<MemberModel> getMember(@PathVariable ("memberName") String memberName){
		MemberModel member = memberService.selectMemberByName(memberName);
		if(member != null){
			return new ResultMsg<MemberModel>(true, "Success",  member); 
		}
		return new ResultMsg<MemberModel>(false, memberName+"을 찾을 수 없습니다.");
	}
	@GetMapping("/menu/list")
	public @ResponseBody ResultMsg<MenuModel> getMenu() {
		return new ResultMsg<MenuModel>(true, "Anything you want to send",  memberService.selectAllMenu());
	}
	
	@GetMapping("/menu/item/{menuName}")
	public @ResponseBody ResultMsg<MenuModel> getMenuName(@PathVariable ("menuName") String menuName){
		MenuModel menu = memberService.selectMenuByName(menuName);
		if(menu != null){
			return new ResultMsg<MenuModel>(true, "Success",  menu); 
		}
		return new ResultMsg<MenuModel>(false, menuName+"을 찾을 수 없습니다.");
	}
	
	@GetMapping("/meal/list")
	public @ResponseBody ResultMsg<MealModel> getMeal() {
		return new ResultMsg<MealModel>(true, "Anything you want to send",  memberService.selectAllMeal());
	}
	
	@GetMapping("/meal/item/{menuNo}")
	public @ResponseBody ResultMsg<MealModel> getMealName(@PathVariable ("menuNo") int menuNo){
		return new ResultMsg<MealModel>(true, "Anything you want to send", memberService.selectMealName(menuNo));
	}
	
	@GetMapping("/order/list")
	public @ResponseBody ResultMsg<OrderListModel> getOrder() {
		return new ResultMsg<OrderListModel>(true, "Anything you want to send",  memberService.selectAllOrder());
	}
	@GetMapping("/order/item")
	public @ResponseBody ResultMsg<OrderListModel2> getOrderlist() {
		return new ResultMsg<OrderListModel2>(true, "Anything you want to send",  memberService.selectAllOrderlist());
	}
	
	@GetMapping("/order/item/{menuName}")
	public @ResponseBody ResultMsg<OrderListModel2> getOrderName(@PathVariable ("menuName") String menuName){
		return new ResultMsg<OrderListModel2>(true, "Anything you want to send", memberService.selectAllOrderlistitem(menuName));
	}
	@GetMapping("/meal/search/{menuName}")
	public @ResponseBody ResultMsg<MealModel> getMealName(@PathVariable ("menuName") String menuName){
		return new ResultMsg<MealModel>(true, "Anything you want to send", memberService.ShowMeal(menuName));
	}
	
	@GetMapping("/meal/count/{mealNo}")
	public @ResponseBody ResultMsg<String> getMealCount(@PathVariable ("mealNo") String mealNo){
		return new ResultMsg<String>(true, "Anything you want to send", Integer.toString(memberService.CountMeal(mealNo)));
	}
	//1
//	@GetMapping("/meal/listH")
//	   public @ResponseBody ResultMsg<MealModel> getMealH(){
//	      return new ResultMsg<MealModel>(true, "Anything you want to send",  memberService.selectAllH());
//	   }
//	//2
//	   @GetMapping("/meal/listJ")
//	   public @ResponseBody ResultMsg<MealModel> getMealJ(){
//	      return new ResultMsg<MealModel>(true, "Anything you want to send",  memberService.selectAllJ());
//	   }
//	   @GetMapping("/meal/listI")
//	   public @ResponseBody ResultMsg<MealModel> getMealI(){
//	      return new ResultMsg<MealModel>(true, "Anything you want to send",  memberService.selectAllI());
//	   }
//	   @GetMapping("/meal/listY")
//	   public @ResponseBody ResultMsg<MealModel> getMealY(){
//	      return new ResultMsg<MealModel>(true, "Anything you want to send",  memberService.selectAllY());
//	   }
}

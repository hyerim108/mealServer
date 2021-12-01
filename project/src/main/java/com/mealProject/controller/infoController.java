package com.mealProject.controller;

import com.mealProject.model.MemberModel;
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
		return new ResultMsg<MemberModel>(false, memberName+"�쓣 李얠쓣 �닔 �뾾�뒿�땲�떎.");
	}
	
	@GetMapping("/menu/list")
	public @ResponseBody ResultMsg<MemberModel> getMenu() {
		return new ResultMsg<MemberModel>(true, "Anything you want to send",  memberService.selectAllMember());
	}
}

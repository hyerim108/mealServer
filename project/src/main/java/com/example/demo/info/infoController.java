package com.example.demo.info;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.it.springboot.daodto.IUserlistDao;
import com.it.springboot.daodto.UserlistDto;
import com.it.springboot.service.IService;


@Controller
public class infoController {
	@Autowired
	IService s;
	
	@GetMapping("/")
	public String main(){
		return "ssss";
	}
	
	@RequestMapping("/let")
	public String getIndex(Model model) {
		model.addAttribute("list",s.MEMBER());
//		System.out.println(model);
		 return "¿Ã∏ß";
	}
	
}

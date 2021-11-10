package com.example.demo.info;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.it.springboot.daodto.UserlistDto;


@RestController
public class infoController {

	@GetMapping("/")
	public String getIndex() {
		return "GUI1";
	}
	@GetMapping("/list") 
	   public String getList(UserlistDto userDTO) {
		
		  return "¿Ã∏ß: "+ userDTO.getMemberName();             
	   }
}

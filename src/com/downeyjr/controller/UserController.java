package com.downeyjr.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope(value="prototype")
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/insertMultiUserSuccess")
	public String insertMultiUserSuccess(Model model) {
		for (int i = 0; i < 100; i++) {
			System.out.println("----------:"+i);	
		}
		return "success";
	}	
	
}

package com.bellinfo.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/student")
@Controller
public class StudentController {
	@RequestMapping(value="/home")
	public String getHome(){
		return "home";
		
	}

	
}

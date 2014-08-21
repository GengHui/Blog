package com.huigeng.blog.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping()
	public String homePage(Map<String,Object>model) {
		System.out.println("Hello Blog");
		return "";
	}
}

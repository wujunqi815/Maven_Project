package com.myriad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

	@RequestMapping(value="/index") 
	public String printHello(ModelMap model) {
	      System.out.println("Welcome");
	      return "login";
	   }
}

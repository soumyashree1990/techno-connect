package com.in.techno.connect.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	

	@RequestMapping(value = "/test" , method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "welcome";
	}
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	
}

package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Usercontroller {
	@GetMapping("/")
	public String index()
	{
		return "index";
	}

}

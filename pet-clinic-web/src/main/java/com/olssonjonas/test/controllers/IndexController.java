package com.olssonjonas.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"","/", "/index", "/index.html"})
	public String index(Model model) {
		String hey = "Hello Mark";
		model.addAttribute("text", hey);
		return "index";
	}

}

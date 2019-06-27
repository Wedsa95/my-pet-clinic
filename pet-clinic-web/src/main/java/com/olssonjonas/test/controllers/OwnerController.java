package com.olssonjonas.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
	
	@RequestMapping({"/owners","/owners/index","/owners/index.html"})
	public String allOwners(Model model) {

		return "owners/index";
	}

}

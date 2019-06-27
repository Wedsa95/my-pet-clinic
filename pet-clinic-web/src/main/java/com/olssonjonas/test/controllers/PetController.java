package com.olssonjonas.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
	
	@RequestMapping({"/pets","/pets/index","/pets/index.html"})
	public String allPets(Model model) {

		return "pets";
	}

}

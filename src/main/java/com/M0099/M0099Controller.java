package com.M0099;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/M0099")
public class M0099Controller{
	
	@Autowired
	M0099Service M0099service;
	
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("M0099", new M0099Model());
		return "M0099";
	}
	
	
}








package com.M0000;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class M0000Controller {
	
	@Autowired
	M0000Service M0000Service;
	
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("M0000", new M0000Model());
		return "M0000";
		
	}
	
	
	@PostMapping("/Search")
	public String getAny(@Valid @ModelAttribute("M0000") M0000Model m0000, BindingResult result, Model model) {
		M0000Service.getAnyCode(m0000.getAnyCode());
		return "M0000";
		
	}
	
	
	
	@PostMapping("/Save")
	public String SaveAny(@Valid @ModelAttribute("M0000") M0000Model m) {
		M0000Service.SaveAnyCode(m);
		return "M0000";
	}
	
	
}




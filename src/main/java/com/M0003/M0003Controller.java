package com.M0003;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Entities.TOKEntity;

@Controller
@RequestMapping("/M0003")
public class M0003Controller {
	
	@Autowired
	M0003Service M0003service;
	
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("M0003", new M0003Model());
		return "M0003";
		
	}
	
	
	@PostMapping("/Search")
	public String getAny(@Valid @ModelAttribute("M0003") M0003Model M0003, BindingResult result, Model model) {
		
				
	TOKEntity tokentity =M0003service.findbyId(M0003.getTokcode());
		if(tokentity != null) {
		    M0003.setTokcode(tokentity.getTokcode());
			M0003.setTokName(tokentity.getToknm());
			//M0003.setAdrress(M0003entity.getAdrress());
			M0003.setTel(tokentity.getTel());
			M0003.setName(tokentity.getDaihyonm());
		
		
	
		}
		model.addAttribute("M0003", M0003);
		return "M0003";
		
	}
	
	@PostMapping("/Save")
	public String SaveAny(@Valid @ModelAttribute("M0003") M0003Model m, BindingResult result, Model model) {
		
		
		M0003service.saveTor(m);
		
		 M0003Model M0003 = new M0003Model();

		model.addAttribute("M0003", M0003);
		return "M0003";
	}
	
	
}
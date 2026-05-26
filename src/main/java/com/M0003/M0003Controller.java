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
		
		M0003Model m = new M0003Model();
		
		TOKEntity tokentity =M0003service.findbyId(M0003.getTokcode());
		if(tokentity != null) {
		    m.setTokcode(tokentity.getTokcode());
			m.setTokName(tokentity.getToknm());
			//M0003.setAdrress(M0003entity.getAdrress());
			m.setTel(tokentity.getTel());
			m.setName(tokentity.getDaihyonm());
		
			m.setYasumimon(tokentity.getYasumi().substring(0, 1));
			m.setYasumitue(tokentity.getYasumi().substring(1, 2));
			m.setYasumiwed(tokentity.getYasumi().substring(2, 3));
			m.setYasumithu(tokentity.getYasumi().substring(3, 4));
			m.setYasumifri(tokentity.getYasumi().substring(4, 5));
			m.setYasumisat(tokentity.getYasumi().substring(5, 6));
			m.setYasumisun(tokentity.getYasumi().substring(6, 7));
		
		}
		model.addAttribute("M0003", m);
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
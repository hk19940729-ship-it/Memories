package com.M0002;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Entities.TOREntity;

@Controller
@RequestMapping("/M0002")
public class M0002Controller {
	
	@Autowired
	M0002Service m0002service;
	
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("M0002", new M0002Model());
		return "M0002";
		
	}
	
	
	@PostMapping("/Search")
	public String getAny(@Valid @ModelAttribute("M0002") M0002Model m0002, BindingResult result, Model model) {
		
				
	TOREntity torentity =m0002service.findbyId(m0002.getTorCode());
		if(torentity != null) {
		    m0002.setTorCode(torentity.getTorCode());
			m0002.setTorName(torentity.getTorNm());
			//m0002.setAdrress(m0002entity.getAdrress());
			m0002.setTel(torentity.getTel());
			m0002.setDaihyoName(torentity.getDaihyoNm());
		
			
			if(torentity.getYasumi() != null && torentity.getYasumi().length() ==7) {
				m0002.setYasumimon(torentity.getYasumi().substring(0, 1));
				m0002.setYasumitue(torentity.getYasumi().substring(1, 1));
				m0002.setYasumiwed(torentity.getYasumi().substring(2, 1));
				m0002.setYasumithu(torentity.getYasumi().substring(3, 1));
				m0002.setYasumifri(torentity.getYasumi().substring(4, 1));
				m0002.setYasumisat(torentity.getYasumi().substring(5, 1));
				m0002.setYasumisun(torentity.getYasumi().substring(6, 1));
			} 			
	
		}
		model.addAttribute("M0002", m0002);
		return "M0002";
		
	}
	
	@PostMapping("/Save")
	public String SaveAny(@Valid @ModelAttribute("M0002") M0002Model m, BindingResult result, Model model) {
		
		
		m0002service.saveTor(m);
		
		 M0002Model m0002 = new M0002Model();

		model.addAttribute("M0002", m0002);
		return "M0002";
	}
	
	
}
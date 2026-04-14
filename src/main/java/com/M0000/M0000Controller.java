package com.M0000;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Entities.ANYCODEEntity;
import com.Entities.AnyCodeKey;


@Controller
@RequestMapping("/M0000")
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
		AnyCodeKey anyCode = new AnyCodeKey();
		anyCode.setCodeKbn(m0000.getCodeKbn());
		anyCode.setCode(m0000.getAnyCode());

				
		ANYCODEEntity anycodeentity =M0000Service.getAnyCode(anyCode);
		if(anycodeentity != null) {
			m0000.setCodeNm(anycodeentity.getCodeNm());
			m0000.setItem1(anycodeentity.getItem1());
		}
		model.addAttribute("M0000", m0000);
		return "M0000";
		
	}
	
	
	
	@PostMapping("/Save")
	public String SaveAny(@Valid @ModelAttribute("M0000") M0000Model m, BindingResult result, Model model) {
		M0000Service.SaveAnyCode(m);
		
		 M0000Model m0000 = new M0000Model();

		model.addAttribute("M0000", m0000);
		return "M0000";
	}
	
	
}




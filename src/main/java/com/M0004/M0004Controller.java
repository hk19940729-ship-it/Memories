package com.M0004;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Entities.CALEntity;



@Controller
@RequestMapping("/M0004")
public class M0004Controller {
		
	@Autowired
	M0004Service m0004service;
	
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("M0004", new M0004Model());
		return "M0004";
	}
	
	@PostMapping("/Search")
	public String Search(@Valid @ModelAttribute("M0004") M0004Model m0004, BindingResult result, Model model) {
		
		List<CALEntity> dayslist = m0004service.SearchDays(m0004.getYmd());
		
		List<M0004Result> M0004result = m0004service.Search(m0004);
		if (!M0004result.isEmpty()) {
			m0004.applyTo(M0004result,dayslist);
		}else {
			//0件エラーの処理
		}
		
		model.addAttribute("DetailHeadList",dayslist);
		
		model.addAttribute("DetailList",m0004.getM0004DetailList());
	    
		
		return "M0004";
	}
	
	
	
	@PostMapping("/Save")
	public String Save(@Valid @ModelAttribute("M0004") M0004Model m0004, BindingResult result, Model model) {
		
		try {
			m0004service.save(m0004);
		} catch (Exception e) {
			model.addAttribute("errorMessage", "Error saving data: " + e.getMessage());
			return "M0004";
		}
		
		return "redirect:/M0004/";
	}
	
}
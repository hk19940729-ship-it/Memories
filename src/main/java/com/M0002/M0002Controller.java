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
		M0002Model resultmodel = new M0002Model();
		
		resultmodel.setTorCode(m0002.getTorCode());
		
	    TOREntity torentity =m0002service.findbyId(m0002.getTorCode());
		if(torentity != null) {
			resultmodel.setTorName(torentity.getTorNm());
			String addressnm =String.format("%-60s",(torentity.getAddrressNm() != null) ? torentity.getAddrressNm() : "");
			resultmodel.setAdrress1(addressnm.substring(0, 29).trim());
			resultmodel.setAdrress2(addressnm.substring(29, 59).trim());
			resultmodel.setTel(torentity.getTel());
			resultmodel.setDaihyoName(torentity.getDaihyoNm());
			
			if(torentity.getYasumi() != null && torentity.getYasumi().length() ==7) {
				resultmodel.setYasumimon(torentity.getYasumi().substring(0, 1));
				resultmodel.setYasumitue(torentity.getYasumi().substring(1, 2));
				resultmodel.setYasumiwed(torentity.getYasumi().substring(2, 3));
				resultmodel.setYasumithu(torentity.getYasumi().substring(3, 4));
				resultmodel.setYasumifri(torentity.getYasumi().substring(4, 5));
				resultmodel.setYasumisat(torentity.getYasumi().substring(5, 6));
				resultmodel.setYasumisun(torentity.getYasumi().substring(6, 7));
			} 			
	
		}
		model.addAttribute("M0002", resultmodel);
		return "M0002";
		
	}
	
	@PostMapping("/Save")
	public String Save(@Valid @ModelAttribute("M0002") M0002Model m, BindingResult result, Model model) {
		

		try {
			
		 m0002service.saveTor(m);
		
		}
		catch(Exception e) {
			// エラーハンドリング
			result.reject("error.saving", "データの保存中にエラーが発生しました。");
			
			model.addAttribute("M0002", m);
			return "M0002";
		}
		 
		return "redirect:/M0002/";
	}
		
	@PostMapping("/Delete")
	public String Delete(@Valid @ModelAttribute("M0002") M0002Model m, BindingResult result, Model model) {
		
		try {
			
		 m0002service.deleteTor(m);
		
		}
		catch(Exception e) {
			// エラーハンドリング
			result.reject("error.deleting", "データの削除中にエラーが発生しました。");
			
			model.addAttribute("M0002", m);
			return  "M0002";
		}
		
		return "redirect:/M0002/";
	}
		
		
}
	
	
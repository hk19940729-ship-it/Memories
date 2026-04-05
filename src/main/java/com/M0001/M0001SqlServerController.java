package com.M0001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entities.HINEntity;
import com.M0001.model.M0001;
import com.M0001.services.M0001Service;


@Controller
public class M0001SqlServerController {
    @Autowired
    M0001Service M0001Service;

    
    @GetMapping("/")
    public String Index(Model model) {
        //model.addAttribute("title", "SQL Serverから取得したデータ");
        // 品目データの取得
    	model.addAttribute("M0001", new M0001()); // M0001はフォーム用のクラス index.htmlで参照するので生成が必要
        //model.addAttribute("weatherDataList", weatherDataList);
        return "index";
    }
    
    @PostMapping("/Search")
    public String getHin(@ModelAttribute M0001 m001,Model model) {
        //model.addAttribute("title", "SQL Serverから取得したデータ");
        // 品目データの取得
    	
    		String hincode = m001.getHinCode();
        HINEntity result = M0001Service.findbyId(hincode);
        
        if(result != null) {
        	  m001.ApplyEdit(result,true);  	
        }
      
        model.addAttribute("M0001", m001);
         
        //model.addAttribute("weatherDataList", weatherDataList);
        return "index";
    }
    

    @PostMapping("/Save")
    public String saveHin(@ModelAttribute M0001 m001,Model model) {
        // 品目データの登録
    		M0001Service.saveHin(m001);
     	model.addAttribute("M0001", m001); 
        //model.addAttribute("weatherDataList", weatherDataList);
        return "index";
    }
    
    
    
}
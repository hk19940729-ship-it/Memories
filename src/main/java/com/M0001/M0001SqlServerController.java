package com.M0001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
    
    @GetMapping("/Search")
    public String hello(@ModelAttribute M0001 m001,Model model) {
        //model.addAttribute("title", "SQL Serverから取得したデータ");
        // 品目データの取得
    	
    	String hincode = m001.getHINCODE();
        HINEntity result = M0001Service.findbyId(hincode);
        m001.setHINNAME( result.getHINNAME());
        model.addAttribute("M0001", m001);
         
        //model.addAttribute("weatherDataList", weatherDataList);
        return "index";
    }
    

    
}
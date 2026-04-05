package com.M0001;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
        model.addAttribute("M0001", new M0001());
        return "index";
    }

    @PostMapping("/Search")
    public String getHin(@Valid @ModelAttribute("M0001") M0001 m001, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("M0001", m001);
            return "index";
        }

        String hincode = m001.getHinCode();
        HINEntity hinentity = M0001Service.findbyId(hincode);

        if (hinentity != null) {
            m001.ApplyEdit(hinentity, true);
        }

        model.addAttribute("M0001", m001);
        return "index";
    }

    @PostMapping("/Save")
    public String saveHin(@ModelAttribute("M0001") M0001 m001, Model model) {
        M0001Service.saveHin(m001);
        model.addAttribute("M0001", m001);
        return "index";
    }
}

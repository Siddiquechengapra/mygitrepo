package com.sid.myselfpackage;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/trying")
public class TryController {
	
	
	@RequestMapping("/showform")
	public String tryingmethod(Model model) {
		Try tryobj= new Try();
		model.addAttribute("tryattri",tryobj);
		return "try1";
	}
	
	@RequestMapping("/processform")
	public String process(@Valid @ModelAttribute("tryattri") Try tryobj,BindingResult bndr) {
		
	if (bndr.hasErrors()){
		return "try1";
	}
	else {
		return"try2";
	}

		
	
		
	}
}
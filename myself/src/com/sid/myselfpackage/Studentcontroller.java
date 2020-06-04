package com.sid.myselfpackage;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.tags.BindErrorsTag;

@Controller
@RequestMapping("/student")
public class Studentcontroller {
	
	@InitBinder
	public void InitBinder(WebDataBinder datbndr) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		datbndr.registerCustomEditor(String.class,ste );
		
	}
	
	@RequestMapping("/showform")
	public String sthomepage(Model model) {
		Student studentobject = new Student();
		model.addAttribute("studentattri",studentobject);
		
		return "st1";
		}

	@RequestMapping("/processform")
	public String stprocess(@Valid @ModelAttribute("studentattri") Student studentobject,BindingResult bindres) {
		
		System.out.println(bindres);
		if(bindres.hasErrors()) {
			return "st1";
		}
		else {
		return "st2";
		}

}
}
package com.sid.myselfpackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class Studentcontroller {
	@RequestMapping("/showform")
	public String sthomepage(Model model) {
		Student studentobject = new Student();
		model.addAttribute("studentattri",studentobject);
		
		return "st1";
		}

	@RequestMapping("/processform")
	public String stprocess(@ModelAttribute("studentattri") Student studentobject) {
		return "st2";
		}

}

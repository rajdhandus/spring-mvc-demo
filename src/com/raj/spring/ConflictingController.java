package com.raj.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConflictingController {
	
	@RequestMapping("/showForm")
	public String displayForm(){
		return "someother-form";
	}

}

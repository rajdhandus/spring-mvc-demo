package com.raj.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest httpReq, Model model){
		String studentName = httpReq.getParameter("studentName");
		studentName = "Yo V2!!!" + studentName.toUpperCase();
		model.addAttribute("message", studentName);
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String studentName, Model model){
		studentName = "Yo V3!!!" + studentName.toUpperCase();
		model.addAttribute("message", studentName);
		return "helloworld";
		
	}

}

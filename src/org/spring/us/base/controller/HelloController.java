package org.spring.us.base.controller;

import org.spring.us.base.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET,value = "begin")
	public String home(String name){
		System.out.println("KO");
		User  user = new User();
		user.setName(name);
//		model.addAttribute("message", "world");
//		model.addAttribute(user);
		return  "hello";
	}
//	public User homeObg(){
//		ret
//	}
}

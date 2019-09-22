package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginClservice;

@Controller
@RequestMapping("/user/")
public class LoginController {

	@Autowired
	private LoginClservice loginClService;
	
	@RequestMapping("user")
	public String getLoginCl(@RequestParam("name") String name,@RequestParam("password") String password){
		
		boolean b;
		b=loginClService.Find(name, password);//调用service层的方法
		System.out.println(name);
		System.out.println(password);
		
		if(b=true){	
			return "user/wel";
		}
			return "user/login";
		}
}

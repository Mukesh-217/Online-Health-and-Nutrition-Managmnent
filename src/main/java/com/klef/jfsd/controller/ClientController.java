package com.klef.jfsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.model.Admin;
import com.klef.jfsd.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ClientController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/")
	  public String main()
	  {
	    return "index";
	  }
	
	@GetMapping("alogin")
	public ModelAndView adminlogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("alogin");
		return mv;
	}

	@PostMapping("checkadminlogin")
	public ModelAndView checkadminlogin(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();

		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");

		Admin a = adminService.checkadminlogin(uname, pwd);
		if (a != null) {
			mv.setViewName("index");
		} else {
			mv.setViewName("alogin");
			mv.addObject("message", "Login Failed");
		}
		return mv;
	}
	
}

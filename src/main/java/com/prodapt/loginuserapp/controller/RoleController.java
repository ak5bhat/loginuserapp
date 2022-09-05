package com.prodapt.loginuserapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prodapt.loginuserapp.entities.Role;
import com.prodapt.loginuserapp.entities.User;
import com.prodapt.loginuserapp.service.RoleService;

@Controller
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/roleform")
	public String showRoles(@ModelAttribute("role") Role role) {
		return "roles";
	}
	@PostMapping("/saverole")
	public ModelAndView saveRole(@ModelAttribute ("user") User user , @ModelAttribute("role") Role role) {
		
		Role rol = roleService.addRole(role);
		ModelAndView mv = new ModelAndView();
		mv.addObject("roleData",rol);
		mv.setViewName("roles");
		return mv;
	}
	
}

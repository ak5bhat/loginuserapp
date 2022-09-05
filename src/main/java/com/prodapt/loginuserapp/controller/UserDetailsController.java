package com.prodapt.loginuserapp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prodapt.loginuserapp.entities.User;
import com.prodapt.loginuserapp.entities.UserDetails;
import com.prodapt.loginuserapp.service.UserDetailsService;


@Controller
public class UserDetailsController {
 
	@Autowired
	public UserDetailsService uds;
	
	@GetMapping("/adminview")
	public ModelAndView getUserDetails(@RequestParam ("id") Long Id,@ModelAttribute ("user") User user) {
        UserDetails ud = uds.getUserById(Id);
		
        ModelAndView mv = new ModelAndView();
        if(ud!=null) {
        	
        	mv.addObject("msg",ud);
    		mv.setViewName("userdetails");
        }else {
        	mv.addObject("msg"," User with id:" + Id + " Has No Record In Database");
        	mv.setViewName("errorpage");
        }
		
		return mv;
	}
	

}

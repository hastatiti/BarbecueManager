package com.security;

import javax.inject.Inject;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Inject
	UserRepository ur;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome(Model model) {
		return "login";
	}
	 
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@RequestMapping(value="/admin",method = RequestMethod.GET)
	public String not(Model model) {
		return "not";
	}
	
}

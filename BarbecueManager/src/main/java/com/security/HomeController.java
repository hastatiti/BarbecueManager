package com.security;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Inject
	UserRepository ur;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome(Model model) {
		return "login";
	}
	 
	
	@RequestMapping(value="/not",method = RequestMethod.GET)
	public String not(Model model) {
		return "not";
	}
	
}

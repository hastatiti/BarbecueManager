package com.security;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/barbecue")
@SessionAttributes("barbecue")
public class BarbecueController {
	
	@Autowired
	BarbecueRepository repository;
	
	@ModelAttribute("barbecue")
	public Barbecue getBarbecue() {
		System.out.println("Adding new Barbecue");
		return new Barbecue();
	}

	
	//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addBarbecue(@ModelAttribute Barbecue barbecue) {
		System.out.println("invoking addBarbecue");
		return "barbecue_add";
	}
	
	//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBarbecue(@ModelAttribute Barbecue barbecue) {
		System.out.println("invoking saveBarbecue");
		repository.save(barbecue);
		System.out.println(barbecue);
		return "barbecue_review";
	}
	

	//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(Model model) {
		return "barbecue_add";
	}

}
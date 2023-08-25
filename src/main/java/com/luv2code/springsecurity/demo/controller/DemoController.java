package com.luv2code.springsecurity.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	// add request mapping for /leaders

	@GetMapping("/leaders")
	@PreAuthorize("hasRole('ROLE_MANAGER')")
	public String showLeaders() {
		
		return "leaders";
	}
	
	// add request mapping for /systems
	
	@GetMapping("/systems")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String showSystems() {
		
		return "systems";
	}
	
}











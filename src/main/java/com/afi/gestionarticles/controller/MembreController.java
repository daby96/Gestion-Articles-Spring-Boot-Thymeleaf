package com.afi.gestionarticles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.afi.gestionarticles.service.MembreService;

@Component
@Controller
public class MembreController {

	@Autowired
	MembreService ms;
	
	
}

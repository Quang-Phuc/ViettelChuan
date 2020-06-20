package edu.fa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class AdminLoginController {

	@RequestMapping(value = "admin", method = RequestMethod.GET)
	public String showLoginOne(Model model) {

		return "login";
	}

	@RequestMapping(value = "adminHome", method = RequestMethod.GET)
	public String showAdninHome(Model model) {

		return "PostHome";
	}

}

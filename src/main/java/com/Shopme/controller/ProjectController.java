package com.Shopme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.html");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/admin")
	public ModelAndView admin() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("adminpage.html");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/allproducts")
	public ModelAndView allProducts() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("allproducts.html");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/allpurchase")
	public ModelAndView allPurchase() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("allpurchase.html");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/allusers")
	public ModelAndView allUsers() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("allusers.html");
		return modelAndView;
	}

}

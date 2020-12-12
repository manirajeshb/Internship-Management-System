package com.uncc.internship;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uncc.internship.form.LoginForm;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		logger.info("home");
		ModelAndView model = new ModelAndView("home");
		return model;
	}

	@RequestMapping(value = "/submitHome.html", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, String> req) {
		logger.info("login");
		ModelAndView model = new ModelAndView("loginform");

		logger.info(model.getViewName());
		return model;
	}

}

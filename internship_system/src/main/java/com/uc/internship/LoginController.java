package com.uncc.internship;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.uncc.internship.form.InternshipDetailsReportForm;
import com.uncc.internship.form.LoginForm;
import com.uncc.internship.form.PersonSession;
import com.uncc.internship.form.SearchForm;
import com.uncc.internship.model.IntershipDetailsView;
import com.uncc.internship.service.LoginService;

@Controller
@SessionAttributes("user")
public class LoginController {
	@Autowired
	public LoginService loginService;

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	//all get methods

	@ModelAttribute("user")
	public PersonSession getVisitor(HttpServletRequest request) {
		return new PersonSession();
	}

	@RequestMapping(value = "/searchTitle.html", method = RequestMethod.GET)
	public String showSearchForm(Map model) {
		SearchForm searchForm = new SearchForm();

		model.put("searchForm", searchForm);

		
		return "loginsuccess";
	}
	
	@RequestMapping(value = "/loginform.html", method = RequestMethod.GET)
	public String showForm(Map model, @ModelAttribute("user") PersonSession user) {
		LoginForm loginForm = new LoginForm();
		InternshipDetailsReportForm internForm = new InternshipDetailsReportForm();
		user = new PersonSession();
		logger.info("showForm");
		SearchForm searchForm = new SearchForm();
		model.put("searchForm", searchForm);
		model.put("loginForm", loginForm);
		model.put("user", user);
		model.put("internForm", internForm);
		return "loginform";
	}

	@RequestMapping(value = "/loginform", method = RequestMethod.GET)
	public String show(Map model, @ModelAttribute("user") PersonSession user) {
		logger.info("show");
		LoginForm loginForm = new LoginForm();
		user = new PersonSession();
		InternshipDetailsReportForm internForm = new InternshipDetailsReportForm();
		SearchForm searchForm = new SearchForm();
		model.put("searchForm", searchForm);
		model.put("internForm", internForm);
		model.put("user", user);
		model.put("loginForm", loginForm);
		return "loginform";
	}

	//all posts method
	@RequestMapping(value = "/loginform.html", method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("loginForm") LoginForm loginForm,
			@ModelAttribute("internForm") InternshipDetailsReportForm internForm,
			@ModelAttribute("user") PersonSession user, Map model, BindingResult result) {
		logger.info("processForm" + loginForm.getUserName() + loginForm.getPassword());

		boolean userExists = loginService.checkLogin(loginForm.getUserName(), loginForm.getPassword(), user);
		if (userExists) {

			model.put("loginForm", loginForm);
			List<IntershipDetailsView> internship = loginService.internshipDetailsReport();
			if (internship!=null && !internship.isEmpty()) {
				model.put("internForm", "internship");
			} else {
				model.put("internForm", "No Internships");
			}
			
			model.put("user", user);
			//display all internships
			ModelAndView modelSuccess = new ModelAndView("loginsuccess", "internView", internship);
			modelSuccess.addAllObjects(model);
			modelSuccess.addObject("user", user);

			logger.info(modelSuccess.getViewName());
			return modelSuccess;

		} else {
			result.rejectValue("userName", "invaliduser");
			ModelAndView modelreject = new ModelAndView("loginform");
			return modelreject;
		}

	}


	@RequestMapping(value = "/searchTitle.html", method = RequestMethod.POST)
	public ModelAndView searchTitle(@ModelAttribute("searchForm") SearchForm searchForm, Map model,
			BindingResult result) {

		List<IntershipDetailsView> internship = loginService.internshipDetailsReport(searchForm.getSearchField());
		if (internship != null && !internship.isEmpty()) {
			model.put("searchForm", searchForm);

			ModelAndView modelSuccess = new ModelAndView("loginsuccess", "internView", internship);
			modelSuccess.addAllObjects(model);

			logger.info(modelSuccess.getViewName());
			return modelSuccess;

		} else {
			result.rejectValue("searchResult", "no job with provided Title");
			ModelAndView modelreject = new ModelAndView("loginsuccess");
			return modelreject;
		}

	}
	@RequestMapping(value = "/logout.html", method = RequestMethod.POST)
	public String handleRequestById(@ModelAttribute("user") PersonSession user, Model model, HttpServletRequest request,
			SessionStatus sessionStatus) {

		model.addAttribute("msg", "successfully Logged out");

		sessionStatus.setComplete();
		return "home";

	}


}

package com.uncc.internship;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uncc.internship.form.InternshipDetailsReportForm;
import com.uncc.internship.form.LoginForm;
import com.uncc.internship.model.IntershipDetailsView;
import com.uncc.internship.service.InternshipService;
import com.uncc.internship.service.LoginService;

@Controller
public class InternshipController {
	@Autowired
	public InternshipService internshipService;

	private static final Logger logger = LoggerFactory.getLogger(InternshipController.class);

	@RequestMapping(value = "/internshipdetails/{internshipID}", method = RequestMethod.POST)
	public ModelAndView listInternshipDetails(@PathVariable("internshipID") String internshipID, Model model) {
		StringBuilder internshipDetail = internshipService.getIntershipDetails(internshipID);

		model.addAttribute("internshipDetail", internshipDetail);
		model.addAttribute("internshipID", internshipID);
		ModelAndView modelinternDetail = new ModelAndView("internshipdetails", "internshipDetail", internshipDetail);

		logger.info(modelinternDetail.getViewName());
		return modelinternDetail;

	}

	@RequestMapping(value = "/internshipdetails/{companyID}", method = RequestMethod.POST)
	public ModelAndView getCompaniesIntershipOffer(@PathVariable("companyID") String companyID, Model model) {
		StringBuilder internshipDetail = internshipService.getCompaniesIntershipOffer(companyID);

		model.addAttribute("internshipDetail", internshipDetail);
		ModelAndView modelinternDetail = new ModelAndView("internshipdetails", "internshipDetail", internshipDetail);

		logger.info(modelinternDetail.getViewName());
		return modelinternDetail;

	}

}

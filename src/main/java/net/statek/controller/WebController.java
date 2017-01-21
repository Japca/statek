package net.statek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class WebController {
	private static final String VIEW = "statek";


	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String index(Model model) {
		return VIEW;
	}


}

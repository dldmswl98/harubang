package com.project.harubang.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class blogController {
	
	private static final Logger logger = LoggerFactory.getLogger(blogController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/blog/blog", method = RequestMethod.GET)
	public String login(Model model) {
		logger.info("Welcome blog!");
		return "/blog/blog";
	}
}

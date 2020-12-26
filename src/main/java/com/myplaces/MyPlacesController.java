package com.myplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPlacesController {
	
	/**
	 * Handle the /start endpoint
	 * @return
	 */
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	/**
	 * Handle the default endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}

}

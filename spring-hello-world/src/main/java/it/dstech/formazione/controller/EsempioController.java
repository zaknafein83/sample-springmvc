package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EsempioController {
	
	@RequestMapping("/welcome")
	public ModelAndView printHelloWorld() {
		
		
		return new ModelAndView("welcome", "messaggio", "Ciao a tutti");
	}
	
	@RequestMapping("giovanni")
	public ModelAndView altroHello() {
		return new ModelAndView("giovanni", "messaggio", "Ciao a tutti da giovanni");
	}

}

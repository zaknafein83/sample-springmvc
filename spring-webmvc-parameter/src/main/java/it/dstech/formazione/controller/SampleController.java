package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	
	@RequestMapping(value  = "/testChiamata")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		return new ModelAndView("risultato", "testo", testo);
	}
	
	@RequestMapping(value = "/raddoppio", method = RequestMethod.POST)
	public ModelAndView raddoppio(@RequestParam("testo") String testo, Model model) {
		return new ModelAndView("risultato", "testo", testo+" "+testo);
	}
	
	
	

}

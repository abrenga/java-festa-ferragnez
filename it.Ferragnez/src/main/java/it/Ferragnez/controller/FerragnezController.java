package it.Ferragnez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
import it.Ferragnez.Model.FerragnezModel;

@Controller
public class FerragnezController {
	
	@GetMapping("/indexForm")
	public String listenForm(Model model) {
		 model.addAtribute("Invitati", new FerragnezModel());	
		return "indexForm";
	}

}

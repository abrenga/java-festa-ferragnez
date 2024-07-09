package it.Ferragnez.controller;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.crypto.engines.SM2Engine.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import it.Ferragnez.Model.FerragnezModel;
import it.Ferragnez.Repository.RepoList;

@Controller
public class FerragnezController {

	@Autowired
	public RepoList repoList;
	
	
	@GetMapping("/indexForm")
	public String listenForm(Model model) {
		model.addAttribute("Invitati", new FerragnezModel());
		return "indexForm";
	}

	@PostMapping("/indexForm")
	public String inviotheName(@ModelAttribute FerragnezModel utenteDaCercare, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "indexForm";
		}
		List<FerragnezModel> listaInvitati = repoList.findAll();
		for (int i = 0; i < listaInvitati.size(); i++) {
			if(listaInvitati.get(i).getName()==utenteDaCercare.getName()&&listaInvitati.get(i).getSurmane()==utenteDaCercare.getSurmane()) {
				model.addAttribute("utente",utenteDaCercare );
			}
			

		}
	
		return "indexForm";
	}

}

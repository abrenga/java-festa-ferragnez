package it.Ferragnez.controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
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
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
public class FerragnezController {

	@Autowired
	public RepoList repoList;

	@GetMapping("/indexForm")
	public String listenForm(Model model) {
		model.addAttribute("invitato", new FerragnezModel());
		return "indexForm";
	}

	@PostMapping("/indexForm/response")
	public String inviotheName(@Valid @ModelAttribute("invitato")  FerragnezModel utenteDaCercare, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "indexForm";
		}

		List<FerragnezModel> listaInvitati = repoList.findAll();
		for (int i = 0; i < listaInvitati.size(); i++) {
			FerragnezModel m=listaInvitati.get(i);
			if(m.getName().equals(utenteDaCercare.getName())&&m.getSurname().equals(utenteDaCercare.getSurname())) {
				model.addAttribute("utente",m );
			}
			

		}
	
		return "response";
	}

}

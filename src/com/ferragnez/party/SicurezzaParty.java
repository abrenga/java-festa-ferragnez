package com.ferragnez.party;

import java.util.Scanner;

public class SicurezzaParty {
	Party party;
	public SicurezzaParty(Party party) {
		this.party=party;
		
	}
	Scanner scanner = new Scanner(System.in);

	public void chiediNome() {
		System.out.println("Scrivi il tuo nome:");
	
	}
	
	public String prendiNome() {
		String nome = scanner.nextLine();
		return nome;
	}
	
	
	public void processa( Ospite nomeOspite) {
		 boolean isFound = party.controllaOspite(nomeOspite.nome);
		party.accettaOspite(isFound, nomeOspite);
	}

}

package com.ferragnez.party;

import java.util.Scanner;

public class SicurezzaParty {//semplicemente in questa classe c'è tutto quello che era nel main
	//prima cosi da invocare solamente i metodi mantenendo il main pulito
	Party party;
	public SicurezzaParty(Party party) {
		this.party=party;//qui come costruttore passerò proprio la classe party
		
	}
	Scanner scanner = new Scanner(System.in);

	public void chiediNome() {
		System.out.println("Scrivi il tuo nome:");
	
	}
	
	public String prendiNome() {
		String nome = scanner.nextLine();
		return nome;
	}
	
	//all'inizio avevo passato come parametro nella funzione controllaOspite solo il parametro Ospite nomeOspite
	//provando l'esercizio mi stampava il puntamento alla cella, e ho preso dalla classe Ospite 
	//il nome chè è una stringa che viene passato al costruttore
	public void processa( Ospite nomeOspite) {
		 boolean isFound = party.controllaOspite(nomeOspite.nome);
		party.accettaOspite(isFound, nomeOspite);
	}

}


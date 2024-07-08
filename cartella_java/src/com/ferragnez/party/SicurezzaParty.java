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
	
	//all'inizio avevo passato come parametro nella funzione, controllaOspite solo il parametro Ospite nomeOspite
	//provando l'esercizio mi stampava il puntamento alla cella, e ho preso dalla classe Ospite 
	//il nome chè è una stringa che viene passato al costruttore
	public void processa( Ospite nomeOspite) {
		 boolean isFound = party.controllaOspite(nomeOspite.nome);
		 boolean isLuis = party.isLuis(nomeOspite);

		party.accettaOspite(isFound,isLuis, nomeOspite);
		
	}

}

//>Ho riscontrato le seguenti difficolta:
//capire se si trattava dell'istanza del Ospite o la stringa presente nell'isanza(mi ha aiutato L'IDE), 
//faccio ancora confusione nel raggionamnto a Classi.
//Ho speso tanto tempo per fare il BOnus perchè all'inizio volevo passare alla funzione controllaOspite
//anche la condizione che verificava se era luis ovviamente non riuscivo, Dopo ho invece fatto una funzione a 
//parte che controllava se era luis e poi ho passato direttamente la funzione di verifica alla funzione accettaOspite
//ho 
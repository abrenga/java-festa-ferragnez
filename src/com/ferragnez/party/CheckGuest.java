package com.ferragnez.party;



public class CheckGuest {
	public static void main(String[] args) {
		//all'inizio avevo pensato di mettere tutto l'array nella classe SICUREZZApARTY poi ho pensato
		//che una classe che è un prototipo di qualcosa non dovrebbe avere nulla di specifico quindi ho preferito mantenerlo nel main
		String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", " Martina Maccherone", "Rachel Zeilic" };
		
		/*
		 * Boolean isFound = false; //System.out.println(nome.equals("Luis")); for (int
		 * i = 0; i < guests.length; i++) { if (nome.equals(guests[i])) {
		 * 
		 * isFound = true; break; } } if (isFound) { System.out.println("benvenuto " +
		 * nome); } else { System.out.println("non sei in lista"); }
		 */
		
//qui ho creato un istanza di Party passando l'arrey al costruttore
		Party party = new Party(guests);
//qui creata l'istanza di password sicurezza ho passato l'oggetto party
		SicurezzaParty sicurezza = new SicurezzaParty(party);
		sicurezza.chiediNome();//qui chede il nome
		String nome= sicurezza.prendiNome();//qui prende il nome e lo ritorna		
		Ospite nomeOspite = new Ospite(nome);//crea l'istanza dell'ospite ho creato una classe 
		//Ospite perchè ho pensato che avere un entità ospite potesse esssere corretta come idea
		
		sicurezza.processa(nomeOspite);//qui invoca le funzioni di controllo e accettazione del nome

	}
}

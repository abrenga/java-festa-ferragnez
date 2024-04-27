package com.ferragnez.party;



public class CheckGuest {
	public static void main(String[] args) {
		
		String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", " Martina Maccherone", "Rachel Zeilic" };
		

		
		/*
		 * Boolean isFound = false; //System.out.println(nome.equals("Luis")); for (int
		 * i = 0; i < guests.length; i++) { if (nome.equals(guests[i])) {
		 * 
		 * isFound = true; break; } } if (isFound) { System.out.println("benvenuto " +
		 * nome); } else { System.out.println("non sei in lista"); }
		 */

		Party party = new Party(guests);

		SicurezzaParty sicurezza = new SicurezzaParty(party);
		sicurezza.chiediNome();
		String nome= sicurezza.prendiNome();		
		Ospite nomeOspite = new Ospite(nome);
		
		sicurezza.processa(nomeOspite);

	}
}

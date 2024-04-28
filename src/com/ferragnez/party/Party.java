package com.ferragnez.party;

public class Party {
	String[] arrayInvitati;

	public Party(String[] arrayInvitati) {// costruttore dell'array
		this.arrayInvitati = arrayInvitati;

	}
//questa funzione controlla se il nome passato è in lista ritorna un booleano
	public boolean controllaOspite(String nome) {
		boolean isFound = false;

		for (int i = 0; i < arrayInvitati.length; i++) {
			if (nome.equals(arrayInvitati[i])) {
				isFound = true;
			}

		}
		return isFound;
	}
	
//qui controlla se il nome passato a terminale è Luis
	public boolean isLuis(Ospite nome) {
		boolean isLuisAntipatico = false;
		if (nome.nome.equals("Luis")) {
			isLuisAntipatico = true;
		}
		return isLuisAntipatico;

	}

	//in questa funziona accetta l'ospite se sono verificate le condizioni
	public void accettaOspite(boolean isFound, boolean isLuis, Ospite nome) {
		if (isFound) {
			if (isLuis) {
				nome.nome = "Antonietta";
				System.out.println("Luis mi dispiace non sei ben accetto, al tuo posto entrerà " + nome.nome);
				
			}else {System.out.println("benvenuto " + nome.nome);}
			
		} else {
			System.out.println("non sei in lista");
		}

	}

}


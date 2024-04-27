package com.ferragnez.party;

public class Party {
	String[] arrayInvitati;
	
	public Party(String[] arrayInvitati){//costruttore dell'array
		this.arrayInvitati = arrayInvitati;
		
	}
	
	
	public boolean controllaOspite(String nome) {//qui controlla l'ospite
		boolean isFound=false;
		for (int i = 0; i < arrayInvitati.length; i++) {
			if (nome.equals(arrayInvitati[i])) {
				isFound = true;

			} 
			
		}
		return isFound;
	}

	public void accettaOspite(boolean isFound, Ospite nome) {//qui accetta l'ospite
		if (isFound) {
			System.out.println("benvenuto " + nome.nome);
		} else {
			System.out.println("non sei in lista");
		}
	}

}

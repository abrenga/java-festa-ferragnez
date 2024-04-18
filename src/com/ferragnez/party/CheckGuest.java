package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", " Martina Maccherone", "Rachel Zeilic" };

		System.out.println("Scrivi il tuo nome:");
		String nome = scanner.nextLine();
		Boolean isFound = false;
		//System.out.println(nome.equals("Luis"));
		for (int i = 0; i < guests.length; i++) {
			if (nome.equals(guests[i])) {

				isFound = true;
				break;
			}
		}
		if (isFound) {
			System.out.println("benvenuto " + nome);
		} else {
			System.out.println("non sei in lista");
		}

	}
}

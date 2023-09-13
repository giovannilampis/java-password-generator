package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
	
		// Richiedi all'utente di inserire le sue informazioni personali
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();
        
        System.out.println("Inserisci il tuo colore preferito: ");
        String colorePreferito = scanner.nextLine();
        
        System.out.print("In che giorno sei nato ?");
		int giornoNascita = scanner.nextInt();
		
		System.out.print("In che mese sei nato ?");
		int meseNascita = scanner.nextInt();
		
		System.out.print("In che anno sei nato ?");
		int annoNascita = scanner.nextInt();
        
        scanner.close();

        // somma di giorno, mese e anno di nascita
        
        int sommaDataDiNascita = giornoNascita + meseNascita + annoNascita;

        // Genera la password
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataDiNascita;

        // Stampa la password
        System.out.println("La tua password è: " + password);
	}
}

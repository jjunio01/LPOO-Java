/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class ContadorLetras {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String frase;
		int contadorLetras = 0;
		
		System.out.println("Escreva uma frase: ");
		frase = scan.nextLine();
		scan.close();
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) != ' ' && frase.charAt(i) != '.') {
				contadorLetras++;
			} 
		}
		
		System.out.println("A frase: " + frase);
		System.out.println("Possui: " + contadorLetras + " letras.");
	}
}

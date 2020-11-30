/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class InverteFrase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String frase;
		String fraseInvertida = "";
		System.out.println("Escreva uma frase: ");
		frase = scan.nextLine();
		
		scan.close();
		
		for (int i = frase.length() - 1; i >= 0 ; i--) {
			
			fraseInvertida += frase.charAt(i);
			
		}
		
		System.out.println("Frase digitada: " + frase);
		System.out.println("Frase invertida: " + fraseInvertida);

	}

}

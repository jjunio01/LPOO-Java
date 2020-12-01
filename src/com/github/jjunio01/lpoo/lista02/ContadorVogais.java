/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class ContadorVogais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int quantidadeVogais = 0;
		String frase;
		
		System.out.println("Digite uma frase: ");
		frase = scan.nextLine();
		scan.close();
		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) == 'a' ||
					frase.charAt(i) == 'e' ||
						frase.charAt(i) == 'i' ||
							frase.charAt(i) == 'o' ||
								frase.charAt(i) == 'u') {
				quantidadeVogais++;
			}
		}
		
		System.out.println("Na frase: " + frase);
		System.out.println("Temos: " + quantidadeVogais + " vogais.");
		
	}

}

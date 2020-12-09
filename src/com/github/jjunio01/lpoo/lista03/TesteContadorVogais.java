/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class TesteContadorVogais {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String frase;

		System.out.println("Digite uma frase: ");
		frase = scan.nextLine();

		System.out.println("A frase : " + frase);
		System.out.println("Tem: " + ContadorVogais.contador(frase) + " vogais");
		scan.close();

	}

}

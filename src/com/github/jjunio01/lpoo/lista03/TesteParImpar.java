/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class TesteParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = scan.nextInt();
		scan.nextLine();
		scan.close();
		
		if (ParImpar.ehPar(numero)) {
			System.out.println("O n�mero " + numero + " eh par.");
		} else {
			System.out.println("O n�mero " + numero + " eh �mpar.");
		}
		
	}

}

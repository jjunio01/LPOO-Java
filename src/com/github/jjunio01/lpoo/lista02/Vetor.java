/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class Vetor {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] numeros = new double[10];
		double soma = 0;
		String vetor = "[";
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor");
			numeros[i] = scan.nextDouble();
			soma += numeros[i];
		}
		scan.close();
		
		for (double numero : numeros) {
			vetor += " " + numero;
		}
		System.out.println("Numeros digitados: " + vetor + " ]");
		System.out.println("A soma dos valores digitados é: " + soma);
		

	}

}

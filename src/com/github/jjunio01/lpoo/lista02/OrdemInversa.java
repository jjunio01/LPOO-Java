/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class OrdemInversa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] numeros = new double[10];
		String impressaoVetor = "[";
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = scan.nextDouble();
		}
		scan.close();
		
		for (int i = numeros.length - 1; i >= 0; i--) {
			
			if (i != 0) {
				impressaoVetor += numeros[i] + ", ";
			} else {
				impressaoVetor += numeros[i] + " ]";
			}
		}
		
		System.out.println("Os números digitados na ordem inversa são: ");
		System.out.println(impressaoVetor);
		
	}

}

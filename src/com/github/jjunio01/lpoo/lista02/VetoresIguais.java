/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class VetoresIguais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] vetorUm = new double[5];
		double[] vetorDois = new double[5];
		
		for (int i = 0; i < vetorUm.length; i++) {
			
			System.out.print("Digite o " + (1 + i) + "º valor do vator um: ");
			vetorUm[i] = scan.nextDouble();
			System.out.print("Digite o " + (1 + i) + "º valor do vator dois: ");
			vetorDois[i] = scan.nextDouble();
			
		}
		scan.close();
		
		int contador = 0;
		for (int i = 0; i < vetorUm.length; i++) {
			
			if (contador == 5) {
				break;
			} else {
				
				for (int j =0; j < vetorDois.length; j++) {
					if (vetorUm[i]== vetorDois[j]) {
						contador = 0;
						break;
					} else {
						contador++;
					}
				}
				
			}
			
		}
		
		if (contador == 5) {
			System.out.println("Os vetores são diferentes");
		} else {
			System.out.println("Os vetores são iguais");
		}
	}

}

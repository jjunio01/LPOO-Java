/**
 * 
 */
package com.github.jjunio01.lpoo.lista01;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class Altura {

	
	public static void main(String[] args) {
		
		calcularMedia();
	}
	
	public static double[] lerInformacoes() {
		
		Scanner scan = new Scanner(System.in);		
		double[] alturas = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o valor da " + (i+ 1) +"ª altura");
			alturas[i] = scan.nextDouble();
		}
		scan.close();
		return alturas;
	}
	
	public static void calcularMedia() {
		double[] alturas = new double[5];
		alturas = lerInformacoes();
		double soma = 0;
		double media = 0;
		
		for (double altura: alturas) {
			soma += altura;
		}
		media = soma / 5;
		System.out.println("A média das alturas é: " + media );
	}
	

}

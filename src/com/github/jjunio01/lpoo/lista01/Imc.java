package com.github.jjunio01.lpoo.lista01;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class Imc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double peso;
		double altura;
		int quantidadePessoas = 5;
		double[] imcs = new double[quantidadePessoas];
		int quantidadeAcimaPeso = 0;
		int quantidadeAbaixoPeso = 0;
		int quantidadePesoIdeal = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o peso da " + (i + 1) + " pessoa: ");
			peso = scan.nextDouble();
			System.out.println("Digite o altura da " + (i + 1)+ " pessoa: ");
			altura = scan.nextDouble();
			imcs[i] = peso / (altura * altura);
		}
		
		for (double imc: imcs) {
			if (imc < 18.5) {
				quantidadeAbaixoPeso++;
			} else if (imc >= 18.5 && imc < 25) {
				quantidadePesoIdeal++;
			} else {
				quantidadeAcimaPeso++;
			}
		}
		
		System.out.println(quantidadeAbaixoPeso + " - pessoas estão abaixo do peso.\n"
				+ quantidadePesoIdeal + " - pesooas estão com o peso ideal.\n"
						+ quantidadeAcimaPeso + " - pessoas estão acima do peso ideal.");
		
		scan.close();
	}

}

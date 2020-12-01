/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class AcimaDaMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] notas = new double[10];
		double soma = 0;
		double media = 0;
		int notasAcimaMedia = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite o valor da " + (i + 1) + "� nota: ");
			notas[i] = scan.nextDouble();
			soma += notas[i];
		}
		scan.close();
		media = soma / notas.length;
		
		for (double nota: notas) {
			if (nota > media) {
				notasAcimaMedia++;
			}
		}
		
		System.out.println("A m�dia das notas �: " + media);
		System.out.println("Temos " + notasAcimaMedia + " alunos com notas acima da m�dia");

	}

}

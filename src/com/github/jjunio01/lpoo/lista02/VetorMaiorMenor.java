/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class VetorMaiorMenor {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] numeros = new double[10];
		double maior;
		double menor;
		double soma = 0;
		double media = 0;
		boolean lerNumeros = true;
		int contador = 0;
		
		while (lerNumeros) {
			System.out.println("Digite o valor do " +(contador + 1) + "º número:");
			numeros[contador] = scan.nextDouble();
			soma += numeros[contador];
			contador++;
			if (contador > 9) {
				lerNumeros = false;
			}
		}
		scan.close();
		maior = numeros[0];
		menor = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			if (menor > numeros[i]) {
				menor = numeros[i];
			}
			if (maior < numeros[i]) {
				maior = numeros[i];
			}
		}
		media = soma / numeros.length;
		System.out.println("Menor valor digitado: " + menor);
		System.out.println("Maior valor digitado: " + maior);
		System.out.println("Média dos valores digitados: " + media);
		
		
	}

}

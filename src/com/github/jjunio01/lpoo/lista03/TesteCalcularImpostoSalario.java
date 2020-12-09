/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class TesteCalcularImpostoSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double salario;
		double imposto;
		System.out.println("Digite o valor do salário: ");
		salario = scan.nextDouble();
		
		imposto = CalcularImpostoSalario.calcular(salario);
		
		System.out.println("Salário R$: " + salario);
		System.out.println("Imposto R$: " + imposto);
		scan.close();

	}

}

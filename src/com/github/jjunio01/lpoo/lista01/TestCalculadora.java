package com.github.jjunio01.lpoo.lista01;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class TestCalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double valorUm;
		double valorDois;
		String operador;

		System.out.println("Digite o primeiro valor: ");
		valorUm = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		valorDois = scan.nextDouble();
		System.out.println("Digite um dos operadores: '+', '-', '*', '/': ");
		operador = scan.next();

		System.out.println("O resultado de " + valorUm + " " +operador + " " + valorDois + " é: "
				+ Calculadora.calcular(valorUm, valorDois, operador));
		scan.close();
	}

}

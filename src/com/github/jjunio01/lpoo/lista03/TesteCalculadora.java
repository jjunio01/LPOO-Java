/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class TesteCalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double valorUm;
		double valorDois;
		String operacao;

		System.out.println("Digite o primeiro valor: ");
		valorUm = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		valorDois = scan.nextDouble();
		System.out.println("Digite a operação desejada seguindo o modelo:\n" + "+ Para soma;\n" + "- Para subtração;\n"
				+ "* Para multiplicação;\n" + "/ Para divisão. ");
		operacao = scan.next();
		scan.close();

		System.out.println(valorUm + " " + operacao + " " + valorDois + " é: "
				+ Calculadora.calcular(valorUm, valorDois, operacao));

	}

}

/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

/**
 * @author JJunio
 *
 */
public class Calculadora {

	public static double calcular(double valorUm, double valorDois, String operacao) {
		if (operacao.equals("+")) {
			return soma(valorUm, valorDois);
		} else if (operacao.equals("-")) {
			return subtracao(valorUm, valorDois);
		} else if (operacao.equals("*")) {
			return multiplicacao(valorUm, valorDois);
		} else if (operacao.equals("/")) {
			return divisao(valorUm, valorDois);
		} else {
			System.out.println("Operação inválida");
			return -1;
		}
	}

	public static double soma(double valorUm, double valorDois) {
		return valorUm + valorDois;
	}
	public static double subtracao(double valorUm, double valorDois) {
		return valorUm - valorDois;
	}
	public static double multiplicacao(double valorUm, double valorDois) {
		return valorUm * valorDois;
	}
	public static double divisao(double valorUm, double valorDois) {
		return valorUm / valorDois;
	}
}

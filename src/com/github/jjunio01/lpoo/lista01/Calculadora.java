package com.github.jjunio01.lpoo.lista01;

/**
 * @author JJunio
 *
 */
public class Calculadora {
	
	private static double soma(double valorUm, double valorDois) {
		return valorUm + valorDois;
	}
	private static double subtracao(double valorUm, double valorDois) {
		return valorUm - valorDois;
	}
	private static double multiplicacao(double valorUm, double valorDois) {
		return valorUm * valorDois;
	}
	private static double divisao(double valorUm, double valorDois) {
		return valorUm / valorDois;
	}
	
	public static double calcular(double valorUm, double valorDois, String operador) {
		
		if (operador.equals("+")) {
			return soma(valorUm, valorDois);
		} else if (operador.equals("-")) {
			return subtracao(valorUm, valorDois);
		}else if (operador.equals("*")) {
			return multiplicacao(valorUm, valorDois);
		}else if (operador.equals("/")) {
			return divisao(valorUm, valorDois);
		}else {
			System.out.println("Operador inválido.");
			return -1;
		}
	}
	
}

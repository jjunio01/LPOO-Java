package com.github.jjunio01.lpoo.lista01;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class Idade {

	public static void main(String[] args) {
		
		System.out.println("Sua idade é: " + 
				calcular(
						lerInformações()
				)
		);
		
	}
	
	public static int[] lerInformações() {
		
		Scanner scan = new Scanner(System.in);
		int anoAtual, anoNascimento;
		
		System.out.println("Digite o ano atual: ");
		anoAtual = scan.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = scan.nextInt();
		
		int[] informacoes = {anoAtual, anoNascimento};
		
		return informacoes;
	}
	
	public static int calcular(int[] anos) {
		
		return anos[0] - anos[1];
	}

}
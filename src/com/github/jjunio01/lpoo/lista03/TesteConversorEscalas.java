/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class TesteConversorEscalas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double fahrenheit;
		boolean converter = true;
		String opcao;
		
		while (converter) {
			
			System.out.println("Escolha uma das op��es: \n"
					+ "1 - Transformar de Fahrenheit para Celsius\n"
					+ "2 - Transformar de Kelvin para Celsius\n"
					+ "0 - Sair");
			opcao = scan.nextLine();
			
			if (opcao.equals("1")) {
				System.out.println("Digite o valor dos graus em Fahrenheit: ");
				fahrenheit = scan.nextDouble();
				scan.nextLine();
				System.out.println(ConversaoEscalaKelvinFahrenheitParaCelsius.converterFahrenheitCelsius(fahrenheit) +
						"� Celsius");
			} else if (opcao.equals("2")) {
				System.out.println("Digite o valor dos graus em Fahrenheit: ");
				fahrenheit = scan.nextDouble();
				scan.nextLine();
				System.out.println(ConversaoEscalaKelvinFahrenheitParaCelsius.converterKelvinCelsius(fahrenheit) +
						"� Celsius");
				;
			} else if (opcao.equals("0")) {
				System.out.println("Encerrando o programa.");
				converter = false;
			}
		}
		scan.close();
	}
}

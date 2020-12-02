/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class TesteRetangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Retangulo retangulo;
		double base;
		double altura;
		double area;
		double perimetro;
		
		System.out.println("Digite o valor da base do retângulo: ");
		base = scan.nextDouble();
		System.out.println("Digite o valor da altura do retângulo: ");
		altura = scan.nextDouble();
		retangulo = new Retangulo(base, altura);
		area = retangulo.calcularArea();
		perimetro = retangulo.calcularPerimetro();
		scan.close();
		
		System.out.println("Retângulo: \n"
				+ "Base: " + base
				+ "\nAltura: " + altura
				+ "\nArea: " + area
				+ "\nPerimétro: " + perimetro );
		
		

	}

}

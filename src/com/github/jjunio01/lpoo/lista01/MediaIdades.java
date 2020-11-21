package com.github.jjunio01.lpoo.lista01;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class MediaIdades {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		double media;
		boolean diferenteZero = true;
		int contador = 1;
		int valor;
		
		while (diferenteZero) {
			System.out.println("Digite a idade da " + contador + "ª pessoa: ");
			
			valor = scan.nextInt();			
			if (valor != 0) {
				soma += valor;
				contador++;
			}else {
				diferenteZero = false;
			}
		}
		media = (double) soma / (contador - 1);
		
		System.out.println("A média das " + (contador -1) + " idades é : " + media);
		scan.close();
		
	}

}

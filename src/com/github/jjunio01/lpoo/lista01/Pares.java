package com.github.jjunio01.lpoo.lista01;

import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class Pares {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o final do intervalo de número pares: ");
		imprimirParesPositivos(
				scan.nextInt()
				);
		scan.close();

	}
	
	public static void imprimirParesPositivos(int fimIntervalo) {
		
		System.out.println("Os números pares entre 0 e " + fimIntervalo + " são:");
		for (int i = 0; i <= fimIntervalo; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

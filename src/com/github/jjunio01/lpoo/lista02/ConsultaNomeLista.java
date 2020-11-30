/**
 * 
 */
package com.github.jjunio01.lpoo.lista02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JJunio
 *
 */
public class ConsultaNomeLista {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>();
		String nome;
		int quantidadeNomes;
		boolean consulta = true;
		
		System.out.println("Digite quantos nomes deseja cadastrar: ");
		quantidadeNomes = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < quantidadeNomes; i++) {
			System.out.println("Digite o nome da " + (i + 1) + "ª pessoa");
			nome = scan.nextLine();
			nomes.add(nome);
		}
		
		while (consulta) {
			System.out.print("Digite o nome de uma pessoa cadastrada: ");
			nome = scan.nextLine();
			if (nomes.contains(nome)) {
				System.out.println("O nome: " + nome + " está cadastrado.");
				consulta = false;
			} else {
				System.out.println(nome + " não cadastrada.");
			}
			
		}
		

	}

}

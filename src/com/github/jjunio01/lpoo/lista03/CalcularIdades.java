
package com.github.jjunio01.lpoo.lista03;

import javax.swing.JOptionPane;

/**
 * @author JJunio
 *
 */
public class CalcularIdades {

	public static void main(String[] args) {

		Pessoa[] arrayPessoas = new Pessoa[4];
		String nome;
		int idade;
		Pessoa pessoa;

		for (int i = 0; i < arrayPessoas.length; i++) {
			nome = JOptionPane.showInputDialog("Digite o nome da " + (i + 1) + " pessoa.");
			idade = Integer.parseInt(
					JOptionPane.showInputDialog("Digite a idade da " + (i + 1) + " pessoa."));
			arrayPessoas[i] = new Pessoa(nome, idade);
		}
		
		JOptionPane.showMessageDialog(null, "A pessoa mais velha é : "
				+ pessoaMaisVelha(arrayPessoas).getIdade() +
				"\nA pessoa mais nova é: " +
				pessoaMaisNova(arrayPessoas).getIdade() +
				"\nTem " + maioresDeDezoito(arrayPessoas) + " pessoas tem mais de 18 anos");
	}

	public static Pessoa pessoaMaisVelha(Pessoa[] pessoas) {
		Pessoa pessoaMaisVelha = pessoas[0];

		for (Pessoa pessoa : pessoas) {
			if (pessoaMaisVelha.getIdade() < pessoa.getIdade()) {
				pessoaMaisVelha = pessoa;
			}
		}

		return pessoaMaisVelha;
	}

	public static Pessoa pessoaMaisNova(Pessoa[] pessoas) {
		Pessoa pessoaMaisNova = pessoas[0];

		for (Pessoa pessoa : pessoas) {
			if (pessoaMaisNova.getIdade() > pessoa.getIdade()) {
				pessoaMaisNova = pessoa;
			}
		}

		return pessoaMaisNova;
	}

	public static int maioresDeDezoito(Pessoa[] pessoas) {
		int contador = 0;

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() > 18) {
				contador++;
			}
		}

		return contador;
	}
}

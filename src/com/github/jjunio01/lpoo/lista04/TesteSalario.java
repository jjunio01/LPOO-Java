package com.github.jjunio01.lpoo.lista04;

import javax.swing.JOptionPane;

/**
 * @author JJunio
 *
 */
public class TesteSalario {

	public static void main(String[] args) {

		Funcionario[] listaFunci;
		String nome;
		double salario;

		listaFunci = new Funcionario[Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionários a serem cadastrados:"))

		];
		for (int i = 0; i < listaFunci.length; i++) {
			nome = JOptionPane.showInputDialog("Digite o nome da " + (i + 1) + " pessoa.");
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário da " + (i + 1) + " pessoa."));
			listaFunci[i] = new Funcionario(nome, salario);
		}

		JOptionPane.showMessageDialog(null,
				"Existem  : " + salarioMaiorCincoMil(listaFunci) + " pessoas com mais de 5.000,00.");
	}

	public static int salarioMaiorCincoMil(Funcionario[] funcionarios) {
		int contador = 0;

		for (Funcionario funci : funcionarios) {
			if (funci.getSalario() > 5000) {
				contador++;
			}
		}

		return contador;
	}
}

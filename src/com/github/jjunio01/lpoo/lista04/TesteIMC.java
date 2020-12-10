package com.github.jjunio01.lpoo.lista04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author JJunio
 *
 */
public class TesteIMC {

	public static void main(String[] args) {

		int quantidade;
		String nome;
		double peso, altura;
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();

		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas:"));

		for (int i = 0; i < quantidade; i++) {
			nome = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + " pessoa:");
			peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso " + (i + 1) + " pessoa:"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o altura " + (i + 1) + " pessoa:"));
			listaPessoas.add(new Pessoa(nome, peso, altura));
		}

		JOptionPane.showMessageDialog(null, "Pessoas acima do peso: " + calcularIMCAcimaPeso(listaPessoas));

	}

	public static String calcularIMCAcimaPeso(ArrayList<Pessoa> listaPessoas) {
		String nomePessoasAcimaPeso = "\n";
		double imc;

		for (int i = 0; i < listaPessoas.size(); i++) {
			imc = listaPessoas.get(i).getPeso()
					/ (Math.pow(listaPessoas.get(i).getAltura(), listaPessoas.get(i).getAltura()));
			if (imc >= 25) {
				nomePessoasAcimaPeso += listaPessoas.get(i).getNome() + "\n";
			}
		}

		return nomePessoasAcimaPeso;
	}

}

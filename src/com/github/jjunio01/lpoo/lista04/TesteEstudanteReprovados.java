package com.github.jjunio01.lpoo.lista04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author JJunio
 *
 */
public class TesteEstudanteReprovados {

	public static void main(String[] args) {

		ArrayList<Estudante> listaAlunos = new ArrayList<>();
		ArrayList<Estudante> listaAlunosReprovados = new ArrayList<>();
		String nome;
		double notas[];

		for (int i = 0; i < 2; i++) {
			notas = new double[2];
			nome = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + " estudante.");

			for (int j = 0; j < 2; j++) {
				notas[j] = Double
						.parseDouble(JOptionPane.showInputDialog("Digite a " + (j + 1) + " nota do estudante."));
			}

			listaAlunos.add(new Estudante(nome, notas));
		}

		listaAlunosReprovados = verificarReprovados(listaAlunos);

		for (int i = 0; i < listaAlunosReprovados.size(); i++) {
			JOptionPane.showMessageDialog(null,
					verificarReprovados(listaAlunos).get(i).getNome() + " está reprovado");
		}

	}

	public static ArrayList<Estudante> verificarReprovados(ArrayList<Estudante> listaAlunos) {
		ArrayList<Estudante> listaAlunosReprovados = new ArrayList<>();

		for (int i = 0; i < listaAlunos.size(); i++) {
			Estudante estudante = listaAlunos.get(i);
			double notaUm, notaDois, media;
			notaUm = estudante.getNotas()[0];
			notaDois = estudante.getNotas()[1];
			media = (notaUm + notaDois) / 2;

			if (media < 7) {
				listaAlunosReprovados.add(estudante);
			}

		}

		return listaAlunosReprovados;

	}
}

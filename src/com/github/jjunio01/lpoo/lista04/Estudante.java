package com.github.jjunio01.lpoo.lista04;

/**
 * @author JJunio
 *
 */
public class Estudante {

	private String nome;
	private double[] notas;

	public Estudante(String nome, double[] notas) {

		this.nome = nome;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}

/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

import javax.swing.JOptionPane;

/**
 * @author JJunio
 *
 */
public class MediaVetor {

	public static void main(String[] args) {
		
		int tamanho;
		double[] valores;
		
		tamanho = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade de números: "));
		valores = new double[tamanho];
		for (int i = 0; i < tamanho; i++) {
			valores[i] = Double.parseDouble(
					JOptionPane.showInputDialog("Digite o " + (i + 1) + " valor: ")
					);
		}
		
		JOptionPane.showMessageDialog(null, "A média é: " + calcularMedia(valores));;

	}
	
	public static double calcularMedia(double[] valores) {
		double media = 0;
		double soma = 0;
		
		for (double valor: valores) {
			soma += valor;
		}
		
		media = soma / valores.length;
		return media;
	}

}

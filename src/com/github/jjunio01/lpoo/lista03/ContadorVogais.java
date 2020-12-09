/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

/**
 * @author JJunio
 *
 */
public class ContadorVogais {

	public static int contador(String frase) {
		String fraseFormatada = frase.toLowerCase();
		int vogais = 0;

		for (int i = 0; i < fraseFormatada.length(); i++) {
			if (fraseFormatada.charAt(i) == 'a' || fraseFormatada.charAt(i) == 'e' || fraseFormatada.charAt(i) == 'i'
					|| fraseFormatada.charAt(i) == 'o' || fraseFormatada.charAt(i) == 'u') {
				vogais++;
			}
		}
		return vogais;
	}
}

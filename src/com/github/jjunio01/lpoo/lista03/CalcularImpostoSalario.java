/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

/**
 * @author JJunio
 *
 */
public class CalcularImpostoSalario {

	public static double calcular(double salario) {
		double imposto = 0.00;
		
		if (salario > 2000.00 && salario <= 3500.00) {
			imposto = salario * 0.15;
		}else if (salario > 3500.00 && salario <= 5000.00){
			imposto = salario * 0.22;
		} else if(salario > 5000.00){
			imposto = salario * 0.3;
		}
		return imposto;
	}
}

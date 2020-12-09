/**
 * 
 */
package com.github.jjunio01.lpoo.lista03;

/**
 * @author JJunio
 *
 */
public class ConversaoEscalaKelvinFahrenheitParaCelsius {

	public static double converterFahrenheitCelsius(double fahrenheit) {
		//De Fahrenheit	para Celsius (C = 5(F - 32) / 9)
		return 5 * ((fahrenheit - 32 ) / 9 );
	}
	
	public static double converterKelvinCelsius(double kelvin) {
		//Kelvin para Celsius (C = (K - 273))
		return kelvin - 273.0;
	}
	
}

package den01bigdecimal;

import java.math.BigDecimal;

// ÚLOHA
public class Priklad03BigDecimalSucetRiesenie {
	
	/*
	 * Ctrl + Shift + O = organizovanie importov (zbytocne zmaze, chybajuce prida)
	 * Úlohou je sčítať prvých 100 čísel použitím BigDecimalu. 
	 */
	public static void main(String[] args) {
		long zaciatok = System.currentTimeMillis();
		
		BigDecimal sumar = BigDecimal.ZERO;
		for (int i = 1; i <= 1000000; i++) {
			sumar = sumar.add( BigDecimal.valueOf(i) );
		}
		
		long koniec = System.currentTimeMillis();
		System.out.println( koniec - zaciatok );
		System.out.println( sumar );
	}
}

package den02list;

import java.util.ArrayList;
import java.util.List;

// ÚLOHA
public class Priklad04SazkaSportkaRiesenie {
	
	/*
	 * Vygeneruj zoznam čísel športky tak, aby sa neopakovali.
	 * Vystup: šesť náhodných čísel z intervalu 1 - 49
	 * 
	 * Pomôcka:
	 * 	nahodneCeleCislo = (int) ( 1 + Math.random() * 49 );
	 */
	public static void main(String[] args) {
		List<Integer> vygenerovaneCisla = new ArrayList<>();
		
		while ( vygenerovaneCisla.size() < 6 ) {
			int nahodneCeleCislo = (int) ( 1 + Math.random() * 49 );
			// to, čo sme vygenerovali, musíme porovnať s tým, čo už vygenerované bolo
			if ( ! vygenerovaneCisla.contains(nahodneCeleCislo) ) {
				vygenerovaneCisla.add(nahodneCeleCislo);
			}
		}
		System.out.println(vygenerovaneCisla);
	}

}

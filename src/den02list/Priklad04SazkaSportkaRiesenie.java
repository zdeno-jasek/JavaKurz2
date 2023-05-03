package den02list;

import java.util.Set;
import java.util.TreeSet;

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
		Set<Integer> vygenerovaneCisla = new TreeSet<>();
		
		while ( vygenerovaneCisla.size() < 6 ) {
			vygenerovaneCisla.add((int) ( 1 + Math.random() * 49 ));
		}
		System.out.println(vygenerovaneCisla);
	}

}

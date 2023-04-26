package den01date;

import java.time.LocalDate;

// ÚLOHA
public class Priklad06VianoceRiesenie {

	/*
	 * Program vypíše pre daný dátum, či sú to Vianoce 
	 * (24. 12. alebo 25. 12. alebo 26. 12.)
	 * 
	 * Pomôcka:
	 * 		datum.getDayOfMonth();
	 * 		datum.getMonthValue();
	 * 
	 */
	public static void main(String[] args) {
		LocalDate datum = LocalDate.of(2022, 12, 25); // LocalDate.now();
		if ( datum.getMonthValue() == 12 && datum.getDayOfMonth() >= 24 && datum.getDayOfMonth() <= 26 ) {
			System.out.println( "Dna " + datum + " boli Vianoce");				
		} else {
			System.out.println( "Dna " + datum + " neboli Vianoce");
		}
	}

}

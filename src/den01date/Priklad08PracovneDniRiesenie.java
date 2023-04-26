package den01date;

import java.time.DayOfWeek;
import java.time.LocalDate;

// ÚLOHA
public class Priklad08PracovneDniRiesenie {

	/*
	 * Program vypíše všetky pracovné dni v tomto mesiaci.
	 * Pomôcky:
	 * 	datum.getDayOfWeek() == DayOfWeek.SUNDAY
	 * 	datum.getDayOfWeek() == DayOfWeek.SATURDAY
	 * 	datum.minusDays
	 *  datum.plusDays
	 * 	LocalDate.now()
	 *  datum.getMonthValue()
	 */
	public static void main(String[] args) {
		
		// 3. 4. 2023, 4.4.2023, 5.4.2023 ...
		LocalDate datum = LocalDate.now();
		
		// aktualny datum zarovnam na prveho v mesiaci tak, ze odpocitam poradove cislo dna v mesiaci
		datum = datum.minusDays( datum.getDayOfMonth() - 1 );
		int aktualnyMesiac = datum.getMonthValue();
		
		while ( datum.getMonthValue() == aktualnyMesiac ) {
			// IF testuje, ci dany den nie je sobota a nie je nedela
			if ( datum.getDayOfWeek() != DayOfWeek.SUNDAY && datum.getDayOfWeek() != DayOfWeek.SATURDAY ) {
				System.out.println( datum );
			}
			// presuniem sa na dalsi den
			datum = datum.plusDays(1);
		}
	}
}

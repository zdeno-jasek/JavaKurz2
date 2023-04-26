package den01date;

import java.time.LocalDate;

// ÚLOHA
public class Priklad02LocalDateRiesenie {

	/*
	 * Zistite, na aký deň, mesiac a rok pripadol dátum
	 * 23. 3. 2002 plus 56 dní mínus 18 mesiacov plus 1 rok
	 * Aký to bol deň v týždni?
	 * 
	 * Pomôcka:
	 * 	datum.getDayOfWeek()
	 */
	public static void main(String[] args) {
		LocalDate datum = LocalDate.of(2002, 3, 23)
				.plusDays(56).minusMonths(18).plusYears(1);
		
		System.out.println(datum);
		System.out.println(datum.getDayOfWeek());
	}
}

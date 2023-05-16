package den04streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;

// ÚLOHA
public class Priklad09SpocitajRiesenie {

	/*
	 * Spočítaj absolútne hodnoty všetkých párnych čísel.
	 * VSTUP:  1, -20, 3, 4
	 * VYSTUP: 24
	 */
	public static void main(String[] args) {
		Collection<Integer> cisla = new ArrayList<>();
		cisla.add(1);
		cisla.add(101);
		cisla.add(2);
		cisla.add(200);
		cisla.add(-4);
		cisla.add(55);
		cisla.add(-8);
		cisla.add(9);
				
		System.out.println( "Pôvodný zoznam: " + cisla );
		
		Optional<Integer> vysledok = cisla.stream()
			.filter( x -> x % 2 == 0 )
			.map( Math::abs )
			.reduce( Integer::sum );
			
		System.out.println( "Súčet absolútnych hodnôt všetkých párnych čísel je " + vysledok.orElse( 0 ) );
	}
}

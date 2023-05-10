package den04streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

// ÚLOHA
public class Priklad06MapRiesenie {

	/*
	 * Zmeň všetky mená v zozname na čísla, ktoré označujú počet ich písmen
	 * Vstup: Jozef, Peter, Juraj, Gabriela, Ema, Natasa
	 * Výstup: 5,       5,     5,     8,      3,    6
	 */
	public static void main(String[] args) {
		Collection<String> mena = new ArrayList<>();
		mena.add( "Jozef" );		
		mena.add( "Peter");
		mena.add( "Pavol");
		mena.add( "Juraj" );
		mena.add( "Gabriela" );
		mena.add( "Ema" );
		mena.add( "Natasa" );
				
		System.out.println( "Pôvodný zoznam: " + mena );

		// TODO
		Optional<Integer> pocetPismen = mena.stream()
				.map( meno -> meno.length() )
				.reduce( (x,y) -> x + y );
		
		System.out.println( "Počet písmen v mene " + pocetPismen.get() );
		
	}
}

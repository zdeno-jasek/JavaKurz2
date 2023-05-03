package den02list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ÚLOHA
public class Priklad09DruheNajvacsieRiesenie {

	/*
	 * Vráti druhé meno podľa abecedy.
	 * Vstup: Jozef, Peter, Juraj, Gabriela, Ema, Natasa
	 * Výstup: Gabriela
	 */
	public static void main(String[] args) {
		List<String> mena = new ArrayList<>();
		mena.add( "Jozef" );		
		mena.add( "Peter");
		mena.add( "Juraj" );
		mena.add( "Gabriela" );
		mena.add( "Ema" );
		mena.add( "Natasa" );
				
		System.out.println( "Pôvodný zoznam: " + mena );

		if ( mena.size() < 2 ) {
			System.out.println( "Zly vstup");
		} else {
			Collections.sort( mena );
			System.out.println( "Druhé meno podľa abecedy je: " + mena.get(1) );
		}
	}
}

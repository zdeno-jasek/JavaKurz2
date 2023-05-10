package den04streams;

import java.util.ArrayList;
import java.util.Collection;

// ÚLOHA
public class Priklad02FilterRiesenie {

	/*
	 * Vyber mená, ktoré majú dĺžku presne 5 znakov
	 * Vstup: Jozef, Peter, Juraj, Gabriela, Ema, Natasa
	 * Výstup: Jozef, Peter, Juraj
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
		Collection<String> vybraneMena = mena.stream()
				.filter( meno -> meno.length() == 5 )
				.toList();

		// Alternativa pomocou FOR
		Collection<String> vysledok = new ArrayList<>();
		for (String meno : mena ) {
			if ( meno.length() == 5 ) {
				vysledok.add( meno );
			}
		}

		System.out.println( "Vybraný zoznam mien " + vybraneMena  );
	}
}

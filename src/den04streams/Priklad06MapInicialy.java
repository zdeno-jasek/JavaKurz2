package den04streams;

import java.util.ArrayList;
import java.util.Collection;

// ÚLOHA
public class Priklad06MapInicialy {

	/*
	 * Zmeň všetky mená v zozname na začiatočné písmená ich mien
	 * Vstup: Jozef, Peter, Juraj, Gabriela, Ema, Natasa
	 * Výstup: J,       P,     J,     G,      E,    N
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
		
		System.out.println( "Začiatočné písmená mien " + 0 );
		
	}
}

package den02list;

import java.util.ArrayList;
import java.util.List;

// ÚLOHA
public class Priklad02SwapRiesenie {
	
	/*
	 * Program vymení prvý a druhý prvok v poli.
	 * vstup: "B", "A", "C"
	 * výstup: "A", "B", "C"
	 */
	public static void main(String[] args) {
		List<String> mena = new ArrayList<>();
		mena.add( "Brano" );
		mena.add( "Adam" );
		mena.add( "Cyril" );
				
		System.out.println( "Zadanie:" + mena );
		
		mena.add(0, mena.get(1) );
		System.out.println( "Medzivysledok:" + mena );
		mena.remove(2);
		
		System.out.println( "Vysledok:" + mena );
	}

}

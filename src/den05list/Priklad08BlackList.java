package den05list;

import java.util.ArrayList;
import java.util.List;

// VYSVETLENIE
public class Priklad08BlackList {

	/*
	 * Program má zoznam mien a k nemu aj čiernu listinu.
	 * Zo zoznamu mien vyhodí tie, ktoré sú na čiernej listine.
	 */
	public static void main(String[] args) {
		List<String> mena = new ArrayList<>();
		mena.add( "Jozef" );
		mena.add("Peter");
		mena.add( "Juraj" );
		mena.add( "Gabriela" );
		mena.add( "Ema" );
		mena.add( "Natasa" );
		
		List<String> blackList = new ArrayList<>();
		blackList.add( "Jozef" );
		blackList.add("Peter");
		
		mena.removeAll(blackList);

		System.out.println( mena );
		
	}
}

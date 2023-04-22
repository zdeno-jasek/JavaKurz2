package den05list;

import java.util.ArrayList;
import java.util.List;

// ÚLOHA
public class Priklad03Rotacia {

	/*
	 * Program vymení hodnoty v poli tak, že prvú za druhú, 
	 * druhú za tretiu, tretiu za štvrtú atď.
	 * Vstup: 7, 5, 6, 1
	 * Výstup: 5, 6, 1, 7
	 */
	public static void main(String[] args) {
		List<Integer> pole = new ArrayList<>();
		
		pole.add(7);
		pole.add(5);
		pole.add(6);
		pole.add(1);
		
		System.out.println( "Pôvodné pole: " + pole );
		
		// TODO

		System.out.println( "Upravené pole: " + pole );
	}
}

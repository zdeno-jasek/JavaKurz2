package den02list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// ÚLOHA
public class PrikladDUScitanieDvochPoliRiesenie {

	/*
	 * Program sčíta hodnoty dvoch rovnako veľkých polí 
	 * a výsledok uloží do nového poľa
	 * 
	 */
	public static void main(String[] args) {
		Collection<Integer> scitanec1 = List.of( 1, 3,  4, 5 );
		Collection<Integer> scitanec2 = List.of( 2, 3, 11, 4 );
		// 				  vysledok         3  6  15  9
		
		Collection<Integer> vysledok = new ArrayList<>();
		
		Iterator<Integer> it1 = scitanec1.iterator();
		Iterator<Integer> it2 = scitanec2.iterator();
		while (it1.hasNext()) {
			int sucet = it1.next() + it2.next();
			vysledok.add(sucet);
		}
		
		System.out.println(vysledok);
	}
}

package den02list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// DOMÁCA ÚLOHA
public class PrikladDUMenaRiesenie {
	
	/*
	 * Program má zoznam mien a zoznam priezvisk. Jeho úlohou je vyrobiť plné pomenovanie (meno+priezvisko)
	 * pre nového človeka.
	 * Výstup: Peter Krátky
	 */
	public static void main(String[] args) {
		List<String> mena = new ArrayList<>();
		mena.addAll( List.of( "Jozef", "Juraj", "Peter", "Andrej" ) );
		
		List<String> priezviska = new ArrayList<>();
		priezviska.addAll( List.of( "Široký", "Dlhý", "Bystrozraký", "Krátky", "Úzky", "Ďalekozraký" ) );
		
		String nahodneMeno = mena.get( (int) (Math.random() * mena.size() ));		// TODO
		String nahodnePriezvisko = priezviska.get( (int) (Math.random() * priezviska.size() ));		// TODO

		System.out.println( String.format( "Vymyslel som meno %s %s. Pekné, že?", nahodneMeno, nahodnePriezvisko));
		
		// 5 az 100
		int dolnaHranica = 5;
		int velkostIntervalu = 100 - 5;
		
		for (int i = 0; i < 200; i++) {
			int nahodneCisloOd5do100 = (int) (Math.random() * velkostIntervalu + dolnaHranica);
			System.out.print( nahodneCisloOd5do100 + ", " );
		}
	}

}

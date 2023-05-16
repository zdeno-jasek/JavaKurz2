package den05class;

public class Osoba {
	private String meno;
	private String priezvisko;
	private String rodneCislo;
	
	/*
	 * Idem napísať konštruktor.
	 * Konštruktor je metóda, ktorej názov je rovnaký ako názov triedy.
	 * Konštruktor nikdy nemá návratovú hodnotu.
	 */
	public Osoba( String meno, String priezvisko, String rodneCislo ) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.rodneCislo = rodneCislo;
	}
	
	@Override
	public String toString() {
		return meno + " " + priezvisko + ": " + rodneCislo;
	}
}

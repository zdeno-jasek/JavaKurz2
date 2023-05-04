package den03boxing;

// ÚLOHA
public class Priklad02BoxingRiesenie {

	/*
	 * Ku každému primitívnemu typu v Jave existuje aj objektový typ, tzv. "Object Wrapper":
	 * int -> Integer
	 * long -> Long
	 * double -> Double
	 * float -> Float
	 * char -> Character
	 * 
	 * Ku každému primitívnemu typu vytvorte jeho objektový typ, priraďte do neho hodnotu
	 * primitívneho typu a vypíšte ho na obrazovku.
	 */
	public static void main(String[] args) {
		int cislo = 5;
		long dlheCislo = 12_000_001;
		double realneCislo = 5.4;
		float maleCislo = 2.3f;
		char pismeno = 'z';
		
		Integer cisloObject = cislo;
		System.out.println( "Hodnota cislo je " + cisloObject );

		Long dlheCisloObjekt = dlheCislo;
		System.out.println( "Hodnota dlheCislo je " + dlheCisloObjekt );
		
		Double realneCisloObjekt = realneCislo;
		System.out.println( "Hodnota realneCislo je " + realneCisloObjekt );
		
		Float maleCisloObjekt = maleCislo;
		System.out.println( "Hodnota maleCislo je " + maleCisloObjekt );
		
		Character pismenoObjekt = pismeno;
		System.out.println( "Hodnota pismeno je " + pismenoObjekt );
	}
}

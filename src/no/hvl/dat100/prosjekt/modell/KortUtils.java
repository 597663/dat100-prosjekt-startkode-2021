package no.hvl.dat100.prosjekt.modell;

import java.util.Random;
import java.util.Arrays;

import no.hvl.dat100.prosjekt.TODO;


public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {


		Kort[] bunke = samling.getAllekort();

		for (int i = 0; i < samling.getAntalKort(); i++){
			boolean likFarge = false;
			if (bunke[i].sammeFarge(bunke[i+1])){
				bunke[i].compareTo(bunke[samling.getAntalKort()]);


			}
		}
	}
		
//	 Arrays.sort(samling);
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}
	
}

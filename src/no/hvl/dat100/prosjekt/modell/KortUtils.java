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


		Kort[] bunke = samling.getAllekort(); // Henter inn kortene ;PT

		/*
		Først sorterer den samlingen utifra farge

		;PT
		 */

		for (int i = 0; i < samling.getAntalKort()-1; i++){
			if (!bunke[i].sammeFarge(bunke[i+1])){
				int antall = 0;

				for (int j = 0; j < samling.getAntalKort(); j++){
					if (bunke[i].sammeFarge(bunke[j]) && j != i){
						Kort temp = bunke[i+1];
						bunke[i+1] = bunke[j];
						bunke[j] = temp;
						antall++;
					}
				}
			}
		}


		/*
		Sorterer så ved å sammenligne det første kortet med verdien til det andre
		hvis det første kortets verdi er størst, så vil de bytte plass, dette gjøres bare hvis de er samme farge

		;PT
		 */
		for (int i = 0; i < samling.getAntalKort(); i++){
			boolean likFarge = false;
			if (bunke[i].sammeFarge(bunke[i+1])){
				Kort temp;
				if (bunke[i].compareTo(bunke[i+1]) > 0){
					temp = bunke[i+1];
					bunke[i+1] = bunke[i];
					bunke[i] = temp;
				}
			}
		}

		samling.fjernAlle();
		for (Kort kort : bunke)
			samling.leggTil(kort);
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

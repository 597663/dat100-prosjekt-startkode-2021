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
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {

	}

//	 Arrays.sort(samling);
	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {

		Random rand = new Random();

		for (int i = 0; i < samling.length; i++) {
			int randomIndexToSwap = rand.nextInt(samling.length);
			int temp = samling[randomIndexToSwap];
			samling[randomIndexToSwap] = samling[i];
			samling[i] = temp;
		}
		return samling;

		// TODO - END
	}

}

package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import java.util.Arrays;

public class KortUtils {

	public static void sorter(KortSamling samling) {

		Kort[] bunke = samling.getAllekort(); // Henter inn kortene ;PT

		Arrays.sort(bunke);

		samling.fjernAlle();

		for (int i = 0; i < bunke.length; i++) {
			samling.leggTil(bunke[i]);
		}
	}

	public static void stokk(KortSamling samling) {

		Random rand = new Random(System.currentTimeMillis());

		sorter(samling);
		Kort[] uStokket = samling.getSamling();
		Kort[] tmpSamling = new Kort[uStokket.length];
		int lengde = samling.getAntalKort();

		if (lengde == 0) {
			return;
		}

		int i = 0;
		do {
			int randomIndex = rand.nextInt(lengde);
			if (uStokket[randomIndex] != null) {
				tmpSamling[i] = uStokket[randomIndex];
				uStokket[randomIndex] = null;
				i++;
			}
		} while (i < lengde);

		samling.fjernAlle();

		for (int j = 0; j < lengde; j++) {
			samling.leggTil(tmpSamling[j]);
		}
	}
}

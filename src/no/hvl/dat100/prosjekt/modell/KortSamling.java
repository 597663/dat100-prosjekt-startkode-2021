package no.hvl.dat100.prosjekt.modell;

import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;
	
	private int antall;
	
	public KortSamling() {
		
		samling = new Kort[MAKS_KORT];
		
	}

	public Kort[] getSamling() {
		
		return samling;
	}
	
	public int getAntalKort() {
		
		return antall;
		
	}
	
	public boolean erTom() {
		
		return antall == 0;
	}

	public void leggTil(Kort kort) {
		
		if(kort == null) {
			return;
		}
		for(int i = 0; i < samling.length; i++)
			if(samling[i] == null) {
				samling[i] = kort;
				antall++;
				return;
		    }
	}
	
	public void leggTilAlle() {
	
		for (Kortfarge kortfarge : Kortfarge.values()) {
			for (int i = 1; i <= Regler.MAKS_KORT_FARGE ; i++) {
				leggTil(new Kort(kortfarge, i));
			}
		}
	}
	
	public void fjernAlle() {
		
		samling = new Kort[MAKS_KORT];
		antall = 0;
		
	
	}
	
	public Kort seSiste() {
		
		for(int i = samling.length-1; i >= 0 ; i--) {
			if(samling[i] != null) {
				return samling[i];
			}		
		}
		return null;
	}

	public Kort taSiste() {
		
		for(int i = samling.length-1; i >= 0 ; i--) {
			if(samling[i] != null){
				final Kort siste = samling[i];
				samling[i] = null;
				antall--;
				return siste;
			}		
		}
		return null;
	}
	
	public boolean har(Kort kort) {

		for (int i = 0; i<samling.length; i++) {
			if (samling[i] != null && samling[i].equals(kort)) {
				return true;
			}
		}
		return false;
		
	}
			 
	public boolean fjern(Kort kort) {
		
		if(kort == null) {
			return false;
		}
		for (int i = 0; i<samling.length; i++) {
			if (samling[i] == kort) {
				samling[i] = null;
				antall--;
				return true;
			}
		}
		return false;
	}

	public Kort[] getAllekort() {
				
		final Kort [] alleKort = new Kort[antall];
		
		int k = 0;
		for (int j = 0; j<samling.length; j++) {
			if(samling[j] != null) {
				alleKort[k] = samling[j];
				k++;
			}
		}
		return alleKort;
	}	
}
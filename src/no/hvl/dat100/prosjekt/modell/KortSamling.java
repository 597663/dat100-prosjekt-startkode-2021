package no.hvl.dat100.prosjekt.modell;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;


/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene. Når
 * programmet er ferdig settes denne til 13, men under utvikling / testing kan
 * det være praktisk å ha denne mindre.
 * 
 */
public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;

//	Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	
	public KortSamling() {
		
		samling = new Kort[MAKS_KORT];
		
	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke være
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan få
	 * tilgang til antallet ved å bruke metoden getAntallKort(). Metoden er
	 * først og fremst ment å brukes i testklasser. Om man trenger
	 * kortene utenfor, anbefales metoden getAlleKort().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {
		
		return samling;
		
	}
	
	public int getAntalKort() {
		
		return samling.length;
		
	}
	
	public boolean erTom() {
		
		for (int i = 0; i<samling.length; i++) {
			if (samling[i] != null) {
				return false;
			}
		}
		return true;
	}

	public void leggTil(Kort kort) {
		
		if(kort == null) {
			return;
		}
		for(int i = 0; i < samling.length; i++)
			if(samling[i] == null) {
				samling[i] = kort;
				return;
		    }
	
	}
	
	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil være sortert
	 * slik at de normalt må stokkes før bruk.
	 */
	public void leggTilAlle() {
	
		for(int i = 0 ; i < Regler.MAKS_KORT_FARGE; i++) {
			samling[i] = new Kort(Kortfarge.Klover, i+1);
			samling[i+Regler.MAKS_KORT_FARGE] = new Kort(Kortfarge.Hjerter, i+1);
			samling[i+2*Regler.MAKS_KORT_FARGE] = new Kort(Kortfarge.Ruter, i+1);
			samling[i+3*Regler.MAKS_KORT_FARGE] = new Kort(Kortfarge.Spar, i+1);
			}
		}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {
		
		samling = new Kort[MAKS_KORT];
		
	
	}
	
	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort seSiste() {
		
		for(int i = samling.length-1; i >= 0 ; i--) {
			if(samling[i] != null) {
				return samling[i];
			}		
		}
		return null;
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		
		for(int i = samling.length-1; i >= 0 ; i--) {
			if(samling[i] != null){
				final Kort siste = samling[i];
				samling[i] = null;
				return siste;
			}		
		}
		return null;
	}
	
	public boolean har(Kort kort) {
		
		if(kort == null) {
			return false;
		}
		for (int i = 0; i<samling.length; i++) {
			if (samling[i] == kort) {
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
				return true;
			}
		}
		return false;
	}

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {
		
		int lengde = 0;
		for (int i = 0; i<samling.length; i++) {
			if(samling[i] != null) {
				lengde++;
				}
		}
				
		final Kort [] alleKort = new Kort[lengde];
		
		int k = 0;
		for (int j = 0; j<samling.length; j++) {
			if(samling[j] != null)
				samling[j]=alleKort[k];
				k++;
		}
		return alleKort;
	}	
}



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
	private int antall;

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
		
		antall = samling.length;
		
		return antall;
		
	}
	
	public boolean erTom() {
		
		boolean tom = true;
		for (int i = 0; i<samling.length; i++) {
			if (samling[i] != null) {
				tom = false;
			}
		}
		return tom;
	}

	public void leggTil(Kort kort) {
		
		for(int i = 0; i < samling.length; i++)
		    if(samling[i] == null) {
		        samling[i] = kort;
		        break;
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
		
		for(int i = 0; i < samling.length; i++)
		    samling[i] = null;
	}
	
	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort seSiste() {
		
		
		
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
		
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
	}
	
	public boolean har(Kort kort) {
		
		boolean harKort = false;
		for (int i = 0; i<samling.length; i++) {
			if (samling[i] == kort) {
				harKort = true;
			}
		}
		return harKort;
		
	}
			 
	public boolean fjern(Kort kort) {
		
		boolean fjernet = false;
		for (int i = 0; i<samling.length; i++) {
			if (samling[i] == kort) {
				samling[i] = null;
				fjernet = true;
			}
		}
		return fjernet;
	}

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {
		
		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	
	}
	
}

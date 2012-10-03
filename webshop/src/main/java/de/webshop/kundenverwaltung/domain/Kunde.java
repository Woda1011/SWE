package de.webshop.kundenverwaltung.domain;

import java.io.Serializable;

public class Kunde implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5819309159091253609L;
	private String vorname;
	private String nachname;
	
	public Kunde(){
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
}

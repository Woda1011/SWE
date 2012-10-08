package de.webshop.kundenverwaltung.domain;

import static javax.persistence.EnumType.STRING;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "adresse")
public class Adresse implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8308237627091594771L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "strasse", length = 32, nullable = false)
	private String strasse;

	@Column(name = "hausnummer", length = 8, nullable = false)
	private String hausnummer;

	@Column(name = "ort", length = 32, nullable = false)
	private String ort;

	@Column(name = "plz", length = 5, nullable = false)
	private String plz;

	@Column(name = "adresstyp")
	@Enumerated(STRING)
	private Adresstyp adresstyp;

	public Adresse() {
	}

	/**
	 * @param strasse
	 * @param hausnummer
	 * @param ort
	 * @param plz
	 * @param adresstyp
	 */
	public Adresse(String strasse, String hausnummer, String ort, String plz,
			Adresstyp adresstyp) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.ort = ort;
		this.plz = plz;
		this.adresstyp = adresstyp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public Adresstyp getAdresstyp() {
		return adresstyp;
	}

	public void setAdresstyp(Adresstyp adresstyp) {
		this.adresstyp = adresstyp;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", strasse=" + strasse + ", ort=" + ort
				+ ", plz=" + plz + ", adresstyp=" + adresstyp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

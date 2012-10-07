package de.webshop.kundenverwaltung.domain;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

// TODO: Auto-generated Javadoc
/**
 * The Class Kunde.
 * 
 * @author Alexander Volz
 */

@Entity
@Table(name = "kunde")
public class Kunde implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5819309159091253609L;
	
	@Id
	@GeneratedValue
	@Column(name = "id", length = 32, nullable = false, updatable = false)
	private Long id;
	
	@Column(name = "vorname", length = 32, nullable = false)
	private String vorname;
	
	@Column(name = "nachname", length = 32, nullable = false)
	private String nachname;
	
	@Temporal(DATE)
	@Column(name = "anmeldungsdatum", nullable = false)
	private Date anmeldungsdatum;
	
	@Column(name = "email", length = 64, nullable = false, unique = true)
	private String email;
	
	@Transient
	@OneToMany(fetch = EAGER, cascade = PERSIST)
	@JoinColumn(name = "kunde_fk", nullable = false)
	private List<Adresse> adressen; 
	
	@Column(name = "passwort", length = 64, nullable = false, unique = true)
	private String passwort;
	
	
	/**
	 * Instantiates a new kunde.
	 */
	public Kunde(){
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getAnmeldungsdatum() {
		return anmeldungsdatum;
	}


	public void setAnmeldungsdatum(Date anmeldungsdatum) {
		this.anmeldungsdatum = anmeldungsdatum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Adresse> getAdressen() {
		return adressen;
	}

	public String getPasswort() {
		return passwort;
	}


	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}


	public void setAdressen(List<Adresse> adressen) {
		this.adressen = adressen;
	}

	@Override
	public String toString() {
		return "Kunde [id=" + id + ", vorname=" + vorname + ", nachname="
				+ nachname + ", email=" + email + "]";
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
		Kunde other = (Kunde) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}

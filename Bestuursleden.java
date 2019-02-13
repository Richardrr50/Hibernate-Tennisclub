package domain.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name= "Bestuursleden")
@Table(name="Bestuursleden")
public class Bestuursleden implements Serializable{

	@Id
	@Column(name="bestuurslid_nr")
	
	
	private int bestuurslidnr;
	
	
	private Calendar beginDatum;
	private Calendar eindDatum;
	private String functie;
	
	
	public int getBestuurslidnr() {
		return bestuurslidnr;
	}
	public void setBestuurslidnr(int bestuurslidnr) {
		this.bestuurslidnr = bestuurslidnr;
	}
	public Calendar getBeginDatum() {
		return beginDatum;
	}
	public void setBeginDatum(Calendar beginDatum) {
		this.beginDatum = beginDatum;
	}
	public Calendar getEindDatum() {
		return eindDatum;
	}
	public void setEindDatum(Calendar eindDatum) {
		this.eindDatum = eindDatum;
	}
	public String getFunctie() {
		return functie;
	}
	public void setFunctie(String functie) {
		this.functie = functie;
	}
	
	@Override
	public String toString() {
		return "Bestuursleden [bestuurslidnr=" + bestuurslidnr + ", beginDatum=" + beginDatum + ", eindDatum="
				+ eindDatum + ", functie=" + functie + "]";
	}
	public Bestuursleden(int bestuurslidnr, Calendar beginDatum, Calendar eindDatum, String functie) {
		super();
		this.bestuurslidnr = bestuurslidnr;
		this.beginDatum = beginDatum;
		this.eindDatum = eindDatum;
		this.functie = functie;
	}
	
	
	
	
}
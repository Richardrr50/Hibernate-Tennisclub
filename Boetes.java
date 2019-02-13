package domain.model;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity(name = "Boetes")
@Table(name = "Boetes")

public class Boetes {
	
	
	@Id
	@Column (name = "betalingsnr")
	private int betalingsnr;
	
	
	@OneToMany (mappedBy = "spelersnr")
	private Set <Spelers>spelersnr = new HashSet<>();
	
	private Calendar datum;
	private double bedrag;
	
	
	@Override
	public String toString() {
		return "Boetes [betalingsnr=" + betalingsnr + ", spelersnr=" + spelersnr + ", datum=" + datum + ", bedrag="
				+ bedrag + "]";
		
		
	}
	public int getBetalingsnr() {
		return betalingsnr;
	}
	public void setBetalingsnr(int betalingsnr) {
		this.betalingsnr = betalingsnr;
	}
	public Set<Spelers> getSpelersnr() {
		return spelersnr;
	}
	public void setSpelersnr(Set<Spelers> spelersnr) {
		this.spelersnr = spelersnr;
	}
	public Calendar getDatum() {
		return datum;
	}
	public void setDatum(Calendar datum) {
		this.datum = datum;
	}
	public double getBedrag() {
		return bedrag;
	}
	public void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}
	
	public Boetes(int betalingsnr, Set<Spelers> spelersnr, Calendar datum, double bedrag) {
		super();
		this.betalingsnr = betalingsnr;
		this.spelersnr = spelersnr;
		this.datum = datum;
		this.bedrag = bedrag;
	}
	
	
}

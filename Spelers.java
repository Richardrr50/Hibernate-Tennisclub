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


@Entity(name= "Spelers")
@Table(name="Spelers")
public class Spelers {
	
	
	@Id
	@Column (name = "spelers_nr")
	private int spelersnr;
	
	@OneToMany (mappedBy="bestuurslidnr")
	private Set<Bestuursleden>bestuurslidnr = new HashSet<>();

	
	private String naam;
	private String voorletters;
	private String voorvoegsel;
	private Calendar gebDatum;
	private String geslacht;
	private Calendar jaartoe;
	private String straat;
	private String huisnr;
	private String postcode;
	private String plaats;
	private int telefoon;
	private int bondsnr;
	
	
	
	public int getSpelersnr() {
		return spelersnr;
	}
	public void setSpelersnr(int spelersnr) {
		this.spelersnr = spelersnr;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getVoorletters() {
		return voorletters;
	}
	public void setVoorletters(String voorletters) {
		this.voorletters = voorletters;
	}
	public String getVoorvoegsel() {
		return voorvoegsel;
	}
	public void setVoorvoegsel(String voorvoegsel) {
		this.voorvoegsel = voorvoegsel;
	}
	public Calendar getGebDatum() {
		return gebDatum;
	}
	public void setGebDatum(Calendar gebDatum) {
		this.gebDatum = gebDatum;
	}
	public String getGeslacht() {
		return geslacht;
	}
	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}
	public Calendar getJaartoe() {
		return jaartoe;
	}
	public void setJaartoe(Calendar jaartoe) {
		this.jaartoe = jaartoe;
	}
	public String getStraat() {
		return straat;
	}
	public void setStraat(String straat) {
		this.straat = straat;
	}
	public String getHuisnr() {
		return huisnr;
	}
	public void setHuisnr(String huisnr) {
		this.huisnr = huisnr;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPlaats() {
		return plaats;
	}
	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}
	public int getTelefoon() {
		return telefoon;
	}
	public void setTelefoon(int telefoon) {
		this.telefoon = telefoon;
	}
	public int getBondsnr() {
		return bondsnr;
	}
	public void setBondsnr(int bondsnr) {
		this.bondsnr = bondsnr;
	}
	
	@Override
	public String toString() {
		return "Spelers [spelersnr=" + spelersnr + ", naam=" + naam + ", voorletters=" + voorletters + ", voorvoegsel="
				+ voorvoegsel + ", gebDatum=" + gebDatum + ", geslacht=" + geslacht + ", jaartoe=" + jaartoe
				+ ", straat=" + straat + ", huisnr=" + huisnr + ", postcode=" + postcode + ", plaats=" + plaats
				+ ", telefoon=" + telefoon + ", bondsnr=" + bondsnr + "]";
	}
	
	public Spelers(int spelersnr, String naam, String voorletters, String voorvoegsel, Calendar gebDatum,
			String geslacht, Calendar jaartoe, String straat, String huisnr, String postcode, String plaats,
			int telefoon, int bondsnr) {
		super();
		this.spelersnr = spelersnr;
		this.naam = naam;
		this.voorletters = voorletters;
		this.voorvoegsel = voorvoegsel;
		this.gebDatum = gebDatum;
		this.geslacht = geslacht;
		this.jaartoe = jaartoe;
		this.straat = straat;
		this.huisnr = huisnr;
		this.postcode = postcode;
		this.plaats = plaats;
		this.telefoon = telefoon;
		this.bondsnr = bondsnr;
	}
	public Spelers() {

	}
	
	
}

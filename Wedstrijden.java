package domain.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Wedstrijden")
@Table(name = "Wedstrijden")

public class Wedstrijden {
	
	@Id
	@Column (name = "wedstrijdnr")
	private int wedstrijdnr;
	
	
	@OneToMany
	@JoinColumn (name="teamnr", foreignKey = @ForeignKey(name = "team_FK"))
	private Set <Teams>teams = new HashSet<>();
	
	
	private int teamnr;
	
	
	private int spelersnr;
	private int gewonnen;
	private int verloren;
	
	
	public int getWedstrijdnr() {
		return wedstrijdnr;
	}
	public void setWedstrijdnr(int wedstrijdnr) {
		this.wedstrijdnr = wedstrijdnr;
	}
	public int getTeamnr() {
		return teamnr;
	}
	public void setTeamnr(int teamnr) {
		this.teamnr = teamnr;
	}
	public int getSpelersnr() {
		return spelersnr;
	}
	public void setSpelersnr(int spelersnr) {
		this.spelersnr = spelersnr;
	}
	public int getGewonnen() {
		return gewonnen;
	}
	public void setGewonnen(int gewonnen) {
		this.gewonnen = gewonnen;
	}
	public int getVerloren() {
		return verloren;
	}
	public void setVerloren(int verloren) {
		this.verloren = verloren;
	}
	
	
	@Override
	public String toString() {
		return "Wedstrijden [wedstrijdnr=" + wedstrijdnr + ", teamnr=" + teamnr + ", spelersnr=" + spelersnr
				+ ", gewonnen=" + gewonnen + ", verloren=" + verloren + "]";
	}
	public Wedstrijden(int wedstrijdnr, int teamnr, int spelersnr, int gewonnen, int verloren) {
		super();
		this.wedstrijdnr = wedstrijdnr;
		this.teamnr = teamnr;
		this.spelersnr = spelersnr;
		this.gewonnen = gewonnen;
		this.verloren = verloren;
	}
	
	
}
	
	

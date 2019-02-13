package domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Teams")
@Table(name = "Teams")

public class Teams {
	
	@Id
	@Column (name = "teamnr")
	private int teamnr;
	
	
	@ManyToOne
	@JoinColumn (name = "spelersnr", foreignKey = @ForeignKey(name = "aanvoerdernr_FK"))
	private Spelers aanvoerdernr;
	
	
	private String divisie;
	
	
	public int getTeamnr() {
		return teamnr;
	}
	public void setTeamnr(int teamnr) {
		this.teamnr = teamnr;
	}
	public Spelers getAanvoerdernr() {
		return aanvoerdernr;
	}
	public void setAanvoerdernr(Spelers aanvoerdernr) {
		this.aanvoerdernr = aanvoerdernr;
	}
	public String getDivisie() {
		return divisie;
	}
	public void setDivisie(String divisie) {
		this.divisie = divisie;
	}
	
	@Override
	public String toString() {
		return "Teams [teamnr=" + teamnr + ", aanvoerdernr=" + aanvoerdernr + ", divisie=" + divisie + "]";
	}
	public Teams(int teamnr, Spelers aanvoerdernr, String divisie) {
		super();
		this.teamnr = teamnr;
		this.aanvoerdernr = aanvoerdernr;
		this.divisie = divisie;
	}
	
	
}

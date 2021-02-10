package domaci_12_januar;

public class Vozac extends Covek {
	
	private String zanimanje = "Sofer";

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}

	public Vozac(String ime, String prezime, String zanimanje) {
		super(ime, prezime);
		this.zanimanje = zanimanje;
	}
	
	
}
//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
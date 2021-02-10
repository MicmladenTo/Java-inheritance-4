package domaci_12_januar;

public class Putnik extends Covek {
	
	private double novac = 1000;
	private double transakcija;

	public double getNovac() {
		return novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}
	
	public double dodajNovac() {
		return novac = novac + transakcija;
	}
	
	public double oduzmiNovac() {
		return novac = novac - transakcija;
	}

	public double platiKartu(double cenaKarte) {
		return novac = novac - cenaKarte;
	}

	public Putnik(String ime, String prezime, double novac, double transakcija) {
		super(ime, prezime);
		this.novac = novac;
		this.transakcija = transakcija;
	}

//	Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje 
//	prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme.

	
}
//Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja.
//Odredjena svota novca moze da mu se doda i/ili oduzme.
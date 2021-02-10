package domaci_12_januar;

public class Autobus {
	
	private String naziv = "Lasta";
	private Vozac vozac;
	protected double cenaKarte = 400;
	private Putnik putnik;
	
	// Setteri i getteri
	
	public String getNaziv() {
		return naziv;
	}

	public Vozac getVozac() {
		return vozac;
	}
	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}
	public double getCenaKarte() {
		return cenaKarte;
	}

	public Putnik getPutnik() {
		return putnik;
	}

	public void setPutnik(Putnik putnik) {
		this.putnik = putnik;
	}

	// Konstruktori
	
	public Autobus(String naziv, Vozac vozac, double cenaKarte, Putnik putnik) {
		super();
		this.naziv = naziv;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
		this.putnik = putnik;
	}
	
	public Autobus(String naziv, double cenaKarte, Putnik putnik) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.putnik = putnik;
	}
	
	public Autobus(String naziv, Vozac vozac, double cenaKarte) {
		super();
		this.naziv = naziv;
		this.vozac = vozac;
		this.cenaKarte = cenaKarte;
	}


 public void ispisOAutobusu() {
	 System.out.println("Ovo je autobus firme " + this.getNaziv() + ", a cena karte je " + this.cenaKarte);
	 System.out.println("Njime upravlja " + vozac.getIme() + " " + vozac.getPrezime() + ", " + vozac.getZanimanje());
	 System.out.println("Putnik je: " + putnik.getIme() + " " + putnik.getPrezime() + ", sa budžetom od " + putnik.getNovac());
	 System.out.println("Nakon plaæanja karte, putnik ima " + putnik.platiKartu(cenaKarte) + ", a nakon dažbina " + putnik.oduzmiNovac());
 }
}
//Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. 
//Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.
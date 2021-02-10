package domaci_12_januar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vozac sofer = new Vozac("Petar", "Petrovic", "Sofer");
		Putnik tnikpu = new Putnik("Djordje", "Petrovic", 1000, 10);
		
		Autobus busic = new Autobus("Lasta", sofer, 400, tnikpu);
		busic.ispisOAutobusu();
		
	}

}

package personnages;

public class Ronin extends Humain {
	int honneur=1;
	
	public Ronin(String nom, String boissonPref,int argent) {
		super(nom,boissonPref,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int dons;
		dons=argent/10;
		parler("Prends ces " + dons + " sous.");
		beneficiaire.recevoir(dons);
		
	}
}

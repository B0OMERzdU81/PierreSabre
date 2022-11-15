package personnages;

public class Samourai extends Humain {
	private String seigneur;

	public Samourai(String seigneur,String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
		this.seigneur=seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je sers le seigneur "+seigneur);
		
		
		
	}
	
	

}

package personnages;

public class Commercant extends Humain {
	
	
	public Commercant(String nom, int argent) {
		super(nom,"thé",argent);
	}
	
	public int seFaireExtorquer() {
		int argentbis=getArgent();
		parler("J'ai tout perdu ! Le monde est trop injuste");
		argent-=argentbis;
		return argentbis;
		
	}
	public String prendreParole() {
		return("Le commercant " + nom + " : " );
	}
	
	
	public void recevoir(int dons) {
		argent+=dons;
		parler(dons +" sous! Je te remercie généreux donateur!");
		
	}
	
	
	
	
	
	
	
	
	
	
}

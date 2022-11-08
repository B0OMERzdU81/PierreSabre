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
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	
	public void recevoir(int argent2) {
		argent+=argent2;
		parler(argent2 +" sous! Je te remercie généreux donateur!");
		
	}
	
	
	
	
	
	
	
	
	
	
}

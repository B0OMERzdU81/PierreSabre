package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	
	public Humain(String nom, String boissonPref, int argent) {
		this.nom=nom;
		this.boissonPref=boissonPref;
		this.argent=argent;
		  }
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	
	private String prendreParole() {
		return "L'humain " + nom + " : ";
		}
	
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boissonPref);
		
	}
	
	public void boire() {
		parler("Mmmmm, un bon verre de " + boissonPref + " ! GLOUPS!");
		
	}
	
	public void acheter(String bien, int prix) {
		if(argent >=prix) {
			parler("J'ai actuellement " + argent + " sous, je peux donc me permettre d'acheter " + bien + " à " + prix +" sous.");
			argent=argent-prix;
		}
		else {
			parler("Je n'ai que " + argent + " , je ne peux pas me permettre d'acheter " + bien + " à " + prix + " sous.");
		}
	}
	
	public void gagnerargent(int gain) {
		argent+=gain;
	}
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

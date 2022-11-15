package personnages;

public class Humain {
	protected String nom;
	private String boissonPref;
	protected int argent;
	private int nbConnaissance =3;
	protected String [] memoire= new String[nbConnaissance];
	
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
	
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void memoriser(Humain humain) {
		int i=memoire.length -2;
		while(i!=-1) {
			memoire[i+1]=memoire[i];
			i--;
		}
		memoire[0]=humain.nom;
	}
	
	
	
	public void listerConnaissance() {
		String texte = "";
		if (memoire[0]!=null){
			int i=0;
			while(i!=nbConnaissance && memoire[i]!=null )
			{
				texte+=memoire[i] + " ";
				i+=1;			
			}
			parler("Je connais beaucoup de monde dont : " + texte );
			
		}
		else {
			parler("Je ne connais pas grand monde dans le coin");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package personnages;

public class Yakuza extends Humain {
	private String clan;
	protected int honneur=0;
	
	public Yakuza(String nom,String boissonPref, int argent,String clan) {
		super(nom,boissonPref,argent);
		this.clan=clan;
	}
	
	public String prendreParole() {
		return("Le yakuza " + nom + " : " );
	}
	public int getHonneur() {
		return honneur;
		
	}
	
	public void extorquer(Commercant victime) {
		int argentbis=0;
		String nom = victime.nom;
		parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(nom + " , si tu tiens à la vie donne moi ta bourse");
		argentbis=victime.seFaireExtorquer();
		argent+=argentbis;
		parler("J'ai piqué "+ argentbis + " sous de " +nom+ " ce qui me fait " + argent + " sous dans ma poche. He! he!" );
		honneur+=1;
	}
	public int perdre() {
		int argentperdu=argent;
		argent=0;
		honneur-=1;
		parler("J'ai perdu mon duel et mes " + argentperdu + " sous, snif ... J'ai déshonoré le clan de " +clan);
		return argentperdu;
		
	}
	
	public void gagner(int gain) {
		argent+=gain;
		honneur+=1;
		parler("Ce ronin pensait vraiment pouvoir battre " + nom +" du clan "+clan+ " ? Je l'ai dépouiller de ses "+gain+" sous.");
	}
	
	
	
	
	
	
}

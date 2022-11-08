package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int honneur=0;
	
	public Yakuza(String nom,String boissonPref, int argent,String clan) {
		super(nom,boissonPref,argent);
		this.clan=clan;
	}
	
	public String prendreParole() {
		return("Le yakuza " + nom + " : " );
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
}

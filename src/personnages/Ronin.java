package personnages;

public class Ronin extends Humain {
	int honneur = 1;

	public Ronin(String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
	}

	public void donner(Commercant beneficiaire) {
		int dons = argent / 10;
		parler("Prends ces " + dons + " sous.");
		beneficiaire.recevoir(dons);

	}

	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		if (force >= adversaire.getHonneur()) {
			parler("Je t'ai eu petit yakuza!");
			argent += adversaire.perdre();
			honneur++;
		}

		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			honneur--;
			int perte = argent;
			argent = 0;
			adversaire.gagner(perte);

		}

	}
}

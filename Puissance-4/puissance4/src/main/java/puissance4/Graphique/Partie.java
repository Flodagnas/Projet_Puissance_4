
public class Partie {
	private Joueur[] joueurs = new Joueur[2];
	private Jeu jeu;

	public Partie(Joueur joueur1, Joueur joueur2) {
		joueurs[0] = joueur1;
		joueurs[1] = joueur2;
		jeu = new Jeu();
	}

	public void joue() {
		int vainqueur = -1;
	    int cJoueur = 0;

	    while (vainqueur==-1 && !jeu.estPlein()) {
	      joueurs[cJoueur].joue(jeu);
	      if (jeu.estPlein()) {
	        vainqueur = -1;
	      }

	      if (jeu.cherche4()) {
	    	  vainqueur = cJoueur;
	      }

	      cJoueur++;
	      cJoueur %= 2;
	    }
	    
	    if (vainqueur == -1) {
	      this.jeu.finDuJeu("Match nul");
	    } else {
	      this.jeu.finDuJeu("Le vainqueur est " + joueurs[vainqueur].getNom());
	    }
	}
}

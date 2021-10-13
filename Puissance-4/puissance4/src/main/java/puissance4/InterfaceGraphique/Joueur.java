public class Joueur {
	private String nom;
	private int couleur;

	public Joueur(String nom, int couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}

	public String getNom() {
		return nom;
	}

	public int getCouleur() {
		return couleur;
	}
	public void joue(Jeu jeu) {}

	
}


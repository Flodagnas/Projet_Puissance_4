public class Bot extends Joueur {
	 public Bot(int couleur) {
	    super("l'ordinateur", couleur);
	  }

	  public void joue(Jeu jeu) {
		  if(jeu.iaPlay(this.getCouleur())){
			  return;
		  }
	  }
}

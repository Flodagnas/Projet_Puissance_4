import java.util.Random;

public class Jeu {
	public final static int VIDE = 0;
	public final static int BLEU = 1;
	public final static int ROUGE = 2;

	private int taille;
	private int[][] grille;
	private Vue vue;
	private boolean debut = true;

	public Jeu(int taille) {
		initJeu(taille);
		vue = new Vue(taille);
	}

	public Jeu() {
		initJeu(8);
		vue = new Vue(8);
	}
	
	public void finDuJeu(String message){
		this.vue.finDePartie(message);
	}

	private void initJeu(int taille) {
	    this.taille = taille;
	    grille = new int[taille][taille];
	    for (int col = 0; col < taille ; col++) {
	    	for (int row = 0; row < taille; row++) {
	    		grille[col][row] = VIDE;
	    	}
	    }
	}

	public boolean tour(int col, int joueur) {
	    if ((col < 0) || (col >= taille)) {
	    	return false;
	    }

	    for (int ligne = 0; ligne < taille; ligne++) {
	    	if (grille[col][ligne] == VIDE) {
		        grille[col][ligne] = joueur;
		        this.vue.changeGrilleColor(col, ligne, joueur);
		        return true;
	    	}
	    }

	    return false;
	}


	public boolean cherche4() {

	    for (int col = 0; col < taille; col++) {
	    	if (cherche4alignes(0, col, 1, 0)) {
	    		return true;
	    	}
	    }


    for (int ligne = 0; ligne < taille; ligne++) {
    	if (cherche4alignes(ligne, 0, 0, 1)) {
    		return true;
    	}
    }


    for (int ligne = 0; ligne < taille; ligne++) {
		  if (cherche4alignes(ligne, 0, 1, 1)) {
			  return true;
		  }
		  if (cherche4alignes(ligne, 0, -1, 1)) {
			  return true;
		  }
    }

    for (int col = 0; col < taille; col++) {
    	if (cherche4alignes(0, col, 1, 1)) {
    		return true;
	    }
	    if (cherche4alignes(taille - 1, col, -1, 1)) {
	    	return true;
	    }
    }
    return false;
  }
	private boolean cherche4alignes(int oCol, int oLigne, int dCol, int dLigne) {
		int couleur = VIDE;
	    int compteur = 0;
	
	    int curCol = oCol;
	    int curRow = oLigne;

	    while ((curCol >= 0) && (curCol < taille) && (curRow >= 0) && (curRow < taille)) {
	      if (grille[curRow][curCol] != couleur) {
		        couleur = grille[curRow][curCol];
		        compteur = 1;
	      } else {
		        compteur++;
	      }
	      if ((couleur != VIDE) && (compteur == 4)) {
	    	  return true;
	      }
	      curCol += dCol;
	      curRow += dLigne;
	    }
	    return false;
	}
	
	public boolean iaPlay(int joueur){
		if(this.debut){
			this.debut = false;
			Random rand = new Random();
			int nombreAleatoire = rand.nextInt(taille);
			if(this.tour(nombreAleatoire, joueur)){
				return true;
			}
		}

	    for (int col = 0; col < taille ; col++) {
	    	for (int row = 0; row < taille; row++) {
	    		if(grille[col][row] == BLEU){
	    			int nextCol = getNearCase(col, row);
	    			if(nextCol != -1 && this.tour(nextCol, joueur)){
	    				return true;
	    			}
	    		}
	    	}
	    }
		for (int col = 0; col < taille; col++) {
		  if (this.tour(col, joueur)) {
		    return true;
		  }
		}
		return false;
	}
	
	public int getNearCase(int colTraget, int rowTarget){
		int[] elements = {0, -1, 1};  
		for(int col : elements){
			for (int row : elements) {
				if(colTraget + col >= 0 && colTraget + col < taille && rowTarget + row >= 0 && rowTarget + row < taille){
		    		if(grille[colTraget + col][rowTarget + row] == VIDE){
		    			return colTraget + col;
		    		}
				}
	    	}
		}
		return -1;
	}

  public boolean rempli() {
 
    for (int col = 0; col < taille; col++) {
	      for (int ligne = 0; ligne < taille; ligne++) {
		        if (grille[col][ligne] == VIDE) {
		        	return false;
		        }
	      }
    }

    return true;
  }

  public int getTaille() {
	  return taille;
  }
}

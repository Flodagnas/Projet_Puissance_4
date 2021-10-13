import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Puissance4 {
	protected static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object[] options = {"Mode contre l'ordinateur", "Mode joueur contre joueur"};
		int n = JOptionPane.showOptionDialog(new JFrame(), "Selection du mode:", "Puissance 4", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		Partie p = null;
		int random = (int)(Math.random() * 2);
	if(random==0){
		if(n==0){
			String pseudo = (String)JOptionPane.showInputDialog(new JFrame(),"Votre nom de joueur.", "Inscription", JOptionPane.PLAIN_MESSAGE);
			if(pseudo != null){
				p = new Partie(new Bot(Jeu.BLEU), new Humain(pseudo, Jeu.ROUGE));
							  }					
				}
		else if(n==1){
			String j1 =  (String)JOptionPane.showInputDialog(new JFrame(),"Nom du premier joueur (bleu):", "1er joueur:", JOptionPane.PLAIN_MESSAGE);
			if(j1 != null){
				String j2 =  (String)JOptionPane.showInputDialog(new JFrame(),"Nom du second joueur (rouge):", "2nd joueur:", JOptionPane.PLAIN_MESSAGE);
				if(j2 != null){
					p = new Partie(new Humain(j1, Jeu.BLEU), new Humain(j2, Jeu.ROUGE));
				}
			}
		}
	}
	else {
	if(n==0){
		String pseudo = (String)JOptionPane.showInputDialog(new JFrame(),"Votre nom de joueur.", "Inscription", JOptionPane.PLAIN_MESSAGE);
		if(pseudo != null){
			p = new Partie(new Humain(pseudo, Jeu.ROUGE), new Bot(Jeu.BLEU));
						  }					
			}
	else if(n==1){
		String j1 =  (String)JOptionPane.showInputDialog(new JFrame(),"Nom du premier joueur (bleu):", "1er joueur:", JOptionPane.PLAIN_MESSAGE);
		if(j1 != null){
			String j2 =  (String)JOptionPane.showInputDialog(new JFrame(),"Nom du second joueur (rouge):", "2nd joueur:", JOptionPane.PLAIN_MESSAGE);
			if(j2 != null){
				p = new Partie(new Humain(j2, Jeu.ROUGE), new Humain(j1, Jeu.BLEU));
			}
		}
	}
}

		if(p != null){
			p.joue();
		}
	}

}

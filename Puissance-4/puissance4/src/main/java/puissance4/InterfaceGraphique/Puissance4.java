import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.JOptionPane;


public class Puissance4 {
	protected static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Object[] options = {"Mode contre l'ordinateur", "Mode joueur contre joueur"};
		int c = JOptionPane.showOptionDialog(new JFrame(), "Selection du mode:", "Puissance 4", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		Partie p = null;
		int random = (int)(Math.random() * 2);
	if(random==0){
		if(c==0){
			String pseudo = (String)JOptionPane.showInputDialog(new JFrame(),"Votre nom de joueur.", "Inscription", JOptionPane.PLAIN_MESSAGE);
			if(pseudo != null){
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame,"L'ordinateur commence");
				p = new Partie(new Bot(Jeu.BLEU), new Humain(pseudo, Jeu.ROUGE));
							  }					
				}
		else if(c==1){
			String j1 =  (String)JOptionPane.showInputDialog(new JFrame(),"Nom du premier joueur (bleu):", "1er joueur:", JOptionPane.PLAIN_MESSAGE);
			if(j1 != null){
				String j2 =  (String)JOptionPane.showInputDialog(new JFrame(),"Nom du second joueur (rouge):", "2nd joueur:", JOptionPane.PLAIN_MESSAGE);
				if(j2 != null){
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,"Le joueur 1 commence");
					p = new Partie(new Humain(j1, Jeu.BLEU), new Humain(j2, Jeu.ROUGE));
				}
			}
		}
	}
	else {
	if(c==0){
		String pseudo = (String)JOptionPane.showInputDialog(new JFrame(),"Votre nom de joueur.", "Inscription", JOptionPane.PLAIN_MESSAGE);
		if(pseudo != null){
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame,"Le joueur commence");
			p = new Partie(new Humain(pseudo, Jeu.ROUGE), new Bot(Jeu.BLEU));
						  }					
			}
	else if(c==1){
		String j1 =  (String)JOptionPane.showInputDialog(new JFrame(),"Nom du premier joueur (bleu):", "1er joueur:", JOptionPane.PLAIN_MESSAGE);
		if(j1 != null){
			String j2 =  (String)JOptionPane.showInputDialog(new JFrame(),"Nom du second joueur (rouge):", "2nd joueur:", JOptionPane.PLAIN_MESSAGE);
			if(j2 != null){
				JFrame frame = new JFrame();
    JOptionPane.showMessageDialog(frame,"Le joueur 2 commence");
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

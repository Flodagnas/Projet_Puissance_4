package puissance4.Console;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		/*System.out.println("Jeu en local \nJeu en reseau \nOptions \nQuitter \n ");
        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);
        try {
        String firstNumber = br.readLine();
        int a = Integer.parseInt(firstNumber);
		        catch(java.io.IOException e) {
            System.err.println("Something went HORRIBLY wrong: Bidoof " + e.getMessage());
        }   

		}*/


		int N = 4;
		int C = 8;
		int L = 6;
		char[][] plateau = new char[C][L];
		for(int x = 0 ; x < C ; x++){
            for(int y = 0 ; y < L ; y++){
                plateau[x][y] = ' ';
            }
        }

		int gagnant = 0;
		for(int i = 1 ; i <= C*L ; i++){
			System.out.println("Tour " + i + ", Etat du plateau :");
			
			for(int y = 0 ; y < L ; y++){
				System.out.print(" #");
				for(int x = 0 ; x < C ; x++){
					System.out.print(" " + plateau[x][y] + " ");
				}
				
				System.out.print('#');
				System.out.println();
			}
			System.out.print(" ");
			for(int loop = 0 ; loop < 3*C+2 ; loop++)System.out.print('#');
			System.out.print('\n');
			for(int loop2 = 0 ; loop2 < C+2 ; loop2++)System.out.print(loop2 + "  " );
			System.out.print('\n');
            System.out.println();
			
			System.out.println("Tour du joueur " + (i%2==1 ? 'X' : 'O') );
			System.out.println("Entrez le chiffre de la colonne entre 1 et " + C + " ...");
			boolean placement = false;
			int colonne = -1;
			while(!placement){
				colonne = -1;
				String ligne = scanner.nextLine();
				String ligne_test = message.read()
				try{
					colonne = Integer.valueOf(ligne);
					
					if(colonne >= 1 && colonne <= C){
						if(plateau[colonne - 1][0] != ' '){
							System.out.println("Colonne pleine, réitérez");
						} else {
							placement = true;
						}
					} else {
						System.out.println("Nombre incorrect, réitérez");
					}
					
				}catch(Exception e){System.out.println("Nombre incorrect, réitérez");}
				
			}
			int rang = L-1;
			while(plateau[colonne - 1][rang] != ' '){
				rang--;
			}
			plateau[colonne - 1][rang] = (i%2==1 ? 'X' : 'O');
			
			
			
			char symbole = (i%2==1 ? 'X' : 'O');
			int max = 0;
			int x; int y;
			int somme;
			
			//-->  diagonale HG-BD
			x = colonne-1; y = rang; somme=-1;
			while(y >= 0 && x >= 0 && plateau[x][y] == symbole){ y--; x--; somme++;}
			x = colonne-1; y = rang;
			while(y < L && x < C && plateau[x][y] == symbole){ y++; x++; somme++;}
			if(somme > max) max= somme;
			
			//-->  diagonale HD-BG
			x = colonne-1; y = rang; somme=-1;
			while(y >= 0 && x < C && plateau[x][y] == symbole){ y--; x++; somme++;}
			x = colonne-1; y = rang;
			while(y < L && x >= 0 && plateau[x][y] == symbole){ y++; x--; somme++;}
			if(somme > max) max= somme;
			
			//-->  verticale:
			x = colonne-1; y = rang; somme=-1;
			while(y >= 0 && plateau[x][y] == symbole){ y--; somme++;}
			y = rang;
			while(y < L && plateau[x][y] == symbole){ y++; somme++;}
			if(somme > max) max= somme;
			
			//-->  horizontale:
			x = colonne-1; y = rang; somme=-1;
			while(x >= 0 && plateau[x][y] == symbole){ x--; somme++;}
			x = colonne-1;
			while(x < C && plateau[x][y] == symbole){ x++; somme++;}
			if(somme > max) max= somme;
			
			
			if(max >= N){
				gagnant = (i%2==1 ? 1 : 2);
				i = C*L+1;
			}
			
			
			
			
			System.out.println("-------------------------------------------------");
		}
		
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println("----FIN DE PARTIE----");
		System.out.println("---------------------");
		if(gagnant == 0)
			System.out.println("-------EGALITE-------");
		if(gagnant == 1)
			System.out.println("----VICTOIRE DE X----");
		if(gagnant == 2)
			System.out.println("----VICTOIRE DE O----");
		System.out.println("---------------------");
		
		
		for(int loop = 0 ; loop < C+2+2*C ; loop++)System.out.print(' ');
		System.out.println();
		
		for(int y = 0 ; y < L ; y++){
			System.out.print('#');
			for(int x = 0 ; x < C ; x++){
				System.out.print(" " + plateau[x][y] + " ");
			}
			System.out.print('#');
			System.out.println();
		}
		
		for(int loop = 0 ; loop < C+2+2*C ; loop++)System.out.print('#');
		System.out.println();	
	}
}

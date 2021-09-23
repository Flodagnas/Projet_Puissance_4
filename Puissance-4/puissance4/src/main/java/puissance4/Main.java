package puissance4;

class Puissance4{

    // Initialisation de la matrice de donnees
    public static void initPlateau ( int [][] matrice ){
        for ( int col = 0 ; col < matrice.length ; col ++){
            for ( int lig = 0 ; lig < matrice[0].length ; lig ++){
                matrice [ col ] [ lig ] = 0;
            }
        }
    }


    // fonction qui reconnait 4 cases verticales
    //joueur 1
    public static boolean verticalJ1(int [][] plateau){
        boolean alignement = false;
        for (int i = 0; i<7 ; i=i+1){
            for (int j = 0; j<3;j=j+1){
                if (plateau [j][i] == plateau [j+1][i] && plateau [j][i] == plateau [j+2][i] && plateau [j][i] == plateau [j+3][i] && plateau [j][i] == 1){
                    alignement=true;
                }
            }
        }
        return alignement;
    }

    // joueur 2
    public static boolean verticalJ2(int [][] plateau){
        boolean alignement = false;
        for (int i = 0; i<7 ; i=i+1){
            for (int j = 0; j<3;j=j+1){
                if (plateau [i][j] == plateau [i+1][j] && plateau [i][j] == plateau [i+2][j] && plateau [i][j] == plateau [i+3][j] && plateau [i][j] == 2){
                    alignement=true;
                }
            }
        }
        return alignement;
    }

    // fonction qui reconnait 4 cases horizontales
    //joueur 1
    public static boolean horizontalJ1(int [][] plateau){
        boolean alignement = false;
        for (int i = 0; i<6 ; i=i+1){
            for (int j = 0; j<4;j=j+1){
                if (plateau [i][j] == plateau [i][j+1] && plateau [i][j] == plateau [i][j+2] && plateau [i][j] == plateau [i][j+3] && plateau [i][j] == 1){
                    alignement=true;
                }
            }
        }
        return alignement;
    }

    //joueur 2
    public static boolean horizontalJ2(int [][] plateau){
        boolean alignement = false;
        for (int i = 0; i<6 ; i=i+1){
            for (int j = 0; j<4;j=j+1){
                if (plateau [i][j] == plateau [i][j+1] && plateau [i][j] == plateau [i][j+2] && plateau [i][j] == plateau [i][j+3] && plateau [i][j] == 2){
                    alignement=true;
                }
            }
        }
        return alignement;
    }

    // fonction qui reconnait 4 cases diagonales
    // joueur 1
    public static boolean diagonal1(int [][] plateau){
        boolean alignement=false;
        for (int i=0; i<3;i=i+1){
            for(int j=0;j<4;j=j+1){
                if (plateau[i][j]==plateau[i+1][j+1] && plateau[i][j]==1 && plateau[i][j]==plateau[i+2][j+2] && plateau[i][j]==plateau[i+3][j+3]){
                    alignement=true;
                }
            }
        }
        return alignement;
    }



    public static boolean diagonal2(int [][] plateau){
        boolean alignement=false;
        for(int i=0; i>3;i=i-1){
            for (int j;j<4;j=j+1){
                if (plateau[i][j]==plateau[i-1][j+1] && plateau[i][j]==plateau[i-2][j+2] && plateau[i][j]==plateau[i-3][j+3] && plateau[i][j]==1){
                    alignement=true;
                }
            }
        }
        return alignement;
    }

    //joueur2


    public static boolean diag1(int[] [] plateau){
        boolean alignement=false;
        for (int i=0; i<3;i=i+1){
            for(int j=0;j<4;j=j+1){
                if (plateau[i][j]==plateau[i+1][j+1] && plateau[i][j]==2 && plateau[i][j]==plateau[i+2][j+2] && plateau[i][j]==plateau[i+3][j+3]){
                    alignement=true;
                }
            }
        }
        return alignement;
    }



    public static boolean diag2(int[][] plateau){
        boolean alignement=false;
        for(int i=0; i>3;i=i-1){
            for (int j;j<4;j=j+1){
                if(plateau[i][j]==plateau[i-1][j+1] && plateau[i][j]==plateau[i-2][j+2] && plateau[i][j]==plateau[i-3][j+3] && plateau[i][j]==2){
                    alignement=true;
                }
            }
        }
        return alignement;
    }

    public static void main (String [] Argv ){
        int nbColonnes = 7 ; // <=> largeur , abscisse ( x )
        int nbLignes = 6 ; // <=> hauteur , ordonnee ( y )
        int [][] plateau = new int [ nbColonnes ] [ nbLignes ] ;

        int [] hauteur = new int [7];// variable précisant le hauteur
        for (int i=0;i<7;i=i+1){
            hauteur [i] = 0;
        }

        final int J1 = 1 ; // joueur 1
        final int J2 = 2 ; // joueur 2

        // Initialisation des cases du plateau à 0
        initPlateau (plateau) ;

        // initialisation de l’interface graphique
        Puissance4GUI gui = new Puissance4GUI ( plateau);

        gui.modifierMessage ( "Le jeu commence!" ) ;

        System.out.println ( "Appuyer sur ENTREE pour continuer " ) ;
        Saisie.litexte ();

        int nbcase=0;

        while (nbcase!=42 ){

            System.out.println ( "Joueur 1 : choisissez le colonne où vous voulez placer le jeton " ) ;
            int numColonne = Saisie.litentier();
            if (hauteur[numColonne-1] > 5){
                System.out.println ( "Joueur 1 : la colonne" +numColonne-1+ "est pleine! Choisissez une autre colonne") ;
                numColonne= Saisie.litentier();
                plateau [hauteur[numColonne-1]] [numColonne-1] = J1;
                gui.rafraichirCase ( hauteur[numColonne-1] , numColonne-1) ;
            }
            else{
                plateau [hauteur[numColonne-1]] [numColonne-1] = J1;
                gui.rafraichirCase ( hauteur[numColonne-1] , numColonne-1) ;
            }

            hauteur[numColonne-1] = hauteur[numColonne-1]+1;



            System.out.println ( "Joueur 2 : choisissez le colonne où vous voulez placer le jeton " ) ;
            numColonne= Saisie.litentier();
            if (hauteur[numColonne-1] > 5){
                System.out.println ( "Joueur 2 : la colonne" +numColonne-1+" est pleine!choisissez une autre colonne") ;
                numColonne = Saisie.litentier();
                plateau [hauteur[numColonne-1]] [numColonne-1] = J2;
                hauteur[numColonne-1] = hauteur[numColonne-1]+1;
                gui.rafraichirCase ( hauteur[numColonne-1] , numColonne-1) ;
            }
            else{
                plateau [hauteur[numColonne-1]] [numColonne-1] = J2;
                hauteur[numColonne-1] = hauteur[numColonne-1]+1;
                gui.rafraichirCase ( hauteur[numColonne-1] , numColonne-1) ;
            }
        }
    }
}
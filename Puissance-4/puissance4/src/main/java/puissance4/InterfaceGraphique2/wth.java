public class wth extends javax.swing.JFrame {
    
    public wth() {
        
        playTab = new int[6][7];
            for(int i=0; i<6; i++)
                for(int j=0; j<7; j++)
                {
                    playTab[i][j] = 0;
                }
        player = 1;
        fin = false;
       
        initComponents();
        
        for(int i=0; i<42; i++)
        {
            javax.swing.JButton tmpPan = new javax.swing.JButton();
            tmpPan.setEnabled(false);
            playZone.add( tmpPan );
        } 
        outPut.setText("Bidoooof !!!");
        
    }
    


    private void initComponents() {
        jToggleButton1 = new javax.swing.JToggleButton();
        playGroundPan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        play = new javax.swing.JButton();
        play2 = new javax.swing.JButton();
        play3 = new javax.swing.JButton();
        play4 = new javax.swing.JButton();
        play5 = new javax.swing.JButton();
        play6 = new javax.swing.JButton();
        play7 = new javax.swing.JButton();
        playZone = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NewBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outPut = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        playGroundPan.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 7));

        play.setText("1");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        jPanel1.add(play);

        play2.setText("2");
        play2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play2ActionPerformed(evt);
            }
        });

        jPanel1.add(play2);

        play3.setText("3");
        play3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play3ActionPerformed(evt);
            }
        });

        jPanel1.add(play3);

        play4.setText("4");
        play4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play4ActionPerformed(evt);
            }
        });

        jPanel1.add(play4);

        play5.setText("5");
        play5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play5ActionPerformed(evt);
            }
        });

        jPanel1.add(play5);

        play6.setText("6");
        play6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play6ActionPerformed(evt);
            }
        });

        jPanel1.add(play6);

        play7.setText("7");
        play7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play7ActionPerformed(evt);
            }
        });

        jPanel1.add(play7);

        playGroundPan.add(jPanel1, java.awt.BorderLayout.SOUTH);

        playZone.setLayout(new java.awt.GridLayout(6, 7));

        playZone.setBackground(new java.awt.Color(51, 51, 255));
        playGroundPan.add(playZone, java.awt.BorderLayout.CENTER);

        getContentPane().add(playGroundPan, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        NewBut.setText("Nouveau");
        NewBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewButActionPerformed(evt);
            }
        });

        jPanel2.add(NewBut);

        outPut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(outPut);

        jPanel2.add(jScrollPane1);

        close.setText("Fermer");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jPanel2.add(close);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        title.setBackground(new java.awt.Color(0, 102, 255));
        title.setFont(new java.awt.Font("Century Gothic", 1, 14));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("*** Puissance 4 ****");
        getContentPane().add(title, java.awt.BorderLayout.NORTH);

        pack();
    }//GEN-END:initComponents

    private void play7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play7ActionPerformed
        // Add your handling code here:
        int tp = testColumn(6); 
        if( tp >= 0 && !fin)
        {
        playTab[tp][6] = player;  
        
        updateScreen();
        testWinner(tp, 6, player);
        alternatePlayer();
        }
    }//GEN-LAST:event_play7ActionPerformed

    private void play6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play6ActionPerformed
        // Add your handling code here:
        int tp = testColumn(5); 
        if( tp >= 0 && !fin)
        {
        playTab[tp][5] = player;  
        
        updateScreen();
        testWinner(tp, 5, player);
        alternatePlayer();
        }
    }//GEN-LAST:event_play6ActionPerformed

    private void play5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play5ActionPerformed
        // Add your handling code here:
        int tp = testColumn(4); 
        if( tp >= 0 && !fin)
        {
        playTab[tp][4] = player;  
        
        updateScreen();
        testWinner(tp, 4, player);
        alternatePlayer();
        }
    }//GEN-LAST:event_play5ActionPerformed

    private void play4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play4ActionPerformed
        // Add your handling code here:
        int tp = testColumn(3); 
        if( tp >= 0 && !fin)
        {
        playTab[tp][3] = player;  
        
        updateScreen();
        testWinner(tp, 3, player);
        alternatePlayer();
        }
    }//GEN-LAST:event_play4ActionPerformed

    private void play3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play3ActionPerformed
        // Add your handling code here:
        int tp = testColumn(2); 
        if( tp >= 0 && !fin)
        {
        playTab[tp][2] = player;  
        
        updateScreen();
        testWinner(tp, 2, player);
        alternatePlayer();
        }
    }//GEN-LAST:event_play3ActionPerformed

    private void play2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play2ActionPerformed
        // Add your handling code here:
        int tp = testColumn(1); 
        if( tp >= 0 && !fin)
        {
        playTab[tp][1] = player;  
        
        updateScreen();
        testWinner(tp, 1, player);
        alternatePlayer();
        }
    }//GEN-LAST:event_play2ActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // Add your handling code here:
        int tp = testColumn(0); 
        // ==> testColumn return the index where U can play
        if( tp >= 0 && !fin)
        {
        playTab[tp][0] = player;  
        
        updateScreen();
        testWinner(tp, 0, player);
        alternatePlayer();
        }
    }//GEN-LAST:event_playActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // Add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void NewButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewButActionPerformed
        // Add your handling code here:
        for(int i=0; i<6; i++)
                for(int j=0; j<7; j++)
                {
                    playTab[i][j] = 0;
                }
        testWinner(testColumn(0), 0, player);
        outPut.setText("C'est parti !!!");
        updateScreen();
        fin = false;
    }//GEN-LAST:event_NewButActionPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    

    public static void main(String args[]) {
        wth app = new wth();
        
        app.setSize(500,550);
        app.setLocation(100,100);
        app.show();
    }
    
    public void updateScreen() {
        for(int i=5; i>=0; i--)
                for(int j=0; j<7; j++)
                {
                    if(playTab[i][j] == 0)
                        playZone.getComponent(i*7+j).setBackground(new java.awt.Color(200,200,200));
                    if(playTab[i][j] == 1)//red
                        playZone.getComponent(i*7+j).setBackground(new java.awt.Color(255,0,0));
                    if(playTab[i][j] == 2)//yellow
                        playZone.getComponent(i*7+j).setBackground(new java.awt.Color(255,255,0));
                }
    }    
    
    public void testWinner(int x, int y, int p) {
        
        int nAlign = 0;
        //test of lines
        
        for(int i = -3; i<4; i++)
            {
                if( (y+i)>=0 && (y+i)<7 )
                {
                    if(playTab[x][y+i] == p)
                        nAlign++;
                    else
                        nAlign = 0;
                }
                if(nAlign == 4) {
                    outPut.setText("Le joueur " + p + " a gagné !");
                    fin = true;
                    break;
                    }
            }
        
        //test of columns
        nAlign = 0;
        
        for(int i = -3; i<4; i++)
            {
                if( (x+i)>=0 && (x+i)<6 )
                {
                    if(playTab[x+i][y] == p)
                        nAlign++;
                    else
                        nAlign = 0;
                }
                if(nAlign == 4) {
                    outPut.setText("Le joueur " + p + " a gagné !");
                    fin = true;
                    break;
                    }
            }
        
        //test of diagonals
        
        // first diag
        nAlign = 0;
        for(int i = -3; i<4; i++)
            {
                if( (x+i)>=0 && (x+i)<6 && (y+i)>=0 && (y+i)<7 )
                {
                    if(playTab[x+i][y+i] == p)
                        nAlign++;
                    else
                        nAlign = 0;
                }
                if(nAlign == 4) {
                    outPut.setText("Le joueur " + p + " a gagné !");
                    fin = true;
                    break;
                    }
            }
        // second diag
        nAlign = 0;
        for(int i = -3; i<4; i++)
            {
                if( (x-i)>=0 && (x-i)<6 && (y+i)>=0 && (y+i)<7 )
                {
                    if(playTab[x-i][y+i] == p)
                        nAlign++;
                    else
                        nAlign = 0;
                }
                if(nAlign == 4) {
                    outPut.setText("Le joueur " + p + " a gagné !");
                    fin = true;
                    break;
                    }
            }
    }
    
    public void alternatePlayer() {
        if(player == 1){
            player = 2;
            }
        else{
            player = 1;
            }
    }
    
    public int testColumn(int col) {
        int test = 5; 
        for(int i = 5; i>=0 ; i--)
        {
           if(playTab[i][col] != 0)
            test--;
        }
        return(test);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewBut;
    private javax.swing.JButton close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel outPut;
    private javax.swing.JButton play;
    private javax.swing.JButton play2;
    private javax.swing.JButton play3;
    private javax.swing.JButton play4;
    private javax.swing.JButton play5;
    private javax.swing.JButton play6;
    private javax.swing.JButton play7;
    private javax.swing.JPanel playGroundPan;
    private javax.swing.JPanel playZone;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private int playTab[][];      
    private int player;   
    private boolean fin;
    
}
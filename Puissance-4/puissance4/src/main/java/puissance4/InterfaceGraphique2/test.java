package com.ynov.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class test {

    public static void main(final String[] args) {
        final JFrame parent = new JFrame();
        JButton button = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();

        button.setText("Partie en Local");
        parent.add(button);
        parent.pack();
        parent.setVisible(true);

        button2.setText("Quitter");
        parent.add(button2);
        parent.pack();
        parent.setVisible(true);

        button3.setText("test");
        parent.add(button3);
        parent.pack();
        parent.setVisible(true);

        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String name = JOptionPane.showInputDialog(parent,
                        "Au secours", null);
            }
        });


        button2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String name = JOptionPane.showInputDialog(parent,
                        "Work in progress, bud", null);
            }
        });

        button3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String name = JOptionPane.showInputDialog(parent,
                        "je teste ca", null);
            }
        });
    }
}


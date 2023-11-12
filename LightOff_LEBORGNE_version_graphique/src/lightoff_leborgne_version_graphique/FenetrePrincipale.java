package lightoff_leborgne_version_graphique;

import lightoff_leborgne_version_graphique.CelluleGraphique;
import lightoff_leborgne_version_console.GrilleDeCellules;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
import javax.swing.JLabel;
import lightoff_leborgne_version_console.GrilleDeCellules;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author bapti
 */
public class FenetrePrincipale extends javax.swing.JFrame {
// Déclaration des variables
    GrilleDeCellules grille;
    int i;
    int Coups = 0;
    private Timer timer;
    private int secondsRemaining;
    private JLabel timerLabel;

     /**
     * Constructeur de la classe FenetrePrincipale.
     * 
     * @param nbLignes    Le nombre de lignes de la grille.
     * @param nbColonnes  Le nombre de colonnes de la grille.
     * @param nbCoups     Le nombre de coups maximum autorisé.
     * @param seconde     Le nombre de secondes initial pour le compte à rebours.
     */
    public FenetrePrincipale(int nbLignes, int nbColonnes, int nbCoups, int seconde) {
        initComponents();
        int max = nbCoups;
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes); // Initialiser la grille avec le nombre de lignes et de colonnes spécifiées
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        
// Ajouter des cellules graphiques à la grille
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 500 / nbLignes, 450 / nbColonnes);
                PanneauGrille.add(bouton_cellule);
            }
        }
        
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));// Configuration du panneau des boutons verticaux
 // Ajouter des boutons pour activer les lignes de cellules
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    Coups++;// ajoute un coup quand on active une ligne 
                    grille.activerLigneDeCellules(j);
                    repaint();

                    timer.start();// debut du timer 

                    if (grille.cellulesToutesEteintes()) {// vérifie si toute les cellules sont éteintes 
                        timer.stop();// arrete le timer 
                        PageVictoire f = new PageVictoire();// crée la page victoire
                        f.setVisible(true);//affiche la page victoire 
                        FenetrePrincipale.this.dispose();// suprime la fenetre principale
                    } else if (Coups >= max) {// verifie si le nombre de coups max est dépassé 
                        timer.stop();
                        PageDefaite f = new PageDefaite();
                        f.setVisible(true);
                        FenetrePrincipale.this.dispose();
                    }
                }

                private void dispose() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);

        }

        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));// Configuration du panneau des boutons horizontaux
// Ajouter des boutons pour activer les colonnes de cellules
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int k = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    Coups++;
                    grille.activerColonneDeCellules(k);
                    repaint();

                    timer.start();

                    if (grille.cellulesToutesEteintes()) {
                        timer.stop();
                        PageVictoire f = new PageVictoire();
                        f.setVisible(true);
                        FenetrePrincipale.this.dispose();
                    } else if (Coups >= max) {
                        timer.stop();
                        PageDefaite f = new PageDefaite();
                        f.setVisible(true);
                        FenetrePrincipale.this.dispose();
                    }
                }

                private void dispose() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };

            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);
        }

        // Bouton pour activer la diagonale montante
        Diagmontante.setText(".");
        Diagmontante.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Coups++;
                grille.activerDiagonaleMontante();
                repaint();

                timer.start();

                if (grille.cellulesToutesEteintes()) {
                    timer.stop(); // Arrêter le timer si toutes les cellules sont éteintes
                    PageVictoire f = new PageVictoire();
                    f.setVisible(true);
                    FenetrePrincipale.this.dispose();
                } else if (Coups >= max) {
                    timer.stop(); // Arrêter le timer si le nombre maximum de coups est atteint
                    PageDefaite f = new PageDefaite();
                    f.setVisible(true);
                    FenetrePrincipale.this.dispose();
                }
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });

        // Bouton pour activer la diagonale descendante
        DiagDescendant.setText(".");
        DiagDescendant.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Coups++;
                grille.activerDiagonaleDescendante();
                repaint();

                // Démarrer le timer lorsque l'utilisateur effectue une action
                timer.start();

                if (grille.cellulesToutesEteintes()) {
                    timer.stop();
                    PageVictoire f = new PageVictoire();
                    f.setVisible(true);
                    FenetrePrincipale.this.dispose();
                } else if (Coups >= max) {
                    timer.stop();
                    PageDefaite f = new PageDefaite();
                    f.setVisible(true);
                    FenetrePrincipale.this.dispose();
                }
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });
// Initialisation du compte à rebours
        secondsRemaining = seconde;
        timerLabel = new JLabel("Time: " + secondsRemaining);

        ActionListener timerAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondsRemaining--;
                timerLabel.setText("Time: " + secondsRemaining);

                // Vérifier si le temps est écoulé
                if (secondsRemaining <= 0) {
                    timer.stop();// arrete le timer
                    JOptionPane.showMessageDialog(FenetrePrincipale.this, "Time's up!");// affcihe une fenetre pour dire que le temps est dépassé
                    PageDefaite f = new PageDefaite();// crée la page défaite 
                    f.setVisible(true);// affiche la page défaite 
                    FenetrePrincipale.this.dispose();// suprime la fenetre principale
                }

            }
        };

        timer = new Timer(1000, timerAction);

        getContentPane().add(timerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 360, 30));// Ajout du label du compte à rebours à la fenêtre
// Appel de la méthode pour initialiser la partie
        this.pack();
        initialiserPartie();
    }
/**
     * Initialise la partie en éteignant toutes les cellules et en mélangeant la matrice de cellules.
     */
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10000);
    }

     /**
     * Méthode appelée lorsqu'un bouton "Regles" est cliqué.
     * Affiche une fenêtre de règles.
     * 
     * @param evt L'événement associé au clic sur le bouton "Rules".
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        Diagmontante = new javax.swing.JButton();
        DiagDescendant = new javax.swing.JButton();
        Regle = new javax.swing.JButton();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 0, 0));
        PanneauGrille.setLayout(new java.awt.GridLayout(10, 10));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 360, 360));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(255, 255, 255));
        PanneauBoutonsHorizontaux.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 360, 30));

        Diagmontante.setText(".");
        getContentPane().add(Diagmontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 30, 30));

        DiagDescendant.setText(".");
        getContentPane().add(DiagDescendant, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 30, 30));

        Regle.setText("Regles");
        Regle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegleActionPerformed(evt);
            }
        });
        getContentPane().add(Regle, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 255, 255));
        PanneauBoutonsVerticaux.setMinimumSize(new java.awt.Dimension(300, 300));
        PanneauBoutonsVerticaux.setPreferredSize(new java.awt.Dimension(350, 60));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 30, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegleActionPerformed
        Regles f = new Regles();
        f.setVisible(true);
    }//GEN-LAST:event_RegleActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale(4).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiagDescendant;
    private javax.swing.JButton Diagmontante;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton Regle;
    // End of variables declaration//GEN-END:variables
}

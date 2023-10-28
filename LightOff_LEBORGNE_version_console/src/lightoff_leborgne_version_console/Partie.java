/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leborgne_version_console;

import java.util.Random;
import java.util.Scanner;
import lightoff_leborgne_version_console.CelluleLumineuse;
import lightoff_leborgne_version_console.GrilleDeCellules;

public class Partie {

    private GrilleDeCellules grille;
    private int nbCoups;

    /**
     *
     * @param nbLignes
     * @param nbColonnes
     */
    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeCellules(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    /**
     * initialise la partie en melangant le plateau de jeu 
     * @param nbTours
     */
    public void initialiserPartie(int nbTours) {
        grille.melangerMatriceAleatoirement(nbTours);
    }

    /**
     * Demande au joueur quel coup il veut jouer 
     * @return le coup jouer 
     */
    public String obtenirCoupJoueur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un coup (ligne, colonne, diagonale_descendante, diagonale_montante) :");
        return scanner.nextLine();
    }

    /**
     * Demande la difficulté du jeu que le joueur veut 
     * @return la grille mélanger suivant la difficulté demander
     */
    public void configurerNiveauDifficulte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile");
        System.out.println("2. Moyen");
        System.out.println("3. Difficile");

        int choix = scanner.nextInt();

        scanner.nextLine();

        double pourcentageCellulesAllumees;
        switch (choix) {
            case 1:
                pourcentageCellulesAllumees = GrilleDeCellules.POURCENTAGE_CELLULES_ALLUMEES_FACILE;
                break;
            case 2:
                pourcentageCellulesAllumees = GrilleDeCellules.POURCENTAGE_CELLULES_ALLUMEES_MOYEN;
                break;
            case 3:
                pourcentageCellulesAllumees = GrilleDeCellules.POURCENTAGE_CELLULES_ALLUMEES_DIFFICILE;
                break;
            default:
                System.out.println("Choix invalide. Sélectionnez un niveau de difficulté valide.");
                configurerNiveauDifficulte(); 
                return;
        }

        grille.melangerMatriceAleatoirement(pourcentageCellulesAllumees);
    }

    /**
     *initialise le lancemant de partie
     * gere la boucle de jeu ( demande le coup jouer, modifie le plateau, donne le resultat de la partie) 
     */ 
    public void lancerPartie() {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans LightOff!");
        System.out.println("Grille de départ :");
        System.out.println(grille);

        int nbCoupMax = GrilleDeCellules.NB_TOURS_FACILE; 
        if (grille.getPourcentageCellulesAllumees() == GrilleDeCellules.POURCENTAGE_CELLULES_ALLUMEES_MOYEN) {
            nbCoupMax = GrilleDeCellules.NB_TOURS_MOYEN;
        } else if (grille.getPourcentageCellulesAllumees() == GrilleDeCellules.POURCENTAGE_CELLULES_ALLUMEES_DIFFICILE) {
            nbCoupMax = GrilleDeCellules.NB_TOURS_DIFFICILE;
        }

        int nbCoups = 0;

           while (!grille.cellulesToutesEteintes() && nbCoups < nbCoupMax) {
        System.out.println("Entrez un coup (ligne, colonne, diagonale_descendante, diagonale_montante) :");
        String coup = scanner.nextLine(); 

            
        if (coup.equalsIgnoreCase("ligne")) {
                System.out.println("Entrez le numéro de la ligne à activer :");
                int numeroLigne = scanner.nextInt();
                scanner.nextLine(); 
                grille.activerLigneDeCellules(numeroLigne);
            } else if (coup.equalsIgnoreCase("colonne")) {
                System.out.println("Entrez le numéro de la colonne à activer :");
                int numeroColonne = scanner.nextInt();
                scanner.nextLine(); 
                grille.activerColonneDeCellules(numeroColonne);
            } else if (coup.equalsIgnoreCase("diagonale_descendante")) {
                grille.activerDiagonaleDescendante();
                scanner.nextLine(); 
            } else if (coup.equalsIgnoreCase("diagonale_montante")) {
                grille.activerDiagonaleMontante();
                scanner.nextLine(); 
            } else {
            System.out.println("Coup invalide. Utilisez 'ligne', 'colonne', 'diagonale_descendante' ou 'diagonale_montante'.");
            continue; 
        }

            nbCoups++;
            System.out.println("Nombre de coups joués : " + nbCoups);
            System.out.println("État de la grille :");
            System.out.println(grille);

            if (nbCoups >= nbCoupMax) {
                System.out.println("Désolé, vous avez dépassé le nombre maximum de coups autorisés.");
                break; 
            }
        }
        if (grille.cellulesToutesEteintes()) {
            System.out.println("Bravo ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leborgne_version_console;

import lightoff_leborgne_version_console.CelluleLumineuse;



/**
 *
 * @author bapti
 */
public class GrilleDeCellules {

    private CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    
public static final int NB_TOURS_FACILE = 50;
public static final int NB_TOURS_MOYEN = 30;
public static final int NB_TOURS_DIFFICILE = 15;

public static final double POURCENTAGE_CELLULES_ALLUMEES_FACILE = 0.2;
public static final double POURCENTAGE_CELLULES_ALLUMEES_MOYEN = 0.4;
public static final double POURCENTAGE_CELLULES_ALLUMEES_DIFFICILE = 0.6;

private double pourcentageCellulesAllumees;

    /**
     *sert à obtenir la valeur actuelle de la variable 
     * @return double qui vaut le pourcentage de cellules allumees 
     */
    public double getPourcentageCellulesAllumees() {
    return pourcentageCellulesAllumees;
}

    /**
     * Création du tableau de "i" ligne et "j" colone
     *
     * @param p_nbLignes
     * @param p_nbColonnes
     */
    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;

        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Eteint toute les cellules du tableau
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindre();
            }
        }
    }

    /**
     * active tout une ligne/colone/diaguonale au hasard
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int choix = (int) (Math.random() * 3);
        switch (choix) {
            case 0:
                activerLigneDeCellules((int) (Math.random() * nbLignes));
                break;
            case 1:
                activerColonneDeCellules((int) (Math.random() * nbColonnes));
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
        }
    }

    /**
     * Génère le plateau aléatoirement un plateau de début de jeu
     *
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(double pourcentageCellulesAllumees) {
    eteindreToutesLesCellules();
    int nbTours = nbLignes * nbColonnes; 
    int nbCellulesAllumees = (int) (nbTours * pourcentageCellulesAllumees);

    while (nbCellulesAllumees > 0) {
        int ligne = (int) (Math.random() * nbLignes);
        int colonne = (int) (Math.random() * nbColonnes);

        if (!matriceCellules[ligne][colonne].getEtat()) {
            matriceCellules[ligne][colonne].allumer();
            nbCellulesAllumees--;
        }
    }
}


    /**
     * active toute les cellules d'une ligne
     *
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
    for (int j = 0; j < nbColonnes; j++) {
        matriceCellules[j][idLigne].activerCellule();
    }
}

    /**
     * active toute les cellules d'une colone
     *
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
    for (int i = 0; i < nbLignes; i++) {
        matriceCellules[i][idColonne].activerCellule();
    }
}

    /**
     * active toute les cellules de la diagonale decsendante
     */
    public void activerDiagonaleDescendante() {
    for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
        matriceCellules[i][i].activerCellule();
    }
}

    /**
     * active toute les cellules de la diagonale montante
     */
    public void activerDiagonaleMontante() {
    for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
        matriceCellules[i][nbColonnes - 1 - i].activerCellule();
    }
}

    /**
     * eteint toute les cellules du plateau
     *
     * @return le plateau éteint
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Cree un le tableau de jeu
     * @return un tableau de i ligne et j colonne 
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(" |");
        for (int j = 0; j < nbColonnes; j++) {
            builder.append(" " + j + " |");
        }
        builder.append("\n");

        for (int j = 0; j < nbColonnes + 1; j++) {
            builder.append("----");
        }
        builder.append("\n");

        for (int i = 0; i < nbLignes; i++) {
            builder.append(i + " |");
            for (int j = 0; j < nbColonnes; j++) {
                builder.append(" " + (matriceCellules[i][j].estEteint() ? "X" : "O") + " |");
            }
            builder.append("\n");

            for (int j = 0; j < nbColonnes + 1; j++) {
                builder.append("----");
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}

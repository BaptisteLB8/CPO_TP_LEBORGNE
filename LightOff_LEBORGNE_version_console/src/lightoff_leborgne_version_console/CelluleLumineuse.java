/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_leborgne_version_console;

/**
 *
 * @author bapti
 */
public class CelluleLumineuse {

    private boolean etat;

    /**
     * initialise l'etat en éteint
     */
    public CelluleLumineuse() {
        etat = false;
    }

    /**
     * initialise en allumer
     */
    public void allumer() {
        etat = true;
    }

    /**
     * initialise en éteint
     *
     * @return: renvoie éteint
     */
    public void eteindre() {
        etat = false;
    }

    /**
     * active la cellule lumineuse en inversant son etat
     *
     * @return: renvoie l'inverse de son etat
     */
    public void activerCellule() {
        etat = !etat;
    }

    /**
     * éteint la cellule
     *
     * @return: éteint
     */
    public void eteindreCellule() {
        etat = false;

    }

    /**
     * vérifie si la cellule est actuellement éteint
     *
     * @return: renvoie l'inverse de son état
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * donne l'état actuel de la cellule
     *
     * @return état
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * donne comme valeur X si elle est allumé et O si elle est éteinte
     *
     * @return X ou O suivant l'état de la cellule
     */
    @Override
    public String toString() {
        if (etat) {
            return "X";
        } else {
            return "O";
        }
    }
}
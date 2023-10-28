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
     * initialise l'etat en �teint
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
     * initialise en �teint
     *
     * @return: renvoie �teint
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
     * �teint la cellule
     *
     * @return: �teint
     */
    public void eteindreCellule() {
        etat = false;

    }

    /**
     * v�rifie si la cellule est actuellement �teint
     *
     * @return: renvoie l'inverse de son �tat
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * donne l'�tat actuel de la cellule
     *
     * @return �tat
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * donne comme valeur X si elle est allum� et O si elle est �teinte
     *
     * @return X ou O suivant l'�tat de la cellule
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
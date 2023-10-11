/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_leborgne;

/**
 *
 * @author bapti
 */
public class BouteilleBiere {

    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
public void lireEtiquette() {
            System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);

        }

    void Decapsuler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class Decapsuler {

        public boolean Decapsuler() {
            if (ouverte == true) {
                System.out.println("erreur : biere déjà ouverte");
                return false;
            } else {
                ouverte = true;
                return true;
            }
        }
    }
    public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}

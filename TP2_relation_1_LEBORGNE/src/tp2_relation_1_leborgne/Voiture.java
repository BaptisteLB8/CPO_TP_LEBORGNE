/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_leborgne;

/**
 *
 * @author bapti
 */
public class Voiture {
  String Modele;
    String Marque;
    int Puissance;
    Personne Proprietaire ;
    
    @Override
    public String toString() {
        String chaine;
        chaine=Modele+""+Marque+""+Puissance;
        return chaine;
    }

    public Voiture(String modele, String marque,int puissance) {
        Modele=modele;
        Marque=marque;
        Puissance=puissance;
        Proprietaire=null;
        
    }
  
}
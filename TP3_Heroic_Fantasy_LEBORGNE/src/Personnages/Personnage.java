/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author bapti
 */

public abstract class Personnage {
    String nom;
    int niveauDeVie;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauVie = niveauDeVie;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nom : " + nom + ", Niveau de vie : " + niveauVie;
    }

    Arme[] inventaire = new Arme[5];
    Arme armeEnMain = null;
    
    private int niveauVie ;  
    Arme arme_en_main =null;
    ArrayList<Arme> Tab_armes=new ArrayList<>(5);

    public Arme getArme_en_main() {
        return arme_en_main;
    }
  public void Ajout_arme(Arme arme){
        if(Tab_armes.size() < 5){
            Tab_armes.add(arme);
        }
    }
  

    public void equiperArme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme != null && arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " est maintenant équipé avec " + nomArme);
                break;
            }
        }
    }
    
    public void Methode_arme(Arme arme){
    int verif = 0;  
        for (int i=0;i<Tab_armes.size();i++){
    

    }
}
}

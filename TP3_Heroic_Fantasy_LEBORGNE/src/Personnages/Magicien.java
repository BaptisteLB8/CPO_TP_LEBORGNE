/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Baton;

/**
 *
 * @author bapti
 */
public class Magicien extends Personnage {
     private boolean Confirme;

    public Magicien(String nom, int niveauDeVie, boolean Confirme) {
        super(nom, niveauDeVie);
        this.Confirme = Confirme;
    }

    public void Confirme(boolean Confirme) {
        this.Confirme = Confirme;
    }
    
     public void Armepredilection(){
        int a=0;
        for (int i=0; i<Tab_armes.size(); i++){
            if (Tab_armes.get(i) instanceof Baton){
                a += 1;
            }
    }
        System.out.println("Le magicien a "+a+" arme(s) de prédilection(s)");
    
}
}

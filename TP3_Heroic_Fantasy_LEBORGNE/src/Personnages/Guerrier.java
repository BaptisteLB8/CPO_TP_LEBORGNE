/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Baton;
import Armes.Epee;

/**
 *
 * @author bapti
 */
public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        this.aCheval = aCheval;
    }
    
     public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }
     
     public void Armepredilection(){
        int a=0;
        for (int i=0; i<Tab_armes.size(); i++){
            if (Tab_armes.get(i) instanceof Epee){
                a += 1;
            }

}
     }
}
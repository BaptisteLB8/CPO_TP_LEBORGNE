/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author bapti
 */
public class Baton extends Arme {
    int age;

   public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); 
        this.age = age; 
    }
     public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }


    public String toString() {
        return "Nom du bâton : " + nom + ", Niveau d'attaque : " + niveauAttaque + ", Âge : " + age;
    }
}


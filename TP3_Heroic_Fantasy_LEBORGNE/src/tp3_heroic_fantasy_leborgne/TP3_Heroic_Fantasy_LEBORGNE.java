/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_leborgne;

import Personnages.Magicien;
import Personnages.Personnage;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Epee;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author bapti
 */
public class TP3_Heroic_Fantasy_LEBORGNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arme epee1 = new Epee("Excalibur", 50, 5);
        Arme epee2 = new Epee("Durandal", 4, 18);

        Arme baton1 = new Baton("Chêne", 4, 5);
        Arme baton2 = new Baton("Charme", 5, 6);

        ArrayList<Arme> listeArmes = new ArrayList<>();
        listeArmes.add(epee1);
        listeArmes.add(epee2);
        listeArmes.add(baton1);
        listeArmes.add(baton2);

        for (int i = 0; i < listeArmes.size(); i++) {
            System.out.println(listeArmes.get(i));
        }

        Magicien Gandalf = new Magicien("Gandalf", 58, true);
        Magicien Garcimore = new Magicien("Garcimore", 27, false);
        Guerrier Conan = new Guerrier("Conan", 18, true);
        Guerrier Lannister = new Guerrier("Lannister", 96, false);

        ArrayList<Personnage> tab1 = new ArrayList<>();
        tab1.add(Gandalf);
        tab1.add(Garcimore);
        tab1.add(Conan);
        tab1.add(Lannister);
        for (int i = 0; i < tab1.size(); i++) {
            System.out.println(tab1.get(i));

            Magicien Albus = new Magicien("Albus", 82, true);
            Guerrier Aragorn = new Guerrier("Aragorn", 87, false);
            Epee Excalibur = new Epee("Excalibur", 5, 8);
            Epee Lancelot = new Epee("Lancelot", 6, 4);
            Epee Guenièvre = new Epee("Guenièvre", 7, 5);
            Baton Merlin = new Baton("Merlin", 7, 2);
            Baton Morgane = new Baton("Morgane", 5, 5);
            Baton Morgause = new Baton("Morgause", 3, 7);

            Aragorn.Ajout_arme(Morgause);
            Aragorn.Ajout_arme(Lancelot);
            Aragorn.Ajout_arme(Excalibur);
            Aragorn.Methode_arme(Lancelot);
            Albus.Ajout_arme(Merlin);
            Albus.Ajout_arme(Morgane);
            Albus.Ajout_arme(Guenièvre);
            Albus.Methode_arme(Guenièvre);
            Aragorn.Armepredilection();
            Albus.Armepredilection();

        }
    }
}

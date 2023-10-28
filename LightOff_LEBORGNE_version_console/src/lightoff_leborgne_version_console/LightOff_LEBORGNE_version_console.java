/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_leborgne_version_console;
import java.util.Scanner;
/**
 *
 * @author bapti
 */
public class LightOff_LEBORGNE_version_console {

    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenue dans LightOff!");
    System.out.print("Entrez le nombre de lignes : ");
    int nbLignes = scanner.nextInt();
    System.out.print("Entrez le nombre de colonnes : ");
    int nbColonnes = scanner.nextInt();

    Partie partie = new Partie(nbLignes, nbColonnes);
    partie.configurerNiveauDifficulte();
    partie.lancerPartie();
}
}
 

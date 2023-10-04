/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_leborgne;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author bapti
 */
public class TP1_stats_LEBORGNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] tableauResultats = new int[6];
        
        System.out.print("Veuillez saisir le nombre de lancers : ");
        int m = scanner.nextInt();
        
        Random generateurAleat = new Random();

        for (int i = 0; i < m; i++) {
            int resultatDe = generateurAleat.nextInt(6); 
            tableauResultats[resultatDe]++; 
        }
        System.out.println("Résultats des lancers :");
        for (int face = 0; face < 6; face++) {
            double pourcentage = (double) tableauResultats[face] / m * 100.0;
            System.out.println("Face " + (face + 1) + ": " + pourcentage + "%");
        }
    }
}

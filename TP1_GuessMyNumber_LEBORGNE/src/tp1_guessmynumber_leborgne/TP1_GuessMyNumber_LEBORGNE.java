/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_leborgne;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP1_GuessMyNumber_LEBORGNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le niveau de difficulté (1,2 ou 3 )");
        int niveau = scanner.nextInt();
        System.out.println("Vous avez saisi le niveau : " + niveau);
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println("Nombre aléatoire #" + n);
        System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
        int n2 = scanner.nextInt();
        int i = 1;
        if (niveau == 1) {
            while (n != n2) {
                if (n < n2 - 20) {
                    System.out.print("le nombre est beaucoup trop grand ");
                    System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
                    n2 = scanner.nextInt();
                    i = i + 1;
                }
                if (n < n2) {
                    System.out.print("le nombre est trop grand ");
                    System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
                    n2 = scanner.nextInt();
                    i = i + 1;
                }
                if (n > n2 + 20) {
                    System.out.print("le nombre est beaucoup trop petit");
                    System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
                    n2 = scanner.nextInt();
                    i = i + 1;
                }
                if (n > n2) {
                    System.out.print("le nombre est trop petit ");
                    System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
                    n2 = scanner.nextInt();
                    i = i + 1;
                }
            }
        }

                if (niveau == 2) {
                    while (n != n2) {
                        if (n < n2) {
                            System.out.print("le nombre est trop grand ");
                            System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
                            n2 = scanner.nextInt();
                            i = i + 1;
                        }
                        if (n > n2) {
                            System.out.print("le nombre est trop petit ");
                            System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
                            n2 = scanner.nextInt();
                            i = i + 1;
                        }
                    }
                }
                if (niveau == 3) {
                    while (n != n2) {
                        if (n < n2) {
                            System.out.print("le nombre est trop grand ");
                            System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
                            n2 = scanner.nextInt();
                            i = i + 1;
                        }
                        if (n > n2) {
                            System.out.print("le nombre est trop petit ");
                            System.out.print("Veuillez saisir un nombre entre 0 et 100 : ");
                            n2 = scanner.nextInt();
                            i = i + 1;
                            if (i <= 3) {
                                System.out.print("Vous avez perdu ");
                            }
                        }
                    }
                }
                System.out.print("Bravo! le nombre etait " + n + " Vous avez reussie en " + i + " tentatives");


       
    }

}

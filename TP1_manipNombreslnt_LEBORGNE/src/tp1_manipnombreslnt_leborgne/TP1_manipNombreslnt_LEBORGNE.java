/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_leborgne;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP1_manipNombreslnt_LEBORGNE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir le premier entier : ");
        int var1 = scanner.nextInt();

        System.out.print("Veuillez saisir le deuxième entier : ");
        int var2 = scanner.nextInt();

        int somme = var1 + var2;
        int difference = var1 - var2;
        int produit = var1*var2;
        int quotient = var1/ var2;
        int reste = var1 % var2;

        System.out.println("La somme des deux entiers est : " + somme);
        System.out.println("La différence des deux entiers est : " + difference);
        System.out.println("Le produit des deux entiers est : " + produit);
        System.out.println("Le quotient des deux entiers est : " + quotient);
        System.out.println("Le reste des deux entiers est : " + reste);
        
    }
}

    
    


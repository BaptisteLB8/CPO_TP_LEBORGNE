/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author bapti
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the operator:" + "\n 1) add" + " \n 2) subtract " + "\n 3) multiply" + "\n 4) divide " + "\n 5) modulo");
        int operateur = scanner.nextInt();
if(operateur<1|| operateur>5){
    System.out.println("error");
    System.exit(0);
}
        System.out.print("Please enter the first operand: ");
        int operande1 = scanner.nextInt();

        System.out.print("Please enter the second operand: ");
        int operande2 = scanner.nextInt();

        System.out.println("Vous avez saisi l'opérateur : " + operateur);
        System.out.println("Vous avez saisi la première valeur : " + operande1);
        System.out.println("Vous avez saisi la deuxième valeur : " + operande2);
 int result=0;
 if(operateur==1){
     result=operande1+operande2;   
    }
 if(operateur==2){
     result=operande1-operande2;   
    }
 if(operateur==3){
     result=operande1*operande2;   
    }
 if(operateur==4){
     result=operande1/operande2;   
    }
 if(operateur==5){
     result=operande1%operande2;   
    }
 
 System.out.println("result is :" +result);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_leborgne_version_console;

/**
 *
 * @author bapti
 */
public class LightOff_LEBORGNE_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        System.out.println("�tat initial de la cellule 1 : " + cellule1);
        
        cellule1.allumer();
        System.out.println("�tat apr�s avoir allum� la cellule 1 : " + cellule1);
        cellule1.eteindre();
        System.out.println("�tat apr�s avoir �teint la cellule 1 : " + cellule1);
    }
}




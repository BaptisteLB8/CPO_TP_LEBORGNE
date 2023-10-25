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
        System.out.println("État initial de la cellule 1 : " + cellule1);
        
        cellule1.allumer();
        System.out.println("État après avoir allumé la cellule 1 : " + cellule1);
        cellule1.eteindre();
        System.out.println("État après avoir éteint la cellule 1 : " + cellule1);
    }
}




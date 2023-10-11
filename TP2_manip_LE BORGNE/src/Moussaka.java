/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bapti
 */
public class Moussaka {
    int nbCalories;

    public Moussaka(int calories) {
        nbCalories = calories;
    }

    public static void main(String[] args) {
       
        Moussaka[] moussakaArray = new Moussaka[10];

        for (int i = 0; i < 10; i++) {
            moussakaArray[i] = new Moussaka(i * 100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("nb de calories de Moussaka " + i + ": " + moussakaArray[i].nbCalories);
        }
    }
}

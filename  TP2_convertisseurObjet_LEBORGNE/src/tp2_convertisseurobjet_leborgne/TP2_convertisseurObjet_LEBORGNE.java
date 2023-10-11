/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_leborgne;

/**
 *
 * @author bapti
 */
public class TP2_convertisseurObjet_LEBORGNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Convertisseur nbConversions  = new Convertisseur();

        double tKelvin1 = nbConversions.CelciusVersKelvin(25.0);
        double tFarenheit1 = nbConversions .CelciusVersFarenheit(30.0);

        System.out.println("Nombre de conversions effectuées par le convertisseur1 : " + nbConversions );

        Convertisseur convertisseur2 = new Convertisseur();

        double tCelcius2 = convertisseur2.KelvinVersCelcius(298.15);
        double tFarenheit2 = convertisseur2.KelvinVersFarenheit(275.0);

        System.out.println("Nombre de conversions effectuées par le convertisseur2 : " + convertisseur2);
    }
}
   
    

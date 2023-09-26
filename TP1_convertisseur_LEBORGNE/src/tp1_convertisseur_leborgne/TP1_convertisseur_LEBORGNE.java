/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_leborgne;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP1_convertisseur_LEBORGNE {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir une température en degrés Celsius : ");
        double temperatureCelsius = scanner.nextDouble();

        double temperatureKelvin = CelciusVersKelvin(temperatureCelsius);
        double temperatureFahrenheit = CelciusVersFahrenheit(temperatureCelsius);

        System.out.println("La température en degrés Kelvin est : " + temperatureKelvin);
        System.out.println("La température en degrés Fahrenheit est : " + temperatureFahrenheit);

        scanner.close();
    }

    public static double CelciusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    public static double CelciusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9/5) + 32;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FahrenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5/9;
    }

    public static double KelvinVersFahrenheit(double tKelvin) {
        double celsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFahrenheit(celsius);
    }

    public static double FahrenheitVersKelvin(double tFahrenheit) {
        double celsius = FahrenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(celsius);
    }
}


    
    

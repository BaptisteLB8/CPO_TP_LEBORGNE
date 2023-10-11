/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_leborgne;

/**
 *
 * @author bapti
 */
public class TP2_Bieres_LEBORGNE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",(float)7.0 ,"Dubuisson") ;
    uneBiere.lireEtiquette();
    BouteilleBiere Leffe = new BouteilleBiere("Leffe",(float)6.6 ,"Abbaye de Leffe") ;
    Leffe.lireEtiquette();
    System.out.println(uneBiere) ;
    Leffe.Decapsuler ();
    BouteilleBiere Heinken = new BouteilleBiere("H",(float)4.0 ,"Abbaye de H") ;
    Heinken.lireEtiquette();
    BouteilleBiere Cidre = new BouteilleBiere("Cidre",(float)2.0 ,"Abbaye de Cidre") ;
    Cidre.lireEtiquette();
    BouteilleBiere Ruby = new BouteilleBiere("Ruby",(float)4.5 ,"Abbaye de Ruby") ;
    Ruby.lireEtiquette();
    }
    
}

package Exercice3.Exercice3_Generik;

import java.awt.List;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {   // Verification de la question 3 

        Entier entier1 = new Entier(1);
        Entier entier2 = new Entier(2);
        Entier entier3 = new Entier(3);
        System.out.println(entier1.sommer(entier2.sommer(entier3)));

        Chaine chaine1 = new Chaine("a");
        Chaine chaine2 = new Chaine("b");
        Chaine chaine3 = new Chaine("c");
        Chaine chaine4 = new Chaine("ne");
        System.out.println(chaine1.sommer(chaine2.sommer(chaine3.sommer(chaine4))));

    }
    
   
}
package Exercice3.Exercice3_Generik;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine> { // Classe qui permet l'encapsulation d'une chaine de caractere 
    private String valeur;

    public Chaine(String _valeur) {
        this.valeur = _valeur;
    }

    @Override
    public Chaine sommer(final Chaine valeur) {
        return new Chaine(this.valeur + valeur.getValeur());
    }

    public String getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Chaine[" +  "résultat ='" + valeur + '\'' +']';
    }

    @Override
    public int compareTo(Chaine inconnu) {
        return this.valeur.compareTo(inconnu.getValeur());
    }
}

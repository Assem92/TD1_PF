package Exercice3.Exercice3_Generik;


import java.util.Set;

public interface Arbre<U extends Sommable<U> & Comparable<U>> {
    int taille();

    boolean contient(final U val);

    Set<U> valeurs();

    U max();

    U min();

    U somme();

    boolean estTrie();

}

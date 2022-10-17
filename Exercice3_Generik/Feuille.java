package Exercice3.Exercice3_Generik;

import java.util.Set;

public class Feuille<U extends Sommable<U> & Comparable<U>> implements Arbre<U> { // Implementation de Comparable et de Sommable
    private final U valeur;

    public Feuille(U valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final U val) {
        return val.equals(this.valeur);
    }

    @Override
    public Set<U> valeurs() {
        return Set.of(this.valeur);
    }


    @Override
    public U max() {
        return valeur;
    }
    
    @Override
    public U min() {
        return valeur;
    }

    @Override
    public U somme() {
        return valeur;
    } 

    @Override
    public boolean estTrie() {
        return false;
    }

}
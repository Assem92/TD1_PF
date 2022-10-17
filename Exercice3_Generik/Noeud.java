package Exercice3.Exercice3_Generik;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Noeud<U extends Sommable<U> & Comparable<U>> implements Arbre<U> {
    private List<Arbre<U>> fils;

    public Noeud(List<Arbre<U>> fils) {
        this.fils = new ArrayList<>();
    }

    @Override
    public int taille() {
        return this.fils.stream().map(Arbre<U>::taille).reduce(0, (arg0, arg1) -> Integer.sum(arg0, arg1));
    }

    @Override
    public boolean contient(U val) {
        for ( Arbre<U> a : fils) {
            if (a.contient(val))
                return true;
        }
        return false;
    }

    @Override
    public Set<U> valeurs() {
        Set<U> z = new HashSet<>();
        for ( Arbre<U> a : fils) {
            z.addAll(a.valeurs());
        }
        return z;
    }

    @Override
    public U somme() {

        Iterator<Arbre<U>> el1 = fils.iterator();
        U t1 = el1.next().somme();
        U next;
        while (el1.hasNext()) {
            next = el1.next().somme();
            t1 = t1.sommer(next);
        }
        return t1;
    }
    
    
    @Override
    public U max() {
        U x = fils.get(0).max();
        for(Arbre <U> maximum : fils){
            U variable = maximum.max();
            if(x.compareTo(maximum.max()) < 0)
            {
              x=variable;
            }
        }
        return x;
    }
    
    @Override
    public U min() {
        U x = fils.get(0).min();
        for(Arbre <U> minimum : fils){
            U variable = minimum.min();
            if(x.compareTo(minimum.min()) >0)
            {
              x=variable;
            }
        }
        return x;
    }


    @Override
    public boolean estTrie() {
        return cT1() && cT2();
    }

    private boolean cT2() {
        boolean z = true;
        for (int i = 0; i < fils.size() - 1; i++) {
             Arbre<U> fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return z;
    }

    private boolean cT1() {
        boolean z = true;
        for( int i = 0; i < fils.size() - 1; i++){
            Arbre<U> condi1 = fils.get(i);
            if(condi1.max().compareTo(fils.get(i+1).min())>0){
                z = false;
            }   
        }
        return z;
    }
}
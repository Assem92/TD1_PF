package Exercice3_Normal;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud implements Arbre{

    private final List<Arbre> fils;

    Noeud(List<Arbre> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int tot = 0;
        for (Arbre f : fils) {
            tot = tot + f.taille();
        }
        return tot;
    }

    @Override
    public boolean contient(Integer val) {
        for (Arbre a : fils) {
            if (a.contient(val)) return true;
        }
        return false;
    }

    @Override
    public Set<Integer> valeurs() {
        Set<Integer> valeurs = new HashSet<>();

        for (Arbre a : fils) {
            valeurs.addAll(a.valeurs());
        }

        return valeurs;
    }

    @Override
    public Integer somme() {
        int tot = 0;
        for (Arbre f : fils) {
            tot += f.somme();
        }
        return tot;
    }
    
    @Override
    public Integer max() {
        return Collections.max(this.valeurs());
    }


    @Override
    public Integer min() {
        return Collections.min(this.valeurs());
    }

      
    private boolean cT1() {
        boolean z = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return z;
    }

    private boolean cT2() {
        boolean Z = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            final Arbre fj = fils.get(i+1);
                if (fi.max() > fj.min())
                    return false;
        }
        return Z;
    }
    
    @Override
    public boolean estTrie() {
        return cT1() && cT2();
    }

    
}


    


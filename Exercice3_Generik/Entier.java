package Exercice3.Exercice3_Generik;


import java.util.Objects;

public class Entier implements Sommable<Entier>, Comparable<Entier> {
    private final Integer val;

    public Entier(final Integer val) {
        this.val = val;
    }

    @Override
    public Entier sommer(Entier e) {
        return new Entier(this.val + e.getVal());
    }

    public Integer getVal() {
        return val;
    }

    @Override
    public boolean equals(Object obj ) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Entier entier = (Entier) obj ;
        return Objects.equals(val, entier.val);
    }
    

    @Override
    public String toString() {
        return "Entier[" + "résultat =" + val +']';
    }

    @Override
    public int compareTo(Entier inconnu) {
        return this.val.compareTo(inconnu.getVal());
    }
}

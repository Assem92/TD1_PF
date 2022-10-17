package Exercice2;


public class Paire<A,B> {

    private A fst;
    private B snd;

    public Paire(final A fst, final B snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public A fst() { 

        return fst; 
    }

    public B snd() { 

        return snd; 
    }

    @Override
    public String toString() {

        return String.format("(%s, %s) :: Paire[%s,%s]", fst, snd, fst.getClass().getSimpleName(), snd.getClass().getSimpleName());
    }

    public <D> Paire<D,B> changeFst(D val) { 

        return new Paire<>(val, snd); 
    }

    public <D> Paire<A,D> changeSnd(D val) {

        return new Paire<>(fst, val); 
    }

    public static void main(String[] args) {
        Paire  <Integer, String> a = new Paire <> (5,"DODO");
        Paire <Double, String> b = new Paire <> (1.0, "un"); 
        Paire <Double, Paire <Integer, String>> c = new Paire<>(1.0, a);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());     }
}
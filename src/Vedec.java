import sk.upjs.jpaz2.Turtle;

public class Vedec extends Turtle {
    public long pocetCifier(long cislo) {
        long pocet = 0;
        while (cislo>0) {
            cislo = cislo/10;
            pocet++;
        }
        return pocet;

    }
}
import sk.upjs.jpaz2.JPAZUtilities;
import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class Vedec extends Turtle {
    public long pocetCifier(long cislo) {
        long pocet = 0;
        while (cislo>0) {
            cislo = cislo/10;
            pocet++;
        }
        return pocet;

    }
    public int pocetDelitelov(int n) {
        int poc = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                poc++;
            }
        }
        return poc;
    }
    public boolean maCifru(byte c, int n) {
        while (n > 0) {
            int zvysok = n%10;
            if (zvysok == c) {
                return  true;
            }
            n = n/10;
        }
        return false;
    }
    public long mocnina(int n, int k) {
        long vysledok = 1;
        for (int i = 0; i < k; i++) {
            vysledok = vysledok*n;
        }
        return vysledok;
    }
    public long faktorial(int n) {
        long vysledok = n;
        for (int i = 1; i < n; i++) {
            vysledok = vysledok * (n-i);
        }
        return vysledok;
    }
    public double sustredneKruhy(double polomer) {
        double sucet = 0.0;
        int i = 0;
        while (polomer > 0.5) {
            if (i % 3 == 0) {
                this.setFillColor(Color.red);
            }
            if (i % 3 == 1) {
                this.setFillColor(Color.blue);
            }
            if (i % 3 == 2) {
                this.setFillColor(Color.gray);
            }
            i++;
            this.dot(polomer);
            sucet += (Math.PI*polomer*polomer);
            polomer = polomer * 0.99;
        }
        return sucet;
    }
    public double sustredneKruhyPodlaMatusa(double polomer) {
        double sucet = 0.0;
        int i = 0;
        while (polomer > 0.5) {
            farbicky(i);
            i++;
            this.dot(polomer);
            sucet += (Math.PI*polomer*polomer);
            polomer = polomer * 0.99;
        }
        return sucet;
    }

    private void farbicky(int i) {
        if (i % 3 == 0) {
            this.setFillColor(Color.red);
        }
        if (i % 3 == 1) {
            this.setFillColor(Color.blue);
        }
        if (i % 3 == 2) {
            this.setFillColor(Color.gray);
        }
    }
    public void troj(double strana) {
        this.setPenWidth(20);
        while (true) {
            this.setPenColor(nahodnaFarba());
            JPAZUtilities.delay(100);
            this.step(strana);
            this.turn(120);
            this.setPenColor(nahodnaFarba());
            JPAZUtilities.delay(100);
            this.step(strana);
            this.turn(120);
            this.setPenColor(nahodnaFarba());
            JPAZUtilities.delay(100);
            this.step(strana);
            this.turn(120);
        }
    }







    public Color nahodnaFarba() {
        Color farba = new Color((int)(Math.random()*256),
                (int)(Math.random()*256),
                (int)(Math.random()*256));
        return farba;
    }
}
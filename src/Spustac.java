import sk.upjs.jpaz2.*;

import java.awt.*;

public class Spustac {
    public static void main(String[] args) {
        WinPane plocha = new WinPane(1600, 900);
        ObjectInspector oi = new ObjectInspector();
        oi.inspect(plocha);


        MojaKorytnacka mk = new MojaKorytnacka();
        plocha.add(mk);

        mk.mlyn(360, 20, 300);
        }
    }

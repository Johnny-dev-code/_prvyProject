import sk.upjs.jpaz2.*;

import java.awt.*;

public class Spustac {
    public static void main(String[] args) {
        WinPane plocha = new WinPane(1600, 900);
        ObjectInspector oi = new ObjectInspector();
        oi.inspect(plocha);

        //Turtle jozko = new Turtle();plocha.add(jozko);oi.inspect(jozko);//
        MojaKorytnacka mk = new MojaKorytnacka();
        plocha.add(mk);
        mk.slnko(300);
    }
}
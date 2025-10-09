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
        //mk.obdlznik(150);
        //mk.domcek(150,5);
//        for (int i= 0; i < 3; i++) {//
            //mk.domcek(150,5);//
        //}
    }
}
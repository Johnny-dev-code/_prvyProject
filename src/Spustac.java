import sk.upjs.jpaz2.*;

import java.awt.*;

public class Spustac {
    public static void main(String[] args) {
        WinPane plocha = new WinPane(1600, 900);
        ObjectInspector oi = new ObjectInspector();
        oi.inspect(plocha);


        Vedec albert = new Vedec();
        plocha.add(albert);
        System.out.println(albert.medzislovneSpojky("jaj aha lo", "WWWW"));
    }

}
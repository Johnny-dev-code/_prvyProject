import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class MojaKorytnacka extends Turtle {
    public void trojuholnik(double strana) {
        for (int i = 0; i <= 3; i++) {
            this.step(strana);
            this.turn(120);
        }
    }

    public void stvorec(double str) {
        for (int i = 0; i <= 4; i++) {
            this.step(str);
            this.turn(90);
        }
    }

    public void zahada(double strana) {
        this.trojuholnik(strana);
        this.turn(120);
        this.trojuholnik(strana);
        this.turn(120);
        this.trojuholnik(strana);
        this.turn(120);
    }

    public void domcek(double strana, int pocet) {
        for (int i = 0; i < pocet; i++) {
            this.stvorec(strana);
            this.turn(180);
            this.step(-strana);
            this.trojuholnik(strana);
            this.turn(150);
            this.step(strana);
            this.turn(90);
            this.step(-strana);
            this.turn(90);
        }
    }
    public void obdlznik(double strana) {
        for (int i = 0; i <=2; i++) {
            this.step(strana);
            this.turn(90);
            this.step(strana/2);
            this.turn(90);
        }
    }
     public void vlockaN(double luc, double n) {
         for (int i = 0; i <= n; i++) {
             this.step(luc/2);
             for (int j = 0; j < 6; j++) {
                 this.step(luc/10);
                 this.step(-luc/10);
                 this.turn(60);
             }
             this.step(-luc/2);
             this.turn(360/n);
         }
     }
     public void slnko(double polomer) {
        this.setFillColor(Color.yellow);
        this.setPenColor(Color.yellow);
        this.dot(polomer);
         for (int i = 0; i <= 36; i++) {
             this.step(2*polomer);
             this.step(-2*polomer);
             this.turn(10);
         }
     }

}

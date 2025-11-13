import sk.upjs.jpaz2.JPAZUtilities;
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
        for (int i = 0; i <= 2; i++) {
            this.step(strana);
            this.turn(90);
            this.step(strana / 2);
            this.turn(90);
        }
    }

    public void vlockaN(double luc, double n) {
        for (int i = 0; i <= n; i++) {
            this.step(luc / 2);
            for (int j = 0; j < 6; j++) {
                this.step(luc / 10);
                this.step(-luc / 10);
                this.turn(60);
            }
            this.step(-luc / 2);
            this.turn(360 / n);
        }
    }

    public void slnko(double polomer) {
        this.setFillColor(Color.yellow);
        this.setPenColor(Color.yellow);
        this.dot(polomer);
        for (int i = 0; i <= 36; i++) {
            this.step(2 * polomer);
            this.step(-2 * polomer);
            this.turn(10);
        }
    }

    public void sipka(double n) {
        this.openPolygon();
        this.penUp();
        this.turn(-90);
        this.step(n / 2);
        this.turn(120);
        this.step(n);
        this.turn(120);
        this.step(n);
        this.turn(120);
        this.step(n / 2);
        this.turn(90);
        this.closePolygon();
        this.penDown();
    }

    public void navigacnaSipka(double dlzkaStrany) {
        for (int i = 0; i < 5; i++) {
            this.sipka(dlzkaStrany);
            this.penUp();
            this.step(50);
            this.penDown();
        }
    }
    public void rovnoramenny(double strana, double uhol)
    {
        double startX = this.getX();
        double stratY = this.getY();
        double natocenie = this.getDirection();
        this.turn(-uhol/2);
        this.step(strana);
        //JPAZUtilities.delay(500);
        var surXa = this.getX();
        var surYa = this.getY();
        this.step(-strana);
        //JPAZUtilities.delay(500);

        this.turn(uhol);
        this.step(strana);
        //JPAZUtilities.delay(500);
        this.moveTo(surXa, surYa);

        this.setPosition(startX, stratY);
        this.setDirection(natocenie);
    }
    public void stvorcSpirala(int pocetStran){
        for (int i = 0; i < pocetStran; i++) {
            this.step(300-(i*2));
            this.turn(90);
        }
    }
    public void idk(int n){
        double strana = n;
        while (strana>5){
            this.step(strana);
            this.turn(90);
             strana = strana * 0.95;
            JPAZUtilities.delay(100);
        }
    }
    public void mlyn(int lopatky, double uhol, double strana){
        for (int i = 0; i < lopatky; i++) {
            rovnoramenny(strana, uhol);
            this.turn(360/lopatky);
        }
    }
    public void ostraPochodzka(int p) {
        double startx = this.getX();
        double starty = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < p; i++) {
            int uhol=90*(int)(Math.random()*4);
            this.turn(uhol);
            if (this.getX() > startx) {
                this.setPenColor(Color.red);
            }
            else {
                this.setPenColor(Color.green);
            }
            this.step(5);
            if (this.distanceTo(startx, starty) > 500) {
                this.step(-5);
            }
            JPAZUtilities.delay(10);
        }
        this.setPosition(startx, starty);
        this.setDirection(natocenie);
    }
    public void pochadzkaTroj(int p, double r) {
        double startx = this.getX();
        double starty = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < p; i++) {
            if(this.distanceTo(startx, starty) < r/3) {
                this.penUp();
            }
            else {
                this.penDown();
                if (this.distanceTo(startx, starty) < 2*r/3) {
                    this.setPenColor(Color.red);
                }
                else {
                    setPenColor(Color.black);
                }
            }
            this.turn(Math.random()*360);
            this.step(5);
            if (this.distanceTo(startx, starty) > r) {
                this.step(-5);
            }
            JPAZUtilities.delay(2);
        }
        this.setPosition(startx, starty);
        this.setDirection(natocenie);
    }

    public void plny_Diamant (double strana) {
        //this.openPolygon();
        //this.setFillColor(Color.green);
        this.setPenColor(Color.green);
        this.turn(-23);
        this.step(strana);
        this.turn(180-135);
        this.step(strana);

        this.turn(180-45);
        this.step(strana);
        this.turn(80);
        this.step(strana);
        //this.closePolygon();
    }
    public void plna_hviezdica(double strana) {
        for (int i = 0; i < 4; i++) {
            plny_Diamant (strana);
            this.turn(62);
        }
    }
    public void koralky (int poc, double polomer) {
        this.turn(90);
        for (int i = 0; i < poc; i++) {
            if (i % 3== 0) {
                this.setFillColor(Color.red);
            }
            if (i % 3== 1) {
                this.setFillColor(Color.green);
            }
            if (i % 3== 2) {
                this.setFillColor(Color.blue);
            }

            this.penUp();
            this.dot(polomer);
            this.step(2*polomer);
        }
        this.penDown();
    }
    public void alkohol (int n) {
        double x0 = this.getX();
        double y0 = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < n; i++) {
            this.setDirection(Math.random()*360);
            if (this.getX() < x0) {
                this.setPenColor(Color.green);
            }
            else {
                setPenColor(Color.red);
            }
            this.step(99);
            if (this.distanceTo(x0, y0) > 100) {
                this.step(-99);
            }
            JPAZUtilities.delay(1);
        }
        this.setPosition(x0, y0);
        this.setDirection(natocenie);
    }
    public void pochodzka_stvorec(int pocet, double strana) {
        double x0 = this.getX();
        double y0 = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < pocet; i++) {
            this.turn(Math.random()*360);
            this.step(5);
            //if ((this.getX()) >= x0 + strana/2
            //    || (this.getY()) >= y0 + strana/2
            //        || this.getY() <= y0 - strana/2
              //      || this.getX() <= x0 - strana/2

            //){
            //    this.step(-5);
            //}
            if (Math.abs(this.getX()) > x0 + strana/2
            || Math.abs(this.getY()) > y0 + strana/2) {
                this.step(-5);
            }
        }
    }
    public  void moderneUmenie(int poc, double sirka, double vyska) {
        double x0 = this.getX();
        double y0 = this.getY();
        double natocenie = this.getDirection();
        this.turn(90);
        for (int i = 0; i < 2; i++) {
            this.step(sirka);
            this.turn(90);
            this.step(vyska);
            this.turn(90);
        }
        double r = 0;
        for (int i = 0; i < poc; i++) {
            r = (Math.random()*5)+2;
            double xt = (x0+r)+Math.random()*(sirka-2*r);
            double yt = (y0+r)+Math.random()*(vyska-2*r);
            if(Math.random()>=0.5) {
                setFillColor(Color.RED);
            }
            else {
                setFillColor(Color.blue);
            }
            this.setPosition(xt, yt);
            this.dot(r);
        }
    }
    public void Jemen(double poc, double sirka, double vyska) {
        double x0 = this.getX();
        double y0 = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < poc; i++) {
            if (this.getY() > y0 - vyska/6
            || this.getY() < y0 + vyska/6) {
                this.setPenColor(Color.white);
            }
            if (this.getY() > y0 + vyska/6) {
                this.setPenColor(Color.black);
            }
            if (this.getY() < y0 - vyska/6) {
                this.setPenColor(Color.red);
            }
            if (this.getX() > x0 + sirka/2
            || this.getX() < x0 - sirka/2
            || this.getY() > y0 + vyska/2
            || this.getY() < y0 - vyska/2) {
                this.step(-2);
            }
            this.turn(Math.random()*360);
            this.step(2);
        }
    }
}

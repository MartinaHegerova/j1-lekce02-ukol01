package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {


    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        zofka.setLocation(200,100);
        nakresliSlunicko(zofka);

        zofka.setLocation(400,100);
        nakresliOktagon (zofka);

        zofka.setLocation (600,100);
        nakresliKolecko(zofka);

        zofka.setLocation(100,300);
        zofka.turnLeft(180);
        nakresliDomecek(zofka);


        zofka.setLocation(250,300);
        zofka.turnRight(30);
        nakresliDomecek(zofka);

        zofka.setLocation(400,300);
        zofka.turnRight(30);
        nakresliDomecek(zofka);

        zofka.setLocation(550,300);
        zofka.turnRight(30);
        nakresliDomecek(zofka);

        zofka.setLocation(700,300);
        zofka.turnRight(30);
        nakresliDomecek(zofka);

        zofka.setLocation (100,500);
        zofka.turnRight(30);
        nakresliDomecek(zofka);

        zofka.setLocation (350,450);
        zofka.turnLeft(150)  ;
        nakresliPrasatko (zofka);

        zofka.setLocation (700,500);
        zofka.setPenColor(Color.BLUE) ;
        zofka.turnLeft(115);
        nakresliDomecek (zofka);

        zofka.setLocation (100,700);
        zofka.turnLeft(150);
        nakresliM (zofka);

        zofka.setLocation (170,700);
        zofka.turnLeft(150);
        nakresliA (zofka);

        zofka.setLocation (270, 700);
        zofka.turnRight(30);
        nakresliR (zofka);

        zofka.setLocation(320,640);
        zofka.turnLeft(50);
        nakresliT(zofka);

        zofka.setLocation(400,700);
        zofka.turnLeft(90);
        nakresliI(zofka);

        zofka.setLocation(445,700);
        nakresliN(zofka);

        zofka.setLocation(510,700);
        zofka.turnRight(30);
        nakresliA(zofka);





    }

    private void nakresliDomecek(Turtle zofka) {

        for (int i = 0; i < 3; i++) {
            zofka.move(100);
            zofka.turnLeft(90);}

        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);


    }
    private void nakresliPrasatko (Turtle zofka) {
        zofka.setPenColor(Color.RED);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.setPenColor(Color.CYAN);
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnRight(180)    ;
        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(60);
        zofka.setPenColor(Color.YELLOW);
        zofka.move(200);
        zofka.setPenColor(Color.BLUE);
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(30);
        zofka.setPenColor(Color.RED)  ;
        zofka.move(100);
        zofka.turnRight(120);
        zofka.setPenColor(Color.CYAN);
        zofka.move(20);
        for (int i=0; i<30; i++)
        {zofka.turnLeft(5);
            zofka.move(2); }
        for (int i=0; i<60; i++)
        {zofka.turnLeft(5);
            zofka.move(1); }
        zofka.turnLeft(15);
        zofka.move(20);
        for (int i=0; i<20; i++)
        {zofka.turnLeft(6);
            zofka.move(2); }
        for (int i=0; i<40; i++)
        {zofka.turnLeft(8);
            zofka.move(1); }
        zofka.move(20);

    }
    private void nakresliSlunicko (Turtle zofka) {
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);

        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);
        for (int i = 0; i < 6; i++) {
            zofka.turnLeft(5);
            zofka.move(5);
        }
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnRight(90);




    }
    private void nakresliM (Turtle zofka){

        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(25);
        zofka.turnLeft(60);
        zofka.move(25);
        zofka.turnRight(120);
        zofka.move(60);
    }
    private void nakresliA (Turtle zofka) {

        zofka.move(70);
        zofka.turnRight(120);
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(35);
        zofka.turnLeft(60);
        zofka.move(35);
        zofka.turnRight(180);
        zofka.move(35);
        zofka.turnLeft(120);
        zofka.move(35);
    }
    private void nakresliR (Turtle zofka){
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(5) ;
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(3);
        zofka.turnRight(10);
        zofka.move(5);
        zofka.turnRight(230);
        zofka.move(35);


    }
    private void nakresliT (Turtle zofka){

        zofka.move(20);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(20);

    }
    private void nakresliI (Turtle zofka) {

        zofka.move(60);
    }
    private void nakresliN (Turtle zofka){

        zofka.move(60);
        zofka.turnRight(150);
        zofka.move(70);
        zofka.turnLeft(150);
        zofka.move(60);

    }
    private void nakresliOktagon(Turtle zofka){
        for (int i=0; i<8; i++)
        {zofka.turnLeft(45);
            zofka.move(40); }

    }

    private void nakresliKolecko(Turtle zofka){
        for (int i=0; i<72; i++)
        {zofka.turnLeft(5);
            zofka.move(3);}

    }
}

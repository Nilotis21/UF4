package cat.mvm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Square sq = new Square(5, "Red");

        System.out.println("Introdueix el costat: ");
        sq.setSide(sc.nextFloat());

        System.out.println(sq.setArea() + "\t" + sq.setVolume() + "\n" + sq.getColor());





    }
}

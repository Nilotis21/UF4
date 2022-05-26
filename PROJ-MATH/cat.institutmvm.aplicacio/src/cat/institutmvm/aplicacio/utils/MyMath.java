package cat.institutmvm.aplicacio.utils;

import java.util.Random;
import java.util.Scanner;

public class MyMath {
    public static final double PI = 3.14159265;
    public static final double E = 2.71828;

    private static final Random RND = new Random();
    private static final Scanner sc = new Scanner(System.in);

    //Faig que el constructor sigui privat per asegurar que no es pot instanciar.
    private MyMath() {
    }

    //Mètode que retorna si un número és par.
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    //Mètode que retorna si un número és impar.
    public static int abs(int value) {
        return value < 0 ? -value : value;
    }

    //Mètode que retorna la mitjana d'una serie d'arguments.
    public static double avg(double... ops) {
        var sum = 0;
        for (var op : ops) {
            sum += op;
        }
        return sum / ops.length;
    }

    /**
     * Mètode que retorna el valor màxim d'una serie d'arguments.
     */
    public static int max(int... ops) {
        var value = Integer.MIN_VALUE;
        for (var op : ops) {
            if (value < op) {
                value = op;
            }
        }
        return value;
    }

    /**
     * Mètode que retorna el valor mínim d'una serie d'arguments.
     */
    public static int min(int... ops) {
        //Integer.MAX_VALUE;
        int value = max(ops);
        for (var op : ops) {
            if (value > op) {
                value = op;
            }
        }
        return value;
    }

    //Mètode que retorna el valor màxim d'una serie d'arguments.
    public static double maxim(double op1, double op2, double... ops) {
        var max = (op1 >= op2) ? op1 : op2;
        for (var op : ops) {
            max = (op >= max) ? op : max;
        }
        return max;
    }

    //Mètode que retorna el valor mínim d'una serie d'arguments.
    public static double minim(double op1, double op2, double... ops) {
        var min = (op1 <= op2) ? op1 : op2;
        for (var op : ops) {
            min = (op <= min) ? op : min;
        }
        return min;
    }

    //Mètode que retorna un númpero enter entre 0 i el valor de l'argument.
    public static int nextInt(int bound) {
        return RND.nextInt(bound + 1);
    }

    //Mètode que valida nombres enters.
    public static int valInt(String msg, Integer ini, Integer fin) {
        int number;
        if (fin == null) {
            do {
                System.out.println(msg);
                number = sc.nextInt();
            } while (number < ini);
        } else if (ini == null) {
            do {
                System.out.println(msg);
                number = sc.nextInt();
            } while (number > fin);
        } else if (ini != null && fin != null) {
            do {
                System.out.println(msg);
                number = sc.nextInt();
            } while (number < ini || number > fin);
        } else {
            System.out.println(msg);
            number = sc.nextInt();
        }
        return number;
    }

    //Mètode que ordena un array d'enters DES.
    public static int[] orderDes(int[] number) {
        int i, j, aux;
        for (i = 0; i < number.length; i++) {
            for (j = i + 1; j < number.length; j++) {
                if (number[j] > number[i]) {
                    aux = number[i];
                    number[i] = number[j];
                    number[j] = aux;
                }
            }
        }
        return number;
    }

    //Mètode que ordena un array d'enters ASC.
    public static int[] orderAsc(int[] number) {
        int i, j, aux;
        for (i = 0; i < number.length; i++) {
            for (j = i + 1; j < number.length; j++) {
                if (number[j] < number[i]) {
                    aux = number[i];
                    number[i] = number[j];
                    number[j] = aux;
                }
            }
        }
        return number;
    }

    //Mètode que cerca un valor en un array d'enters.
    public static boolean findInt(int[] number, int aux2) {
        int i;
        boolean trobat = false;
        for (i = 0; (i < number.length) && (!trobat); i++) {
            if (number[i] == aux2) {
                trobat = true;
            }
        }
        return trobat;
    }

    //Métode que printa un array.
    public static void showArray(int[] number) {
        int i;
        System.out.print("[");
        for (i = 0; i < number.length; i++) {
            if(i % 10 == 0 && i != 0){
                System.out.print("\n");
            }
            if (i != number.length - 1) {
                System.out.printf("%d, ", number[i]);
            } else {
                System.out.printf("%d", number[i]);
            }
        }
        System.out.println("]");
    }

    //Métode que retorna un array ompler de nombres naturals aleatoris d'un rang.
    public static int[] fillArray(int[] number, int rnd) {
        int i;
        for (i = 0; i < number.length; i++) {
            number[i] = nextInt(rnd);
        }
        return number;
    }
}


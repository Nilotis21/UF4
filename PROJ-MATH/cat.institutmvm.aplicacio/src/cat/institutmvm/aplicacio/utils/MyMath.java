package cat.institutmvm.aplicacio.utils;

import java.util.Random;

public class MyMath {
    public static final double PI = 3.14159265;
    public static final double E = 2.71828;

    private static final Random RND = new Random();

    private MyMath() {
    }

    ;

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

    //Mètode que retorna el valor màxim d'una serie d'arguments.
    public static int max(int... ops) {
        var value = Integer.MIN_VALUE;
        for (var op : ops) {
            if (value < op) {
                value = op;
            }
        }
        return value;
    }

    //Mètode que retorna el valor mínim d'una serie d'arguments.
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
}

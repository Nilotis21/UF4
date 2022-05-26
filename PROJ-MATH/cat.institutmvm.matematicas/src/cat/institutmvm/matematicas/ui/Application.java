package cat.institutmvm.matematicas.ui;

import cat.institutmvm.aplicacio.entities.Employee;
import cat.institutmvm.aplicacio.entities.EmployeeAgeComparator;

import java.time.LocalDate;
import java.util.*;

public class Application {
    public static void main(String[] args) {

        /*System.out.println("----------------Número PI i E----------------");
        System.out.println(MyMath.PI);
        System.out.println(MyMath.E);

        System.out.println("----------------Pares o inpares--------------");
        System.out.println(MyMath.isEven(3));
        System.out.println(MyMath.isOdd(3));

        System.out.println("----------------Valor absoluto---------------");
        System.out.println(MyMath.abs(-3));
        System.out.println(MyMath.abs(3));

        System.out.println("----------------Media------------------------");
        System.out.println(MyMath.avg(6, 8, 5, 3, 2, 4));

        System.out.println("----------------Max i Min--------------------");
        System.out.println(MyMath.max(4, 3, 1, 5, 6, 7, 3, 9, 22, -1));
        System.out.println(MyMath.min(4, 3, 1, 5, 6, 7, 3, 9, 22, -1));

        System.out.println("----------------Random-----------------------");
        System.out.println(MyMath.nextInt(20));

        var rnd = Colour.random();
        Colour cl = new Colour(Colour.NO_NAME, MyMath.nextInt(Colour.MAX_VALUE), MyMath.nextInt(Colour.MAX_VALUE), MyMath.nextInt(Colour.MAX_VALUE));
        Colour blk = new Colour(Colour.BLK_NAME, Colour.MIN_VALUE, Colour.MIN_VALUE, Colour.MIN_VALUE);
        Colour wht = new Colour();

        System.out.println("----------------Atributos del color----------");
        System.out.println("rnd");
        System.out.println("Name: " + rnd.getName());
        System.out.println("R:" + rnd.getRed() + " | G:" + rnd.getGreen() + " | B:" + rnd.getBlue());
        System.out.println(rnd.toRGB());
        System.out.println(rnd.toRGB(false));

        System.out.println("\ncl");
        System.out.println("Name: " + cl.getName());
        System.out.println("R:" + cl.getRed() + " | G:" + cl.getGreen() + " | B:" + cl.getBlue());
        System.out.println(cl.toRGB());
        System.out.println(cl.toRGB(false));

        System.out.println("\nblk");
        System.out.println("Name: " + blk.getName());
        System.out.println("R:" + blk.getRed() + " | G:" + blk.getGreen() + " | B:" + blk.getBlue());
        System.out.println(blk.toRGB());
        System.out.println(blk.toRGB(false));

        System.out.println("\nwht");
        System.out.println("Name: " + wht.getName());
        System.out.println("R:" + wht.getRed() + " | G:" + wht.getGreen() + " | B:" + wht.getBlue());
        System.out.println(wht.toRGB());
        System.out.println(wht.toRGB(false));

        SalesEmployee em = new SalesEmployee("1", "Nil", "Carmona", Employee.DEFAULT_SALARY, Employee.DEFAULT_PAYMENTS, LocalDate.of(2003,1,21), LocalDate.now(), SalesEmployee.DEFAULT_COMISSION );

        System.out.println(em);

        System.out.println("----------------Validació d'enters-----------");
        System.out.println(MyMath.valInt("Introdueix un nombre enter entre 0 i 100:",0, 100));

        int[] intArray = new int[]{ 5,13,4,65,1,7,9,9,0 };
        System.out.println("----------------Print Array------------------");
        MyMath.showArray(intArray);

        System.out.println("----------------Ordenació d'arrays-----------");
        System.out.println(Arrays.toString(MyMath.orderAsc(intArray)));
        System.out.println(Arrays.toString(MyMath.orderDes(intArray)));

        System.out.println("----------------Cerca de valors--------------");
        System.out.println("Es troba el valor: " + MyMath.findInt(intArray,4));

        int size = MyMath.valInt("Quants valors vols: ",1, 100);
        int[] rndArray = new int[size];
        int aux = MyMath.valInt("Quin valor vols cercar: ",0,null);

        System.out.println("----------------Random Array-----------------");
        System.out.println(Arrays.toString(MyMath.fillArray(rndArray,10)) + "\n");

        System.out.println("----------------Random Format Array----------");
        MyMath.showArray(rndArray);
        System.out.println();

        System.out.println("----------------Order ASC--------------------");
        System.out.println(Arrays.toString(MyMath.orderAsc(rndArray)) + "\n");

        System.out.println("----------------Order DES--------------------");
        System.out.println(Arrays.toString(MyMath.orderDes(rndArray)) + "\n");

        System.out.println("----------------Valor trobat-----------------");
        System.out.println("El valor hi és --> " + MyMath.findInt(rndArray, aux));
        var frm = new MyFrame();*/

        //String[] empleats = new String[] {"Jona", "Pere", "Raimon", "Jose", "David"};
        //System.out.println(Arrays.toString(empleats));

        List<Employee> aempleats = new ArrayList<>();
        aempleats.add(new Employee("1", "Nil", "Carmona", Employee.DEFAULT_SALARY, Employee.DEFAULT_PAYMENTS, LocalDate.of(2003,1,21), LocalDate.now()));
        aempleats.add(new Employee("2", "Kilian", "Carmona", Employee.DEFAULT_SALARY, Employee.DEFAULT_PAYMENTS, LocalDate.of(1998,7,31), LocalDate.now()));
        aempleats.add(new Employee("3", "Luis", "Carmona", Employee.DEFAULT_SALARY, Employee.DEFAULT_PAYMENTS, LocalDate.of(1967,11,4), LocalDate.now()));
        aempleats.add(new Employee("4", "Juani", "Quesada", Employee.DEFAULT_SALARY, Employee.DEFAULT_PAYMENTS, LocalDate.of(1966,9,5), LocalDate.now()));

        //System.out.println(Arrays.toString(aempleats));

        Collections.sort(aempleats, (e1, e2) -> Double.compare(e1.getMonthySalary(), e2.getMonthySalary()));

        Collections.sort(aempleats, new EmployeeAgeComparator());
        System.out.println(aempleats.toString());
    }
}
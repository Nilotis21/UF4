package cat.institutmvm.matematicas.ui;

import cat.institutmvm.aplicacio.entities.Colour;
import cat.institutmvm.aplicacio.utils.MyMath;
import cat.institutmvm.aplicacio.entities.Employee;
import java.time.LocalDate;


public class Application {
    public static void main(String[] args) {

        System.out.println("----------------Número PI i E----------------");
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

        Employee em = new Employee("1", "Nil", "Carmona", Employee.DEFAULT_SALARY, Employee.DEFAULT_PAYMENTS, LocalDate.of(2003,1,21), LocalDate.now());
        Employee em1 = new Employee("2", "Cesar", "Bravo");

        System.out.println("----------------Atributos Employee-----------");
        System.out.println("Code: " + em.getCode());
        System.out.println("First Name: " + em.getFirstName());
        System.out.println("Last Name: " + em.getLastName());
        System.out.println("Monthy Salary: " + em.getMonthySalary());
        System.out.println("Payments: " + em.getPayments());
        System.out.println("Annual Salary: " + em.annualSalary());
        System.out.println("Birth Date: " + em.getBirthDate());
        System.out.println("Hire Date: " + em.getHireDate());
        System.out.println("Counter: " + Employee.getCounter());

        System.out.println("----------------Atributos Employee1----------");
        System.out.println("Code: " + em1.getCode());
        System.out.println("First Name: " + em1.getFirstName());
        System.out.println("Last Name: " + em1.getLastName());
        System.out.println("Monthy Salary: " + em1.getMonthySalary());
        System.out.println("Payments: " + em1.getPayments());
        System.out.println("Annual Salary: " + em1.annualSalary());
        System.out.println("Birth Date: " + em1.getBirthDate());
        System.out.println("Hire Date: " + em1.getHireDate());

    }
}
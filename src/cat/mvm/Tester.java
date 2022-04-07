package cat.mvm;

import java.util.Scanner;

public class Tester {

    // Literals declarats com constants.
    private static final String MSG_NAME = "Introdueix el nom de la persona:";
    private static final String MSG_SURNAME = "Introdueix el cognom de la persona:";
    private static final String MSG_DNI = "Introdueix el DNI de la persona:";
    private static final String MSG_HEIGHT = "Introdueix l'alçada de la persona:";
    private static final String MSG_WIDTH = "Introdueix el pes de la persona:";


    public static void main(String[] args){

        //Instrucción para instanciar el Scanner.
        Scanner sc = new Scanner(System.in);

        //Los set asignan el parametro al atributo i los get consultan el contenido del atributo.

        //Class Table
        /*Table table_one = new Table();

        table_one.setMaterial("Madera");
        table_one.setColor("Marron");
        table_one.setShape("Rectangular");
        table_one.setHeight(70f);
        table_one.setWidth(80f);
        table_one.setLeg(4);

        System.out.println("\nMaterial: " + table_one.getMaterial());
        System.out.println("Color: " + table_one.getColor());
        System.out.println("Forma: " + table_one.getShape());
        System.out.println("Altura: " + table_one.getHeight());
        System.out.println("Profundidad: " + table_one.getWidth());
        System.out.println("Patas: " + table_one.getLeg());*/

        //------------------------------------------------------------------------

        // Class Car
        /*Car car_one = new Car();

        car_one.setBrand("Honda");
        car_one.setModel("Civic");
        car_one.setPower(110);

        System.out.println("\nMarca: " + car_one.getBrand());
        System.out.println("Modelo: " + car_one.getModel());
        System.out.println("Potencia: " + car_one.getPower() + " CV");*/

        //------------------------------------------------------------------------
        //Printo missatge e introdueixo dades per teclat.
        // Class Person
        Person p = new Person();

        System.out.println(MSG_NAME);
        p.setName(sc.next());

        System.out.println(MSG_SURNAME);
        p.setUsername(sc.next());

        System.out.println(MSG_DNI);
        p.setDni(sc.next());

        System.out.println(MSG_HEIGHT);
        p.setHeigth(sc.nextFloat());

        System.out.println(MSG_WIDTH);
        p.setWidth(sc.nextFloat());

        System.out.println("Nombre: " + p.getName() + "");
        System.out.println("Apellido: " + p.getUsername() + "");
        System.out.println("DNI: " + p.getDni() + "");
        System.out.println("Altura: " + p.getHeight() + " m");
        System.out.println("Peso: " + p.getWidth() + " Kg");
    }
}

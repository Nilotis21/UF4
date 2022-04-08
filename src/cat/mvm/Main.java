package cat.mvm;

import java.util.Scanner;

public class Main {

    private static final String MSG_NAME = "Introdueix el nom de la persona:";
    private static final String MSG_SURNAME = "Introdueix el cognom de la persona:";
    private static final String MSG_DNI = "Introdueix el DNI de la persona:";
    private static final String MSG_HEIGHT = "Introdueix l'alçada de la persona:";
    private static final String MSG_WEIGHT = "Introdueix el pes de la persona:";
    private static final String MSG_YEARS = "Introdueix els anys d'experiència:";
    private static final String MSG_COURSE = "Introdueix el curs:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Profesor p = new Profesor();
        Student st = new Student();

        //DADES DEL PROFESSOR
        System.out.println(MSG_NAME);
        p.setName(sc.next());
        System.out.println(MSG_SURNAME);
        p.setUsername(sc.next());
        System.out.println(MSG_DNI);
        p.setDni(sc.next());
        System.out.println(MSG_HEIGHT);
        p.setHeigth(sc.nextFloat());
        System.out.println(MSG_WEIGHT);
        p.setWeight(sc.nextFloat());
        System.out.println(MSG_YEARS);
        p.setYears(sc.nextInt());

        //DADES DE L'ALUMNE
        System.out.println(MSG_NAME);
        st.setName(sc.next());
        System.out.println(MSG_SURNAME);
        st.setUsername(sc.next());
        System.out.println(MSG_DNI);
        st.setDni(sc.next());
        System.out.println(MSG_HEIGHT);
        st.setHeigth(sc.nextFloat());
        System.out.println(MSG_WEIGHT);
        st.setWeight(sc.nextFloat());
        System.out.println(MSG_COURSE);
        st.setCourse(sc.next());

        System.out.println("---------------------PROFESSOR----------------------");
        System.out.println("Nombre: " + p.getName() + "");
        System.out.println("Apellido: " + p.getUsername() + "");
        System.out.println("DNI: " + p.getDni() + "");
        System.out.println("Altura: " + p.getHeight() + " m");
        System.out.println("Peso: " + p.getWeight() + " Kg");
        System.out.println("Anys d'experiència: " + p.getYears());
        System.out.println("---------------------ALUMNE------------------------");
        System.out.println("Nombre: " + st.getName() + "");
        System.out.println("Apellido: " + st.getUsername() + "");
        System.out.println("DNI: " + st.getDni() + "");
        System.out.println("Altura: " + st.getHeight() + " m");
        System.out.println("Peso: " + st.getWeight() + " Kg");
        System.out.println("Curs: " + st.getCourse());
    }
}

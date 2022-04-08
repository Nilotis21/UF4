package cat.mvm;

public abstract class Person {

    private String name, surname, dni;
    private int age;
    private float height;

    public Person(String name, String surname, String dni, int age, float height){
        this.setName(name);
        this.setUsername(surname);
        this.setDni(dni);
        this.setAge(age);
        this.setHeigth(height);
    }

    public String getName() {return this.name;}
    public void setName(String name) { this.name = name; }

    public String getUsername() {return this.surname;}
    public void setUsername(String surname) { this.surname = surname; }

    public String getDni() {return this.dni;}
    public void setDni(String dni) { this.dni = dni; }

    public int getAge() {return this.age;}
    public void setAge(int age) { this.age = age; }

    public float getHeight() { return this.height; }
    public void setHeigth(float heigth) { this.height = heigth; }


    //public void setAge(int age) { this.age = age; }
}

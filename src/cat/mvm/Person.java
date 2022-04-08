package cat.mvm;

public abstract class Person {

    private String name, surname, dni;
    private int age;
    private float height, weight;

    public String getName() {return this.name;}
    public void setName(String name) { this.name = name; }

    public String getUsername() {return this.surname;}
    public void setUsername(String surname) { this.surname = surname; }

    public String getDni() {return this.dni;}
    public void setDni(String dni) { this.dni = dni; }

    public float getHeight() { return this.height; }
    public void setHeigth(float heigth) { this.height = heigth; }

    public float getWeight() { return this.weight; }
    public void setWeight(float weight) { this.weight = weight; }

    //public void setAge(int age) { this.age = age; }
}

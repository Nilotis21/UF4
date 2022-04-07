package cat.mvm;

public class Person {

    private String name, username, dni;
    private float height, width;

    public String getName() {return this.name;}
    public void setName(String name) { this.name = name; }

    public String getUsername() {return this.username;}
    public void setUsername(String username) { this.username = username; }

    public String getDni() {return this.dni;}
    public void setDni(String dni) { this.dni = dni; }

    public float getHeight() { return this.height; }
    public void setHeigth(float heigth) { this.height = heigth; }

    public float getWidth() { return this.width; }
    public void setWidth(float width) { this.width = width; }
}

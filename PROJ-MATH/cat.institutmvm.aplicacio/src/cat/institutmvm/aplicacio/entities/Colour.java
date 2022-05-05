package cat.institutmvm.aplicacio.entities;

import cat.institutmvm.aplicacio.utils.MyMath;

public class Colour {
    private String name;
    private int red;
    private int green;
    private int blue;
    private static int counter = 0;
    public static final String NO_NAME = "Undefined";
    public static final String WHT_NAME = "Blanc";
    public static final String BLK_NAME = "Negre";

    public static final int MAX_VALUE = 255;
    public static final int MIN_VALUE = 0;

    public Colour(String name, int red, int green, int blue) {
        this.setName(name);
        this.setBlue(blue);
        this.setGreen(green);
        this.setRed(red);
        counter++;
    }

    public Colour(int red, int green, int blue) {
        this(NO_NAME, red, green, blue);
    }

    //Mètode que instancia el color blanc #FFFFFF.
    public Colour() {
        this(WHT_NAME, MAX_VALUE, MAX_VALUE, MAX_VALUE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    //Mètode que retorna la instancia d'un objecte Colour amb els paràmetres de color maximitzats.
    public static Colour random() {
        return new Colour(MyMath.nextInt(MAX_VALUE),
                MyMath.nextInt(MAX_VALUE),
                MyMath.nextInt(MAX_VALUE));
    }

    //Mètode que retorna el valor RGB formatat.
    public String toRGB(boolean upperCase) {
        return String.format("%s(%d,%d,%d)", upperCase ? "RGB" : "rgb", this.getRed(), this.getGreen(), this.getBlue());
    }

    //Mètode que retorna el valor RGB formatat, però si li arriba un false formatega en upperCase.
    public String toRGB() {
        return toRGB(true);
    }
}

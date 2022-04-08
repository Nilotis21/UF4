package cat.mvm;

public class Square extends Figures{

    private String color;

    //Constructor heredado de clase padre
    public Square(float side, String color){
        super(side);
        this.setColor(color);
    }

    public String getColor() {return this.color; }
    public void setColor(String color) { this.color = color; }
    public float setArea() {return this.getSide() *getSide(); }
    public float setVolume() {return this.getSide()*getSide()*getSide(); }

}
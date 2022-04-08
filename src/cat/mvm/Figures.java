package cat.mvm;

public class Figures {

    private float side;

    public Figures(float side) {
        this.setSide(this.side);
    }

    public int getSide() {return (int) this.side; }
    public void setSide(float side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Error");
        }
    }
}

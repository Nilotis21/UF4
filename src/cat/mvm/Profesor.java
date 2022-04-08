package cat.mvm;

public class Profesor extends Person {

    private int years;

    public Profesor(String name, String surname, String dni, int age, float height, int years) {
        super(name, surname, dni, age, height);
        this.setYears(years);
    }
        public int getYears() {return this.years;}
        public void setYears(int years){ this.years = years; }

}


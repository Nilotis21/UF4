package cat.institutmvm.aplicacio.entities;

import java.time.LocalDate;

public class SalesEmployee extends Employee{

    public static final int DEFAULT_COMISSION = 1_500;
    private double comission;
    private static int inst_counter;

    public SalesEmployee(String code, String firstName, String lastName, double monthySalary, int payments, LocalDate birthDate, LocalDate hireDate, double comission) {
        super(code, firstName, lastName, monthySalary, payments, birthDate, hireDate);
        this.setComission(comission);
        inst_counter++;
    }

    public SalesEmployee(String code, String firstName, String lastName, double comission) {
        super(code, firstName, lastName);
        this.setComission(comission);
        inst_counter++;
    }

    public double getComission() {return this.comission;}

    public void setComission(double comission) {this.comission = comission;}

    public static int getInst_counter() {return inst_counter;}

    public static void setInst_counter(int inst_counter) {SalesEmployee.inst_counter = inst_counter;}

    public double annualSalary() {return this.getMonthySalary() * this.getPayments() + this.getComission();}

    public String toString() {
        var sb = new StringBuilder(super.toString());
        sb.append(String.format(">Comission:         %.2f€ %n", this.getComission()));
        return sb.toString();
    }
}

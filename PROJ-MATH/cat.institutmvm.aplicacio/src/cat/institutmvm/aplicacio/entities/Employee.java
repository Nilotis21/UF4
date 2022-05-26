package cat.institutmvm.aplicacio.entities;

import java.time.LocalDate;
import java.time.Period;

public class Employee implements Comparable<Employee>{

    public static final int DEFAULT_PAYMENTS = 14;
    public static final double DEFAULT_SALARY = 1_800;
    private String code, firstName, lastName;
    private double monthySalary;
    private int payments;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private static int counter;

    public Employee(String code, String firstName, String lastName, double monthySalary, int payments, LocalDate birthDate, LocalDate hireDate){
        this.setCode(code);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMonthySalary(monthySalary);
        this.setPayments(payments);
        this.setBirthDate(birthDate);
        this.setHireDate(hireDate);
        counter++;
    }

    public Employee(String code, String firstName, String lastName){
        this.setCode(code);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMonthySalary(DEFAULT_SALARY);
        this.setPayments(DEFAULT_PAYMENTS);
        counter++;
    }

    public String getCode() {return this.code;}

    public void setCode(String code) {this.code = code;}

    public String getFirstName() {return this.firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return this.lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public double getMonthySalary() {return this.monthySalary;}

    public void setMonthySalary(double monthySalary) {this.monthySalary = monthySalary;}

    public int getPayments() {return this.payments;}

    public void setPayments(int payments) {this.payments = payments;}

    public LocalDate getBirthDate() {return this.birthDate;}

    public void setBirthDate(LocalDate birthDate) {this.birthDate = birthDate;}

    public LocalDate getHireDate() {return this.hireDate;}

    public void setHireDate(LocalDate hireDate) {this.hireDate = hireDate;}

    public static int getCounter() {return counter;}

    public static void setCounter(int counter) {Employee.counter = counter;}

    public double annualSalary() {return this.getMonthySalary() * this.getPayments();}

    public int getAge() {
        var period = Period.between(this.birthDate, LocalDate.now());
        return period.getYears();
    }

    public String getReverseName() {
        return this.lastName + ", " + this.firstName;
    }

    public String toString() {
        var sb = new StringBuilder();
        sb.append("\n--------------------------------------------------\n");
        sb.append("---------------------EMPLOYEE---------------------\n");
        sb.append("--------------------------------------------------\n");
        sb.append(String.format(">Code:              %s %n", this.getCode()));
        sb.append(String.format(">Reverse Name:      %s %n", this.getReverseName()));
        sb.append(String.format(">First Name:        %s %n", this.getFirstName()));
        sb.append(String.format(">Last Name:         %s %n", this.getLastName()));
        sb.append(String.format(">Monthy Salary:     %.2f %n", this.getMonthySalary()));
        sb.append(String.format(">Payments:          %s %n", this.getPayments()));
        sb.append(String.format(">Annual Salary      %.2f€ %n", this.annualSalary()));
        sb.append(String.format(">Birth Date:        %s %n", this.getBirthDate()));
        sb.append(String.format(">Hire Date:         %s %n", this.getHireDate()));
        sb.append(String.format(">Age:               %d years %n", this.getAge()));
        return sb.toString();
    }

    @Override
    public int compareTo(Employee o) {
        return this.getLastName().compareToIgnoreCase(o.getLastName());
    }
}

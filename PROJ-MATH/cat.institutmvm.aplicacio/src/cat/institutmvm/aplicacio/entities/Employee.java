package cat.institutmvm.aplicacio.entities;

import java.time.LocalDate;

public class Employee {

    //LocalDate birthDate // LocaleDate hireDate
    //Local.now() // fecha del sistema
    public static final int DEFAULT_PAYMENTS = 14;
    public static final double DEFAULT_SALARY = 1_500;
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

    public String getCode() {return code;}

    public void setCode(String code) {this.code = code;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public double getMonthySalary() {return monthySalary;}

    public void setMonthySalary(double monthySalary) {this.monthySalary = monthySalary;}

    public int getPayments() {return payments;}

    public void setPayments(int payments) {this.payments = payments;}

    public LocalDate getBirthDate() {return birthDate;}

    public void setBirthDate(LocalDate birthDate) {this.birthDate = birthDate;}

    public LocalDate getHireDate() {return hireDate;}

    public void setHireDate(LocalDate hireDate) {this.hireDate = hireDate;}

    public static int getCounter() {return counter;}

    public static void setCounter(int counter) {Employee.counter = counter;}

    public double annualSalary() {return monthySalary * payments;}

}

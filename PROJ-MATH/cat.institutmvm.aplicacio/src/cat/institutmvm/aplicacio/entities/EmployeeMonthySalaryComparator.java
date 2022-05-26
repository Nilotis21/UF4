package cat.institutmvm.aplicacio.entities;

import java.util.Comparator;

public class EmployeeMonthySalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getMonthySalary(), e2.getMonthySalary());
    }
}

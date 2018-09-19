package lt.baltictalents.homework.hw830.salary;

import lt.baltictalents.homework.hw830.generics.Employee;

public class Salary {
    private Employee  employee;
    private double salary;

    public Salary(Employee employee, double salary) {
        this.employee = employee;
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getSalary() {
        return salary;
    }
}

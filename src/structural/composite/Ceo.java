package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Ceo implements Employee {

    private final String name;
    private final int empId;
    private final Position position;

    private final List<Employee> reportingEmployees;

    public Ceo(int empId, String name, Position position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.reportingEmployees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public void printEmployeeDetails() {
        System.out.println(this);
    }

    public void addEmployee(Employee emp) {
        reportingEmployees.add(emp);
    }

    public void removeEmployee(Employee emp) {
        reportingEmployees.remove(emp);
    }


    @Override
    public String toString() {
        return "Ceo{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", position=" + position +
                ", reportingEmployees=" + reportingEmployees +
                '}';
    }
}

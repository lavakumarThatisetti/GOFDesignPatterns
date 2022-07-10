package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employeer implements Employee {

    private final String name;
    private final int empId;
    private final Position position;
    private final List<Employee> reportingEmployees;

    public Employeer(int empId, String name, Position position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        reportingEmployees = new ArrayList<>();
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
        System.out.println(toString());
    }

    public void addEmployee(Employee emp) {
        reportingEmployees.add(emp);
    }

    @Override
    public String toString() {
        return position.toString()+" {" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", position='" + position + '\'' +
                ", reportingEmployees=" + reportingEmployees +
                '}';
    }
}
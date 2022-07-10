package structural.composite;

public class Developer implements Employee{

    private final String name;
    private final int empId;
    private final Position position;

    public Developer(int empId, String name, Position position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
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

    @Override
    public String toString() {
        return "Developer {" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", position='" + position + '\'' +
                '}';
    }
}

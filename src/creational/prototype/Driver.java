package creational.prototype;

public class Driver {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Lava Kumar",24,10000000);

        System.out.println(employee1);
        System.out.println(employee1.hashCode());




        Employee employee2 = (Employee) employee1.clone();
        System.out.println(employee2);
        System.out.println(employee2.hashCode());
    }
}

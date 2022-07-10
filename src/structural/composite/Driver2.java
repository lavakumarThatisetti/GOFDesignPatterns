package structural.composite;

public class Driver2 {
    public static void main(String[] args) {
        Employeer dev1 = new Employeer(1, "Mark", Position.DEVELOPER);
        Employeer dev2 = new Employeer(2, "Elon", Position.SENIOR_DEVELOPER);

        Employeer man1 = new Employeer(200, "Sundar Pichai", Position.MANAGER);
        Employeer man2 = new Employeer(201, "Satya Nadal ", Position.MANAGER);

        Employeer p1 = new Employeer(10, "Bill Gates", Position.PRODUCT_OWNER);
        Employeer p2 = new Employeer(11, "Steve Jobs", Position.PRODUCT_OWNER);


        Employeer c = new Employeer(1, "Lava Kumar",Position.CEO);


        man1.addEmployee(dev1);
        man2.addEmployee(dev2);

        p1.addEmployee(man1);
        p2.addEmployee(man2);

        c.addEmployee(p1);
        c.addEmployee(p2);


        c.printEmployeeDetails();
    }
}

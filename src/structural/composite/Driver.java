package structural.composite;

/* Acts as Client */
public class Driver {
    public static void main(String[] args) {

        Developer dev1 = new Developer(1, "Mark", Position.DEVELOPER);
        Developer dev2 = new Developer(2, "Elon", Position.SENIOR_DEVELOPER);

        Manager man1 = new Manager(200, "Sundar Pichai", Position.MANAGER);
        Manager man2 = new Manager(201, "Satya Nadal ", Position.MANAGER);

        ProductOwner p1 = new ProductOwner(10, "Bill Gates", Position.PRODUCT_OWNER);
        ProductOwner p2 = new ProductOwner(11, "Steve Jobs", Position.PRODUCT_OWNER);


        Ceo c = new Ceo(1, "Lava Kumar",Position.CEO);


        man1.addEmployee(dev1);
        man2.addEmployee(dev2);

        p1.addEmployee(man1);
        p2.addEmployee(man2);

        c.addEmployee(p1);
        c.addEmployee(p2);


        c.printEmployeeDetails();



    }
}

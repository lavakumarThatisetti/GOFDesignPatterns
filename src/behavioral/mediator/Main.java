package behavioral.mediator;

public class Main {
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();


        User user1 = new UserImpl(mediator, "Rama Rao");
        User user2 = new UserImpl(mediator, "Rajmouli");
        User user3 = new UserImpl(mediator, "Ram Charan");
        User user4 = new UserImpl(mediator, "Kerravani");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hey We won Golden Globe Award For Nattu Nattu");
        System.out.println();
        user2.send("Hurray Congrats Keeravani");
        System.out.println();
        user4.send("Thank you");
        System.out.println();
        user3.send("Fingers Crossed for Future Awards");
    }
}

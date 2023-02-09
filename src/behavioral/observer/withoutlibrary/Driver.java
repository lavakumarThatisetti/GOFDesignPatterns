package behavioral.observer.withoutlibrary;

public class Driver {
    public static void main(String[] args) {
        Subscriber subscriber1 = new NewsSubscriber();
        Subscriber subscriber2 = new SocialMediaSubscriber();

        Producer producer = new Producer();
        producer.addObserver(subscriber1);
        producer.addObserver(subscriber2);


        producer.setNews("India Declared No Tax For Engineers");
    }
}

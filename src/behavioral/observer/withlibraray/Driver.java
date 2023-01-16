package behavioral.observer.withlibraray;

public class Driver {
    public static void main(String[] args) {
        NewsSubscriber newsSubscriber =  new NewsSubscriber();

        Producer producer = new Producer();
        producer.addObserver(newsSubscriber);


        producer.setNews("India Declared No Tax For Engineers");
    }
}

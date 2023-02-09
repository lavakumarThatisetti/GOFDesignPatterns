package behavioral.observer.withlibraray;

import java.util.Observer;

public class Driver {
    public static void main(String[] args) {
        Observer newsSubscriber =  new NewsSubscriber();
        Observer socialMediaSubscriber = new SocialMediaSubscriber();

        Producer producer = new Producer();
        producer.addObserver(newsSubscriber);
        producer.addObserver(socialMediaSubscriber);


        producer.setNews("India Declared No Tax For Engineers");
    }
}

package behavioral.observer.withoutlibrary;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String news;
    private List<Subscriber> channels = new ArrayList<>();

    public void addObserver(Subscriber subscriber) {
        this.channels.add(subscriber);
    }

    public void removeObserver(Subscriber subscriber) {
        this.channels.remove(subscriber);
    }

    public void setNews(String news) {
        this.news = news;
        for (Subscriber subscriber : this.channels) {
            subscriber.update(this.news);
        }
    }
}

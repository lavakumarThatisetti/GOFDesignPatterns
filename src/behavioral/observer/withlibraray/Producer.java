package behavioral.observer.withlibraray;

import java.util.Observable;

public class Producer extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}

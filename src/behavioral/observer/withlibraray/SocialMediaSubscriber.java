package behavioral.observer.withlibraray;



import java.util.Observable;
import java.util.Observer;

public class SocialMediaSubscriber implements Observer {
    private String news;

    public void display(){
        System.out.println("News "+news);
    }

    @Override
    public void update(Observable o, Object news) {
        this.news = ((String) news);
        display();
    }
}

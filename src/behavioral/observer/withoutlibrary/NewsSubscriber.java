package behavioral.observer.withoutlibrary;

public class NewsSubscriber implements Subscriber{
    private String news;
    @Override
    public void update(String news) {
        this.news = news;
        display();
    }

    public void display(){
        System.out.println("News "+news);
    }
}

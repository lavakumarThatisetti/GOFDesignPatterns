package behavioral.observer.withoutlibrary;

public class SocialMediaSubscriber implements Subscriber{
    private String news;
    @Override
    public void update(String news) {
        this.news = news;
        display();
    }

    public void display(){
        System.out.println("Social Media: "+news);
    }
}

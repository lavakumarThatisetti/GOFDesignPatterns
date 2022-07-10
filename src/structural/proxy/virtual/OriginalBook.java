package structural.proxy.virtual;

public class OriginalBook implements Book {
    private String name;
    private String author;
    private String description;
    private int rating;
    private boolean available;

    public OriginalBook(String name, String author, String description, int rating, boolean available) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.rating = rating;
        this.available = available;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void showInfo() {
        String info = toString();
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "OriginalBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", available=" + available +
                '}';
    }
}

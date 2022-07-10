package structural.proxy.virtual;

public class ProxyBook implements Book{

    Book book;

    public ProxyBook(Book book){
        this.book = book;
    }


    @Override
    public String getName() {
        return book.getName();
    }

    @Override
    public String getAuthor() {
        return book.getAuthor();
    }

    @Override
    public boolean isAvailable() {
        return book.isAvailable();
    }

    @Override
    public void showInfo() {
        System.out.println("ProxyBook Info{" +
                "name='" + book.getName() + '\'' +
                ", author='" + book.getAuthor() + '\'' +
                ", available=" + book.isAvailable() +
                '}');
    }
    /* It will call the Original Book and Display all the details */
    public void click(){
        book.showInfo();
    }

}

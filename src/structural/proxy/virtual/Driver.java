package structural.proxy.virtual;

/*
If an entire library of books, with all the details about each book, is loaded from a database, it will consume
a lot of RAM, and it is very likely that the user will need to issue or return only one book.
The solution, that uses the virtual proxy design pattern, displays only the name, author, and availability
of the books when a list of them is displayed. When a book is selected, all the remaining details will be fetched from the database and shown to the user.
 */
public class Driver {

    public static void main(String[] args) {
        Book harryPotterBook = new OriginalBook("Harry Potter","JK Rowling","description.. The Boy Who lived",
                5, true);

        Book proxyBook =  new ProxyBook(harryPotterBook);

        proxyBook.showInfo();

        ((ProxyBook)proxyBook).click();
    }

}

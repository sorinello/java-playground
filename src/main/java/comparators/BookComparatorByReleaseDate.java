package comparators;

import java.util.Comparator;

import model.Book;

public class BookComparatorByReleaseDate implements Comparator<Book> {

    public enum Order {
        ASC,
        DESC
    }

    Order order;

    public BookComparatorByReleaseDate() {
        this.order = Order.ASC;
    }

    public BookComparatorByReleaseDate(Order order) {
        this.order = order;
    }

    public int compare(Book book1, Book book2) {

        int result = book1.getReleaseDate().compareTo(book2.getReleaseDate());

        if (this.order == Order.ASC) {
            return result;
        }
        else {
            return result * -1;
        }
    }

    public void setSortDirection(Order order) {
        this.order = order;
    }

}

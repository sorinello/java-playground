package compare;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import comparators.BookComparatorByAuthor;
import comparators.BookComparatorByReleaseDate;
import comparators.BookComparatorByReleaseDate.Order;
import comparators.BookComparatoyByTitle;
import model.Author;
import model.Book;

public class AuthorCompare {

    public static final void main(String... args) {

        Calendar calendar = Calendar.getInstance();

        Author author1 = new Author("Skywalker", "Anakin");

        Author author2 = new Author("Skywalker", "Luke");

        Author author3 = new Author("Doe", "John");

        Author author4 = new Author("Doe", "Jane");

        Author author5 = new Author("Cartarescu", "Mircea");

        List<Author> authorList = new ArrayList<Author>();

        authorList.add(author1);
        authorList.add(author2);
        authorList.add(author3);
        authorList.add(author4);
        authorList.add(author5);

        Collections.sort(authorList);

        System.out.println(authorList);

        List<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book(author1, "Star Wars Episode VI", new Date(calendar.getTimeInMillis())));
        calendar.add(Calendar.YEAR, 1);

        bookList.add(new Book(author2, "Star Wars Episode I", new Date(calendar.getTimeInMillis())));
        calendar.add(Calendar.YEAR, 2);

        bookList.add(new Book(author3, "The Unknown", new Date(calendar.getTimeInMillis())));
        calendar.add(Calendar.YEAR, 3);

        bookList.add(new Book(author4, "The Unknown Female", new Date(calendar.getTimeInMillis())));
        calendar.add(Calendar.YEAR, 4);

        bookList.add(new Book(author5, "Made In Romania", new Date(calendar.getTimeInMillis())));
        calendar.add(Calendar.YEAR, 5);

        Collections.sort(bookList, new BookComparatorByAuthor());
        System.out.println(bookList);

        Collections.sort(bookList, new BookComparatoyByTitle());
        System.out.println(bookList);

        Collections.sort(bookList, new BookComparatorByReleaseDate());
        System.out.println(bookList);

        Collections.sort(bookList, new BookComparatorByReleaseDate(Order.DESC));
        System.out.println(bookList);

    }
}

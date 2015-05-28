package model;

import java.util.Date;



public class Book {
    private Author author;

    private String title;

    private Date releaseDate;

    public Book(Author author, String title, Date releaseDate) {
        this.author = author;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", releaseDate=" + releaseDate + "]";
    }

}

package Classes;

import java.util.Objects;

public class Book {
    private Author author;
    private String bookNick;
    private int year;

    public Book(Author author, String bookNick, int year) {
        this.author = author;
        this.bookNick = bookNick;
        this.year = year;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getBookNick() {
        return this.bookNick;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Author's " + author.toString() + " , year " + getYear() + " , Book named " + getBookNick();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(bookNick, book.bookNick);
    }

    public int hashCode() {
        return Objects.hash(author, bookNick, year);
    }
}
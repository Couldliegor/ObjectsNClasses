package Classes;

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

    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return (this == obj);
    }
    public int hashCode() {
        return java.util.Objects.hash(this.getAuthor(),  this.getBookNick(), this.getYear());
    }
}
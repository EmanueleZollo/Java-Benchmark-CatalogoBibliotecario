package Emanuele.entities;

public class Book extends PublicationElement {
    private String author;
    private String genre;

    public Book(long isbn, String title, int  publicationYear, int pagesNum, String author, String genre) {
        super(isbn, title, publicationYear, pagesNum);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book {" + super.toString() + "author='" + author +
                ", genre='" + genre + '\'' + '}';

    }
}

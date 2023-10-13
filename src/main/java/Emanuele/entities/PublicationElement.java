package Emanuele.entities;

public abstract class PublicationElement {
    private long isbn;
    private String title;
    private int publicationYear;
    private int pagesNum;

    public PublicationElement(long isbn, String title, int publicationYear, int pagesNum) {
        this.isbn = isbn;
        this.title = title;
        this.publicationYear = publicationYear;
        this.pagesNum = pagesNum;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", pagesNum=" + pagesNum +
                '}';
    }
}
package Emanuele.entities;

public class Magazine extends PublicationElement{

    private PublicationFrequency PublicationFrequency;

    public Magazine(long isbn, String title, int publicationYear, int pagesNum, Emanuele.entities.PublicationFrequency publicationFrequency) {
        super(isbn, title, publicationYear, pagesNum);
        PublicationFrequency = publicationFrequency;
    }

    public Emanuele.entities.PublicationFrequency getPublicationFrequency() {
        return PublicationFrequency;
    }

    public void setPublicationFrequency(Emanuele.entities.PublicationFrequency publicationFrequency) {
        PublicationFrequency = publicationFrequency;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "PublicationFrequency=" + PublicationFrequency +
                '}';
    }
}
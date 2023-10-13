package Emanuele.entities;

public class Magazine extends PublicationElement{

    private PublicationFrequency PublicationFrequency;

    public Magazine(long isbn, String title, int publicationYear, int pagesNum, String PublicationFrequency) {
        super(isbn, title, publicationYear, pagesNum);
        this.PublicationFrequency = getPublicationFrequency();
    }

    public Emanuele.entities.PublicationFrequency getPublicationFrequency() {
        return PublicationFrequency;
    }

    public void setPublicationFrequency(Emanuele.entities.PublicationFrequency publicationFrequency) {
        PublicationFrequency = publicationFrequency;
    }

    @Override
    public String toString() {
        return "Magazine {" + super.toString() + ", PublicationFrequency=" + '\'' + PublicationFrequency + '}';
    }
}
package weekEightJavaAndMySQL.challengeWeekEight.model;

public class Book {
    private StatusBook statusBook;
    private int id;
    private String title;
    private String author;
    private int publicationDate;

    public Book(){
    }

    public Book(String title, String author, int publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;

    }

    @Override
    public String toString() {
        return "Book: " +
                "\n Id: " + id +
                "\n Title: " + title +
                "\n Author: " + author +
                "\n PublicationDate: " + publicationDate +
                "\n Status Book: " + statusBook;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public StatusBook getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(StatusBook statusBook) {
        this.statusBook = statusBook;
    }
}

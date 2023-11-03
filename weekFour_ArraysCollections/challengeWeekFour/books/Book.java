package weekFour_ArraysCollections.challengeWeekFour.books;

public class Book {

    private String title;
    private String author;
    private String category;


    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public void displayDetails(String details){

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Title= " + title +
                ", Author= " + author +
                ", Category= " + category + "\n";
    }
}

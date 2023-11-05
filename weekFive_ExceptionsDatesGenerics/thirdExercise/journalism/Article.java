package weekFive_ExceptionsDatesGenerics.thirdExercise.journalism;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Article {

    private String title;

    private LocalDate publicationDate;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public Article(String title, String dateString) {
        this.title = title;
        this.publicationDate = LocalDate.parse(dateString, formatter);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title +
                ", Publication Date: " + publicationDate.format(formatter);

    }
}

package weekFive_ExceptionsDatesGenerics.thirdExercise.journalism;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Newspaper {

    private static final Set<Article> listArticle = new HashSet<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static void addArticle(Article article){
        System.out.println("Article added successfully: "+ article.getTitle());
        listArticle.add(article);
    }

    public static Set<Article> getListArticle(){
        System.out.println("---------------------------------");
        System.out.println("The added articles are:");
        return listArticle;
    }

    public static Set<Article> getArticlesInRange(String of, String to){
        Set<Article> articlesInRange = new HashSet<>();
        LocalDate dateOf = LocalDate.parse(of,formatter);
        LocalDate dateTo = LocalDate.parse(to,formatter);
        for (Article article : listArticle){
            LocalDate publicationDate = article.getPublicationDate();
            if (publicationDate != null && article.getPublicationDate().isAfter(dateOf) && publicationDate.isBefore(dateTo)){
                articlesInRange.add(article);
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("Articles from " +dateOf +" and to "+ dateTo);
        return articlesInRange;
    }
}

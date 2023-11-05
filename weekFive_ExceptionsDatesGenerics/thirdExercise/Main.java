package weekFive_ExceptionsDatesGenerics.thirdExercise;

import weekFive_ExceptionsDatesGenerics.thirdExercise.journalism.Article;
import weekFive_ExceptionsDatesGenerics.thirdExercise.journalism.Newspaper;

public class Main {
    public static void main(String[] args) {

        Article article1 = new Article("A Casa", "2023/12/03");
        Article article2 = new Article("A Rua", "2021/06/25");
        Article article3 = new Article("A Comida", "2020/03/25");
        Article article4 = new Article("A Mansão", "1990/05/19");
        Article article5 = new Article("O Patriminio", "1990/02/10");
        Article article6 = new Article("Cueca", "2015/02/12");
        Article article7 = new Article("Meia suja", "2021/09/12");
        Article article8 = new Article("Limpar a casa", "1963/09/18");

        Newspaper.addArticle(article1);
        Newspaper.addArticle(article2);
        Newspaper.addArticle(article3);
        Newspaper.addArticle(article4);
        Newspaper.addArticle(article5);
        Newspaper.addArticle(article6);

        Newspaper.addArticle(article7);
        Newspaper.addArticle(article8);

        System.out.println(Newspaper.getListArticle());
        System.out.println(Newspaper.getArticlesInRange("1990/01/01","2020/01/01"));


    }
}

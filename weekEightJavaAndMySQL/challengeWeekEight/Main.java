package weekEightJavaAndMySQL.challengeWeekEight;

import weekEightJavaAndMySQL.challengeWeekEight.model.BookMenu;
import weekEightJavaAndMySQL.challengeWeekEight.repository.BookRepository;

public class Main {
    public static void main(String[] args) {

        BookRepository bookRepo = new BookRepository();
        BookMenu bookMenu = new BookMenu(bookRepo);

        bookMenu.displayMenu();










    }
}

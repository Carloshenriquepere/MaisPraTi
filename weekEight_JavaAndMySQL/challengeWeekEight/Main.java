package weekEight_JavaAndMySQL.challengeWeekEight;

import weekEight_JavaAndMySQL.challengeWeekEight.model.BookMenu;
import weekEight_JavaAndMySQL.challengeWeekEight.repository.BookRepository;

public class Main {
    public static void main(String[] args) {

        BookRepository bookRepo = new BookRepository();
        BookMenu bookMenu = new BookMenu(bookRepo);

        bookMenu.displayMenu();










    }
}

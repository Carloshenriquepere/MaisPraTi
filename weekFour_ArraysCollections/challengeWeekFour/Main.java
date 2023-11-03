package weekFour_ArraysCollections.challengeWeekFour;

import weekFour_ArraysCollections.challengeWeekFour.books.Book;
import weekFour_ArraysCollections.challengeWeekFour.libraries.Library;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Carmarão","Eduardo","Popular");
        Book book1 = new Book("Peixe","Alice","Raro");
        Book book2 = new Book("Onça","Caroline","Raro");
        Book book3 = new Book("Urso Branco","Carlos","Popular");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book);

        System.out.println(library.bookList());
        System.out.println(library.listCategory());
        library.searchByCategory("raro");

        library.removeBooksByCategoryTitle("raro","Onça");

        System.out.println(library.bookList());
    }
}

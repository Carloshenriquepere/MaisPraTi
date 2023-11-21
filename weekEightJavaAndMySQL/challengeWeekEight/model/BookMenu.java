package weekEightJavaAndMySQL.challengeWeekEight.model;

import weekEightJavaAndMySQL.challengeWeekEight.repository.BookRepository;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private final BookRepository bookRepository;

    public BookMenu(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void displayMenu(){

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Options menu:");
            System.out.println("1 - Add a Book:");
            System.out.println("2 - Rent a book:");
            System.out.println("3 - Return a book:");
            System.out.println("4 - View rented books:");
            System.out.println("5 - See available books:");
            System.out.println("6 - Exit:");

            System.out.println("Enter the desired option:");
            int opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    System.out.print("Enter the title of the book:");
                    String title = sc.nextLine();
                    sc.nextLine();

                    System.out.print("Enter the author of the book:");
                    String author = sc.nextLine();
                    sc.nextLine();

                    System.out.print("Enter the year of publication of the book:");
                    int publicationDate = sc.nextInt();
                    sc.nextInt();

                    Book newBook = new Book(title,author,publicationDate);

                    bookRepository.addBooks(newBook);
                    break;

                case 2:
                    System.out.println("Enter the id of the desired book:");
                    int idRented = sc.nextInt();
                    bookRepository.rentBook(idRented);
                    break;

                case 3:
                    System.out.println("Enter the id of the desired book:");
                    int idAvailable = sc.nextInt();
                    bookRepository.returnBook(idAvailable);
                    break;

                case 4:
                    List<Book> allBookRented = bookRepository.seeBookRented();
                    allBookRented.forEach(System.out::println);
                    break;

                case 5:
                    List<Book> allBookAvailable = bookRepository.seeBookAvailable();
                    allBookAvailable.forEach(System.out::println);
                    break;

                case 6:

                    System.exit(6);
                    break;

                default:

                    System.out.println("Option invalid! Try again.");
            }
        }

    }

}

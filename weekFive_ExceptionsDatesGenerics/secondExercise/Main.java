package weekFive_ExceptionsDatesGenerics.secondExercise;

import weekFive_ExceptionsDatesGenerics.secondExercise.books.Book;
import weekFive_ExceptionsDatesGenerics.secondExercise.libraries.Library;
import weekFive_ExceptionsDatesGenerics.secondExercise.users.User;

public class Main {

    public static void main(String[] args) {


        Library library = new Library();
        User user = new User("Carlos");
        User user1 = new User("Eduardo");

        Book book1 = new Book("A Casa ");
        Book book2 = new Book("A Rua ");
        Book book3 = new Book("O Quarto ");
        Book book4 = new Book("A Varanda ");
        Book book5 = new Book("A Pscina ");
        Book book6 = new Book("O Porão");
        Book book7 = new Book("A Bicicleta ");
        Book book8 = new Book("A Arvore ");
        Book book9 = new Book("Minha vida");

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);
        library.addBooks(book5);
        library.addBooks(book6);
        library.addBooks(book7);

        library.lendBook(book1,user);
        library.lendBook(book4,user);
        library.lendBook(book7,user);
        library.lendBook(book3,user);
        library.lendBook(book2,user);
        library.lendBook(book6,user);

        library.lendBook(book6,user1);
        library.lendBook(book1,user1);

        System.out.println(user.getBooksRented(user));//Preciso implementar uma lógica que retorna o nome do usário que esta alugando e o valor!
        System.out.println(library.listCollectionBooks());
    }
}

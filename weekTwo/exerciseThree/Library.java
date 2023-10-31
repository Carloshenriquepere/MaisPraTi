package weekTwo.exerciseThree;

import weekTwo.exerciseThree.books.Book;

public class Library {
    public static void main(String[] args) {

        Book book = new Book("Dom Casmurro", "Machado de Assis", 1899);
        Book book1 = new Book("O Principe", "Maquiavel", 1532);
        Book book2 = new Book("Dom Casmurro", "Machado de Assis", 1899);

        System.out.println(book);

        System.out.println(book1);

        System.out.println(book2);

        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book.equals(book1));
        System.out.println(book.equals(book2));


    }
}

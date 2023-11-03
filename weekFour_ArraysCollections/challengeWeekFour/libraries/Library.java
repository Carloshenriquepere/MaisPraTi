package weekFour_ArraysCollections.challengeWeekFour.libraries;

import weekFour_ArraysCollections.challengeWeekFour.books.Book;

import java.util.*;

public class Library {

    List<Book> collection = new ArrayList<>();
    Set<String> category = new HashSet<>();

    public List<Book> bookList(){
        System.out.println("------------------------");
        System.out.println("Books on collection:");
        return collection;
    }

    public Set<String> listCategory(){
        System.out.println("--------------------------------------");
        System.out.println("List on category");
        return category;
    }

    public void addBook(Book book){
        this.collection.add(book);
        this.category.add(book.getCategory());
    }

    public void searchByCategory(String category){
        System.out.println("------------------------------------");
        System.out.println("Here all the books " +category+ " that you asked!");

        for (int i = 0; i < collection.size(); i++) {
             Book book = collection.get(i);
            if (book.getCategory().equalsIgnoreCase(category)){
                System.out.println(book);
            }
        }
    }

    public void removeBooksByCategoryTitle(String category, String title) {
        Iterator<Book> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getCategory().equalsIgnoreCase(category) && book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("The Book "+ book.getTitle() + " was successfully removed!");
            }
        }
    }
}

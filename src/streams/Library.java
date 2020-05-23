package streams;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books=populateLibrary();
        books.stream().filter(book-> book.getAuthor().startsWith("J")).filter(book -> book.getTitle().startsWith("12")).forEach(System.out::println);

    }

    static ArrayList<Book> populateLibrary()
    {
        ArrayList<Book> books =new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("J K Rowling", "Harry Potter"));
        books.add(new Book("Jordan Peterson", "12 Rules for Life"));
        books.add(new Book("Mario Puzo", "The Godfather"));
        books.add(new Book("Jocko Willink", "Extreme Ownership"));
        books.add(new Book("Sam Harris", "Waking Up"));
        return books;



    }
}

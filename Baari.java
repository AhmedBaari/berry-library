import java.util.Date;
import java.util.ArrayList;

abstract class LibraryItem {
    private int id;
    private String title;
    private boolean isAvailable;

    public LibraryItem(int id, String title, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

}

class LibraryException extends Exception {
    public LibraryException(String message) {
        super(message);
        System.out.println("LIBRARRYYYY IS IN TROUBLEE!!!");
    }
}

class ItemNotFoundException extends LibraryException {
    public ItemNotFoundException(String message) {
        super(message);
        System.out.println("ITEM NOT FOUND");
    }
}

class Book extends LibraryItem {
    private String author;
    private String ISBN;

    public Book(int id, String title, String author, String ISBN) {
        super(id, title, true);
        this.author = author;
        this.ISBN = ISBN;
    }
}

class Magazine extends LibraryItem {
    private Date issueDate;
    private String publisher;

    public Magazine(int id, String title, String author, String ISBN, Date issueDate) {
        super(id, title, true);
        this.issueDate = issueDate;
        this.publisher = author;
    }
}

class Library {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
        System.out.println("Library created successfully");
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    public void removeItem(int id) throws ItemNotFoundException {
        boolean found = false;
        for (LibraryItem item: items) {
            if (item.getId() == id) {
                items.remove(item);
                System.out.println("Item removed successfully");
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ItemNotFoundException("cant find it bro");
        }

    }

    public void removeItem(String title) throws ItemNotFoundException {
        boolean found = false;

        for (LibraryItem item: items) {
            if (item.getTitle().contains(title)) {
                items.remove(item);
                System.out.println("Item removed successfully");
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ItemNotFoundException("cant find it bro");
        }
    }

    public void displayAllItems() {
        for (LibraryItem item: items) {
            System.out.println(item.getId()+ " " + item.getTitle());
        }
    }


}


public class Baari {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");

        // Library
        Library library = new Library();

        // Books
        Book book1 = new Book(1,"Atomic Habits", "James CLear", "ABC123");
        Book book2 = new Book(2, "Deep Work", "Cal Newport", "CBS234");

        library.addItem(book1);
        library.addItem(book2);

        // Magazines
        Magazine magazine1 = new Magazine(4,"Laapa Times", "Aswini","XYZ123", new Date(2025,06,20));
        library.addItem(magazine1);
        library.displayAllItems();

        // Remove item
        String title = "Deep";
        library.removeItem(title);
        library.displayAllItems();

        // false remove
        int id = 10;
        library.removeItem(id);
    }
}

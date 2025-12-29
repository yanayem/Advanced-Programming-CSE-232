/*Lab Task 1
A university library wants to manage its collection of digital resources. Write a program to
store details of an eBook and provide functionality to update its availability status.
Task Instructions:
• Create an `EBook` class with fields `title`, `author`, and `isAvailable` (boolean).
• Add a `setEBook(String t, String a, boolean avail)` method to assign values.
• Add a `toggleAvailability()` method to switch between available and unavailable.
• Add a `displayEBook()` method to show details.
• In `main()`, create at least two eBook objects, change their availability, and display
updated info.*/
class EBook {
    String title, author;
    boolean isAvailable;

    void setEBook(String t, String a, boolean avail) {
        title = t;
        author = a;
        isAvailable = avail;
    }

    void toggleAvailability() {
        isAvailable = !isAvailable;
    }

    void displayEBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        System.out.println("-----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        EBook eb1 = new EBook();
        eb1.setEBook("Harry Potter", "J. K. Rowling", false);
        eb1.displayEBook();
        eb1.toggleAvailability();
        eb1.displayEBook();

        EBook eb2 = new EBook();
        eb2.setEBook("The Hobbit", "J. R. R. Tolkien", true);
        eb2.displayEBook();
        eb2.toggleAvailability();
        eb2.displayEBook();
    }
}
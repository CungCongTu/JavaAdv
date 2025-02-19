//package Bai2_2;
//
//public class TestMain {
//    public static void main(String[] args) {
//        // Construct an Author instance
//        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
//        System.out.println(ahTeck);  // Test Author's toString()
//
//        // Test setters and getters for Author
//        ahTeck.setEmail("paulTan@nowhere.com");
//        System.out.println("name is: " + ahTeck.getName());
//        System.out.println("email is: " + ahTeck.getEmail());
//        System.out.println("gender is: " + ahTeck.getGender());
//
//        // Construct a Book instance
//        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
//        System.out.println(dummyBook);  // Test Book's toString()
//
//        // Test Getters and Setters for Book
//        dummyBook.setPrice(29.95);
//        dummyBook.setQty(28);
//        System.out.println("name is: " + dummyBook.getName());
//        System.out.println("price is: " + dummyBook.getPrice());
//        System.out.println("qty is: " + dummyBook.getQty());
//        System.out.println("Author is: " + dummyBook.getAuthor());
//        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
//        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
//
//        // Use an anonymous instance of Author to construct a Book instance
//        Book anotherBook = new Book("more Java",
//                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
//        System.out.println(anotherBook);  // toString()
//    }
//}
//

package Bai2_2;

public class TestMain {
    public static void main(String[] args) {
        // Declare and initialize an array of authors
        Author[] authors = new Author[2]; // Khai bao so luong
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Test each author
        for (Author author : authors) {
            System.out.println(author);  // Test Author's toString()
        }

        // Test setters and getters for Author
        authors[0].setEmail("paulTan@nowhere.com");
        System.out.println("First author's name: " + authors[0].getName());
        System.out.println("First author's email: " + authors[0].getEmail());
        System.out.println("First author's gender: " + authors[0].getGender());

        // Create a Book instance with multiple authors
        Book dummyBook = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters for Book
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Book name: " + dummyBook.getName());
        System.out.println("Book price: " + dummyBook.getPrice());
        System.out.println("Book quantity: " + dummyBook.getQty());
        System.out.println("Book authors: " + dummyBook.getAuthorNames());

        // Create another book with a different set of authors
        Author[] otherAuthors = {
                new Author("John Doe", "john@somewhere.com", 'm'),
                new Author("Jane Doe", "jane@somewhere.com", 'f')
        };

        Book anotherBook = new Book("Advanced Java", otherAuthors, 39.95);
        System.out.println(anotherBook);  // toString()
    }
}

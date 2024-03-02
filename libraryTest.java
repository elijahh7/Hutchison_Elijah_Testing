import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class libraryTest {
    // Testing if the addBook method works
    @Test
    public void addBookTest() throws  Exception {
        // Create a new library instance
        library testLibrary = new library();

        // Add some sample books to the library
        testLibrary.addBook("1234567890", "Sample Book 1");

        // Assertion: Check that the book with title "Sample Book 1" has been removed
        String libraryContents = testLibrary.printLibraryContents();
        assertTrue(libraryContents.contains("Sample Book 1"), "Book with title 'Sample Book 1' should have been added to the library");
    }

    // Testing if the removeWIthBarcode method work
    @Test
    public void barcodeRemove() throws  Exception {
        // Create a new library instance
        library testLibrary = new library();

        // Add some sample books to the library
        testLibrary.addBook("1234567890", "Sample Book 1");
        testLibrary.addBook("0987654321", "Sample Book 2");

        // Invoke the method to be tested
        testLibrary.removeBookWithBarcode(1234567890);

        // Assertion: Check that the book with barcode number "1234567890 has been removed
        String libraryContents = testLibrary.printLibraryContents();
        System.out.println(testLibrary.printLibraryContents());
        assertFalse(libraryContents.contains("Sample Book 1"), "Book with title 1234567890 should have been removed");
    }

    // Testing if the removeWithTitle method works
    @Test
    public void titleRemove() throws  Exception {
        // Create a new library instance
        library testLibrary = new library();

        // Add some sample books to the library
        testLibrary.addBook("1234567890", "Sample Book 1");
        testLibrary.addBook("0987654321", "Sample Book 2");

        // Invoke the method to be tested
        testLibrary.removeBookWithTitle("Sample Book 1");

        // Assertion: Check that the book with title "Sample Book 1" has been removed
        String libraryContents = testLibrary.printLibraryContents();
        assertFalse(libraryContents.contains("Sample Book 1"), "Book with title 'Sample Book 1' should have been removed");

    }

    // Testing if the checkoutBook method works
    @Test
    public void checkoutTest() throws  Exception {
        // Create a new library instance
        library testLibrary = new library();

        // Add some sample books to the library
        testLibrary.addBook("1234567890", "Sample Book 1");
        testLibrary.addBook("0987654321", "Sample Book 2");

        // Invoke the method to be tested
        testLibrary.checkoutBook("Sample Book 1");

        // Assertion: Check that the book with title "Sample Book 1" has been removed
        String libraryContents = testLibrary.printLibraryContents();
        System.out.println(testLibrary.printLibraryContents());
        assertTrue(libraryContents.contains("Sample Book 1"), "Book with title 'Sample Book 1' should have been checked out of the library");

    }

    // Testing if the checkinBook method works
    @Test
    public void checkInTest() throws  Exception {
        // Create a new library instance
        library testLibrary = new library();

        // Add some sample books to the library
        testLibrary.addBook("1234567890", "Sample Book 1");
        testLibrary.addBook("0987654321", "Sample Book 2");

        // Checking sample book out first so to accurately rest check out method
        testLibrary.checkoutBook("Sample Book 1");
        System.out.println(testLibrary.printLibraryContents());

        // Invoke the method to be tested
        testLibrary.checkInBook("Sample Book 1");

        // Assertion: Check that the book with title "Sample Book 1" has been removed
        String libraryContents = testLibrary.printLibraryContents();
        System.out.println(testLibrary.printLibraryContents());
        assertTrue(libraryContents.contains("Sample Book 1"), "Book with title 'Sample Book 1' should have been checked in to the library");

    }
}
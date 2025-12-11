import java.awt.print.Book;

public class library {
    String libraryName;
    employee[] staff;
    book[] books;

    public library(String libraryName, employee[] staff, book[] books) {
        this.libraryName = libraryName;
        this.staff = staff;
        this.books = books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public employee[] getStaff() {
        return staff;
    }

    public book[] getBooks() {
        return books;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setStaff(employee[] staff) {
        this.staff = staff;
    }

    public void setBooks(book[] books) {
        this.books = books;
    }
}

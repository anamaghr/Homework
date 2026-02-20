import java.util.ArrayList;
import java.io.*;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void populateList() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("books.txt"));
            String line;

            while ((line = reader.readLine()) != null) {

                String name = line;
                int pages = Integer.parseInt(reader.readLine());
                Book book = new Book(name, pages);
                books.add(book);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("file does not exist");
            e.printStackTrace();
        }
    }
}

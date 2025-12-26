//package N1;
//
//import java.util.Objects;
//
//public class book {
//    String title;
//    int numberOfPages;
//    String genre;
//    writer writers;
//
//    public book(String title, int numberOfPages, String genre, writer writers) {
//        this.title = title;
//        this.numberOfPages = numberOfPages;
//        this.genre = genre;
//        this.writers = writers;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        book book = (book) o;
//        return numberOfPages == book.numberOfPages && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(writers, book.writers);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title, numberOfPages, genre, writers);
//    }
//
//    @Override
//    public String toString() {
//        return "title: " + title + ", pages: " + numberOfPages + " , genre: " + genre + ", writer: " + writers;
//    }
//
//}

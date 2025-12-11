public class book {
    String title;
    int pages;
    String author;
    boolean hardcover;

    public book(String title, int pages, String author, boolean hardcover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.hardcover = hardcover;
    }

    public book() {
    }

    public void read() {
        System.out.println("I am reading book " + title);
    }
}

public class fantasybooks extends book{
    String country;
    public fantasybooks(String title, int pages, String author, boolean hardcover, String country) {
        super(title, pages, author, hardcover);
        this.country = country;
    }
}

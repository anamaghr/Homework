public class sciencebooks extends book{
    String scienceField;
    public sciencebooks(String title, int pages, String author, boolean hardcover, String scienceField) {
        super(title, pages, author, hardcover);
        this.scienceField = scienceField;
    }
}

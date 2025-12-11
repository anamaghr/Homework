public class bookAdvisor extends employee{
    double recommendationRating;
    library library;
    public bookAdvisor(String firstName, String lastName, int id, double recommendationRating, library library) {
        super(firstName, lastName, id);
        this.recommendationRating = recommendationRating;
        this.library = library;
    }

    @Override
    public String toString() {
        return super.toString() + " | Advisor Rating: " + recommendationRating +
                " | Works at: " + library.getLibraryName();
    }
}

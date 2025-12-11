public class bookIssuer extends employee{
    int fromHour;
    int toHour;
    public bookIssuer(String firstName, String lastName, int id, int fromHour, int toHour) {
        super(firstName, lastName, id);
        this.fromHour = fromHour;
        this.toHour = toHour;
    }
}

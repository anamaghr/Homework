//package N1;
//
//public class Basketball {
//    private String firstName;
//    private String lastName;
//    private int shoots;
//    private int rebounds;
//    private int blocked;
//    private int passed;
//    private int lost;
//
//
//    public Basketball(String firstName, String lastName, int shoots, int rebounds, int blocked, int passed, int lost) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.shoots = shoots;
//        this.rebounds = rebounds;
//        this.blocked = blocked;
//        this.passed = passed;
//        this.lost = lost;
//    }
//
//    public double totalScore(){
//        return (shoots * 1) + (rebounds * 1) + (passed * 1.5) + (blocked * 2) - (lost * 2);
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getShoots() {
//        return shoots;
//    }
//
//    public int getRebounds() {
//        return rebounds;
//    }
//
//    public int getBlocked() {
//        return blocked;
//    }
//
//    public int getPassed() {
//        return passed;
//    }
//
//    public int getLost() {
//        return lost;
//    }
//    public double getRating(){
//        return totalScore();
//    }
//
//    @Override
//    public String toString() {
//        return "Basketball{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", shoots=" + shoots +
//                ", rebounds=" + rebounds +
//                ", blocked=" + blocked +
//                ", passed=" + passed +
//                ", lost=" + lost +
//                '}';
//    }
//}

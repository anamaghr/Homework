//package N1;
//
//import java.util.Objects;
//
//public class writer {
//    String firstName;
//    String lastName;
//
//    public writer(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
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
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        writer writer = (writer) o;
//        return Objects.equals(firstName, writer.firstName) && Objects.equals(lastName, writer.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
//
//    @Override
//    public String toString() {
//        return firstName + " " + lastName;
//    }
//}

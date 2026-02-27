//package N2;
//
//import java.util.ArrayList;
//import java.util.Date;
//
//public class Student {
//    private String firstName;
//    private String lastName;
//    private Date birthday;
//    private ArrayList<Double> grades;
//
//    public Student(String firstName, String lastName, Date birthday, ArrayList<Double> grades) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.birthday = birthday;
//        this.grades = grades;
//    }
//
//    public double gradeAverage(){
//        double sum = 0;
//        for(double grade : grades){
//            sum += grade;
//        }
//        return sum / grades.size();
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
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public ArrayList<Double> getGrades() {
//        return grades;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", birthday=" + birthday +
//                ", grades=" + grades +
//                '}';
//    }
//}

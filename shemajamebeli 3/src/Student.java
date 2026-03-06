//import java.util.HashSet;
//import java.util.List;
//import java.util.Objects;
//
//public class Student {
//    private int id;
//    private String firstName;
//    private String lastName;
//    private int age;
//    private double averageScore;
//    private List<String> subjectList;
//
//    public Student(int id, String firstName, String lastName, int age, double averageScore, List<String> subjectList) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.averageScore = averageScore;
//        this.subjectList = subjectList;
//    }
//
//
//    public int getId() {
//        return id;
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
//    public int getAge() {
//        return age;
//    }
//
//    public double getAverageScore() {
//        return averageScore;
//    }
//
//    public List<String> getSubjectList() {
//        return subjectList;
//    }
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstName, lastName, averageScore);
//    }
//    @Override
//    public boolean equals(Object o){
//        if(this == o){
//            return true;
//        }
//        if(o == null){
//            return false;
//        }
//        if(this.id != getId()){
//            return false;
//        }
//        return new HashSet<>(this.subjectList).equals(new HashSet<>(getSubjectList()));
//    }
//
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                ", averageScore=" + averageScore +
//                ", subjectList=" + subjectList +
//                '}';
//    }
//
//
//    public int compare(Student student){
//        return Double.compare(this.averageScore, getAverageScore());
//    }
//}

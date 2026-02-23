import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student implements Comparable<Student> {
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> subjects;
    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addPoints(String subject, ArrayList<Integer> points){
        subjects.put(subject, points);
    }
    public double averagePoint(){
        int totalSum = 0;
        int totalCount = 0;
        for (Map.Entry<String, ArrayList<Integer>> entry : subjects.entrySet()) {
            for (Integer point : entry.getValue()) {
                totalSum += point;
                totalCount++;
            }
        }
        if(totalCount == 0){
            return 0 ;
        }
        return (double) totalSum / totalCount;
    }

    public void printInfo(){
        System.out.println("student id: " + id);
        System.out.println("name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println("subjects and points: " + subjects );
        System.out.println("average grade: " + averagePoint());
    }

    @Override
    public int compareTo(Student s) {
        double thisAverage = this.averagePoint();
        double thatAverage = s.averagePoint();
        if(thisAverage > thatAverage){
            return 1;
        } else if (thisAverage < thatAverage) {
            return -1;
        }else{
            return 0;
        }
    }

    public String getLastName() {
        return lastName;
    }
}


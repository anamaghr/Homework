//package N2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class Main{
//   public static void main(String[] args) {
//       ArrayList<Student> students = new ArrayList<>();
//       students.add(new Student("fh", "hb", 10_10_2009,new ArrayList<>(Arrays.asList(23,34,100,80))));
//       students.add(new Student("fsfvh", "hbsd", 1_08_2007,new ArrayList<>(Arrays.asList(29,84,100,80))));
//       students.add(new Student("dshj", "sfjh", 7_06_2008,new ArrayList<>(Arrays.asList(23,34,100,80))));
//
//       System.out.println("unsorted: ");
//       for (Student student : students) {
//           System.out.println(student);
//       }
//
//       students.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));
//       System.out.println("sorted using name: ");
//       for (Student student : students) {
//           System.out.println(student);
//       }
//
//       students.sort(Comparator.comparingDouble(Student::gradeAverage).reversed());
//       System.out.println("sorted by grade average: ");
//       for (Student student : students) {
//           System.out.println(student);
//       }
//
//       students.sort(Comparator.comparing(Student::getBirthday));
//       System.out.println("sorted by birthday: ");
//       for (Student student : students) {
//           System.out.println(student);
//       }
//   }
//}

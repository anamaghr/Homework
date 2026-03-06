//import jdk.internal.math.DoubleToDecimal;
//import javax.sound.sampled.Line;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import static java.lang.System.in;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
        // N1 a
        // N2 a
        // N3 a c
        // N4 c
        // N5 a d
        // N6 d
        // N7 c
        // N8 b
        // N9 a
        // N10 b
        // N11 a
        // N12 c
        // N13 a c
        // N14 c d
        // N15 d

        // kodis weris savarjisho 1 - 2

//        String file = "studentsInfo.txt";
//        String outputFile = "output.txt";
//        ArrayList<Student> students = new ArrayList<>();
//
//        try(BufferedReader fileReader = new BufferedReader(new FileReader(file))){
//              String[] s = "";
//               int id = Integer.parseInt(s[0]);
//               String firstName = s[1];
//               String lastName = s[2];
//               int age = Integer.parseInt(s[3]);
//               double averageScore = Double.parseDouble(s[4]);
//            List<String > subjects = Arrays.asList(s);
//
//
//                Student student = new Student(id, firstName, lastName, age, averageScore, subjects);
//        }catch (IOException e){
//            System.out.println("can not read this file");
//        }
//
//        try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(outputFile))){
//            ArrayList<Student> students = (ArrayList<Student>)obj.writeObject();
//            for(Student st : students){
//                System.out.println(st);
//            }
//        }
//        catch(IOException e){
//            System.out.println("can not output this file");
//        }
//
//        System.out.println("sorted students by average scores: ");{
//            for(Student s : students){
//                System.out.println(s);
//            }
//        }
//    }
//    }
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // N1
//
//        String s = "rfhhur34jhf3";
//        int numberOfDigits = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char s1 = s.charAt(i);
//            if(s1 == 0 || s1 == 1 || s1 == 2 || s1 == 3 || s1 == 4 || s1 == 5 || s1 == 6 || s1 == 7 || s1 == 8 || s1 == 9){
//                numberOfDigits++;
//            }
//        }
//        System.out.println("number of digits in string '" + s + "' is " + numberOfDigits);

        // N2
//        String s = "hfhd. dhfhg?";
//        int numberOfSentences = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char s1 = s.charAt(i);
//            if(s1 == '.' || s1 == '?' || s1 == '!'|| s1 == ';'){
//           numberOfSentences++;
//            }
//        }
//        System.out.println("number of sentences in string '" + s + "' is " + numberOfSentences);

        // N3
//        String s = "abgjja";
//        String s1 = "";
//        for(int i = s.length() - 1; i >= 0; i--){
//            s1 += s.charAt(i);
//        }

//        if(s.equals(s1)){
//            System.out.println("string '" + s + "' is a palindrome");
//        }
//        else{
//            System.out.println("string '" + s + "' is not a palindrome");
//        }

        // N4
//        String s1 = "abcdefgh";
//        String s2 = "ah";
//        if(s1.contains(s2)){
//            System.out.println("string '" + s1 + "' contains string '" + s2 + "'" );
//        }
//        else{
//            System.out.println("string '" + s1 + "' doesn't contains string '" + s2 + "'" );
//        }

        // N5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter string:");
//        String s = scanner.nextLine();
//        char lastDigit = 'a';
//        boolean isVowel = false;
//        for (int i = s.length() - 1; i >= 0 ; i--) {
//            lastDigit = s.charAt(i);
//            break;
//
//        }
//
//        if(lastDigit == 'a' || lastDigit == 'e' || lastDigit == 'o' || lastDigit == 'i' || lastDigit == 'u' || lastDigit == 'A' || lastDigit == 'E' || lastDigit == 'O' || lastDigit == 'I' || lastDigit == 'U'){
//            isVowel = true;
//        }
//        else{
//            isVowel = false;
//        }
//
//
//        if(isVowel) {
//            System.out.println("string '" + s + "' ends with a vowle");
//        }
//        else {
//            System.out.println("string '" + s + "' doesn't end with a vowle");
//        }


          // N6
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter string:");
//        String s = scanner.nextLine();
//        String s1 = "";
//        for (int i = 0; i < s.length(); i++) {
//            if(i == i + 1 ){
//                s1 = s.replace(s.charAt(i), "");
//            }
//        }
//        System.out.println("modified string:  '" + s1 + "'");

        // N7
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter string:");
//        String s = scanner.nextLine();
//        boolean isLong = false;
//        char first = '.';
//        char last = '.';
//        int lettersInBetween = 0;
//        if(s.length()  >= 10){
//            isLong = true;
//        }
//        else {
//            isLong = false;
//        }
//
//        if(isLong)
//        {
//            for (int i = 0; i < s.length(); i++) {
//                first = s.charAt(i);
//                break;
//            }
//            for (int j = s.length() - 1; j >= 0 ; j--) {
//                last = s.charAt(j);
//                break;
//            }
//            lettersInBetween = s.length() - 2;
//
//            System.out.println("string '" + s + "' shortened is '" + first + " " + lettersInBetween + " " + last + "'");
//        }
//        else {
//            System.out.println("string '" + s + "' is not long enough to be shortened");
//        }


    }
}
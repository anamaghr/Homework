import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // N1
        // d) -7

        // N2
        // c) int[] array = new int[5][5];

        // N3
        // d) 4

        // N4
        // c) String

        // N5
        // a) A

        // N6
        // c) byte, short, int, long

        // N7
        // a) Hello

        // N8
        // a) break;

        // N9
        // c) აცხადებს ინტების ფოინთერების მასივს ზომით 10-ს

        // N10
        // c) 24

        // N11
        // c) მასივს აქვს ფიქსირებული ზომა

        // N12
        // a) git status

        // N13
        // a) Remote რეპოზიტორის ასლს ქმნის ლოკალურად

        // N14
        // a) 0

        // N15
        // b) მასივი არის ერთი ცვლადი, რომელსაც შეუძლია შეინახოს რამდენიმე ერთი და იმავე ტიპის მნიშვნელობა

        // N16
//        int[] arr = {1,34,87,3,5,9};
//        int min = arr[0];
//        int max = arr[0];
//        int storeWithCheapest = 0;
//        int storeWithMostExpensive = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            if(min > arr[i]){
//                min = arr[i];
//            }
//            if(max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length ; i++)
//        {
//            if(arr[i] == min)
//            {
//                storeWithCheapest = i;
//            }
//            if(arr[i] == max)
//            {
//                storeWithMostExpensive  = i;
//            }
//        }
//        System.out.println(storeWithCheapest + " მაღაზიაში ყველაზე იაფია და ღირს " + min + " ლარი");
//        System.out.println(storeWithMostExpensive  + " მაღაზიაში ყველაზე ძვირია და ღირს " + max + " ლარი");

        // N17
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//            if(i % 5 == 0)
//            {
//                    System.out.println("HEY");
//            }
//            if(i % 7 == 0)
//            {
//                System.out.println("HOW");
//            }
//        }
//        for (int i = 0; i <= 100; i++)
//        {
//            if(i % 5 == 0 && i % 7 == 0)
//            {
//                System.out.println("HEYHOW");
//            }
//        }

        // N18
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter first number: ");
//        int a = in.nextInt();
//        System.out.print("enter second number: ");
//        int b = in.nextInt();
//        int[][] arr = new int[a][b];
//        int min = arr[0][0];
//        int max = arr[0][0];
//        int minIndexI = 0;
//        int maxIndexI = 0;
//        int minIndexJ = 0;
//        int maxIndexJ = 0;
//        System.out.print("enter array numbers: ");
//        for (int i = 0; i < a; i++) {
//            for(int j = 0; j < b; j++)
//            {
//                arr[i][j] = in.nextInt();
//                if(min > arr[i][j])
//                {
//                    min = arr[i][j];
//                }
//                if(max < arr[i][j])
//                {
//                    max = arr[i][j];
//                }
//
//                if(min == arr[i][j])
//                {
//                    minIndexI = i;
//                    minIndexJ = j;
//                }
//                if(max == arr[i][j])
//                {
//                    maxIndexI = i;
//                    maxIndexJ = j;
//                }
//            }
//        }
//        System.out.println("მასივში ყველაზე პატარაა - " + min + " და მდებარეობს [" + minIndexI + ";" + minIndexJ + "] ");
//        System.out.println("მასივში ყველაზე დიდია - " + max  + " და მდებარეობს [" + maxIndexI  + ";" + maxIndexJ + "] ");

        // N19
//        Random r = new Random();
//        int sumFirstDiagonal = 0;
//        int sumSecondiagonal = 0;
//        int[][] arr = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++){
//                arr[i][j] = r.nextInt(4) ;
//                System.out.print(arr[i][j] + " ");
//                if(i == j){
//                    sumFirstDiagonal += arr[i][j];
//                }
//                while(i != j)
//                {
//                    sumSecondiagonal += arr[i][j];
//                }
//
//            }
//        }
//        System.out.println(sumFirstDiagonal + sumSecondiagonal);

        // N20
//        Random r = new Random();
//        int[][] arr = new int[2][2];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = r.nextInt(3);
//                arr[i][j] = arr[i + 2][j - 2];
//                System.out.println(arr[i][j] + " ");
//            }
//        }
    }
    }
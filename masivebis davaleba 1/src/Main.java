import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         // N1 - N2
//        int arr[] = new int[12];
//        Random r = new Random();
//        int sumAdd = 0;
//        int sumMult = 1 ;
//        int avrg = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = r.nextInt(100);
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//
//        for (int i = 0; i < arr.length ; i++) {
//             sumAdd += arr[i];
//             sumMult *= arr[i];
//             avrg = sumAdd / arr.length ;
//        }
//        System.out.println(sumAdd );
//        System.out.println(sumMult  );
//        System.out.println(avrg  );

        // N3
//        int arr[] = new int[20];
//        Random r = new Random();
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = r.nextInt(20);
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//            System.out.println(" ");
//        }
//
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] < min)
//            {
//                min = arr[i];
//            }
//            if(arr[i] > max)
//            {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("max = " + max );
//        System.out.println("min = " + min );

        // N4 - N5
//        int arr[] = new int[15];
//        Random r = new Random();
//        int sumAdd = 0;
//        int sumMult = 1 ;
//        int avrg = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = r.nextInt(i + 1);
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
//        for (int i = 0; i < arr.length ; i++) {
//             sumAdd += arr[i];
//             sumMult *= arr[i];
//             avrg = sumAdd / arr.length ;
//        }
//        System.out.println(sumAdd );
//        System.out.println(sumMult  );
//        System.out.println(avrg  );

       // N6

//        int arr[] = new int[5];
//        Random r = new Random();
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = r.nextInt(10);
//        }
//            for (int i = 0; i < arr.length ; i++) {
//
//                System.out.print(arr[i] + " ");
//            }
//        Scanner input = new Scanner(System.in);
//        System.out.print("please enter number: ");
//        int x = input.nextInt();
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] == x) {
//                System.out.println("number " + x + " is in the array");
//                break;
//            } else {
//                System.out.println("number " + x + " is not  in the array");
//                break;
//            }
//        }

        // N7

//        int arr[] = new int[5];
//        Random r = new Random();
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = r.nextInt(10);
//        }
//            for (int i = 0; i < arr.length ; i++) {
//
//                System.out.print(arr[i] + " ");
//            }
//        Scanner input = new Scanner(System.in);
//        System.out.print("please enter number: ");
//        int n = input.nextInt();
//        for (int i = 0; i < arr.length ; i++) {
//            arr[0] = n;
//            System.out.println(arr[i]);
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            arr[arr.length ] = n;
//            System.out.println(arr[i]);
//        }

        // N8

//        int n = 5;
//        int arr[] = new int[5];
//        Random r = new Random();
//        for (int i = 0; i < arr.length ; i++)
//        {
//            arr[i] = r.nextInt(10);
//        }
//        for (int i = 0; i < arr.length ; i++) {
//
//                System.out.print(arr[i] + " ");
//            }
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] + arr[i] == n)
//            {
//                System.out.println("sum of two array numbers equal " + n);
//                break;
//            }
//            else
//            {
//                System.out.println("sum of two array numbers doesn't equal " + n);
//                break;
//            }
//        }

        // N9

//        int arr[] = new int[5];
//        Random r = new Random();
//        for (int i = 0; i < arr.length ; i++)
//        {
//            arr[i] = r.nextInt(10);
//        }
//        for (int i = 0; i < arr.length ; i++) {
//
//                System.out.print(arr[i] + " ");
//            }
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("please enter number from the array: ");
//        int n = input.nextInt();
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] != n)
//            {
//                a++;
//
//            }
//        }
//
//        int[] newArr = new int[a];
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] != n)
//            {
//                newArr[b] = arr[i];
//                b++;
//            }
//        }
//        for (int i = 0; i < newArr.length ; i++) {
//            System.out.println(newArr + " ");
//        }

         // N10

//        int arr[] = new int[5];
//        Random r = new Random();
//        for (int i = 0; i < arr.length ; i++)
//        {
//            arr[i] = r.nextInt(10);
//        }
//        for (int i = 0; i < arr.length ; i++) {
//
//                System.out.print(arr[i] + " ");
//            }
//
//
//        for(int i = 0; i < arr.length; i++){
//            Scanner input = new Scanner(System.in);
//            System.out.print("please enter number from the array: ");
//            int n = input.nextInt();
//            if (arr[i] == n) {
//                arr[i] = 0;
//
//            }
//            System.out.println(arr[i]);
//        }





    }
    }



public class Main {
    public static void main(String[] args)
    {

        // N1
//         int a = 5;
//         int b = 8;
//         int c = a;
//        a = b; b = c;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // N1 a
//         int a = 5;
//         int b = 8;
//
//         a = a + b;
//         b = a - b;
//         a = a - b;
//        System.out.println("a = " + a);
//      System.out.println("b = " + b);

        // N2
//        double a = 10.2;
//        int b = (int) a;
//        double c = a - b;
//        System.out.println(c);

        // N3
//        int a = 42;
//        if (a >= 100 && a <= 999 || a <= -100 && a >= -99 )
//        {
//            System.out.println("number " + a + " is three digit ");
//        }
//        else {
//            System.out.println("number " + a + " is not  three digit ");
//        }

        // N4
//         char letter  = 'a';
//         if (letter >= 'a' && letter <= 'z')
//         {
//             letter = (char)(letter - 32);
//         }
//        System.out.println(letter);

        // N5
//        double a = 10.4;
//        int b = (int)a;
//        double c = a - b;
//
//        if (c >= 0.5) {
//            a += c;
//        }
//        else {
//            a = a - c;
//        }
//        System.out.println(a);

        // N7
//        int a = 665;
//       if (a >= 3600)
//       {
//           int hours = a / 3600;
//           int b = a % 3600;
//           if (b >= 60){
//               int minutes = b / 60;
//               int seconds = b % 60;
//               System.out.println(hours + ":" + minutes + ":" + seconds );
//           }
//
//       }
//       else {
//           int hours = 0;
//           int minutes = a / 60;
//           int seconds = a % 60;
//           System.out.println(hours + ":" + minutes + ":" + seconds );
//       }


        // N8
        int a = 3665;
        int hours = a / 3600;
        int minutes = (a % 3600) / 60;
        int seconds = a % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds );










    }
}
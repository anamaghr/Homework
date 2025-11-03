public class Main {
    public static  void main(String[] args) {

        // N1
//        double celsius = 20;
//        double fahrenheit = (celsius * 1.8) + 32;
//        System.out.println(fahrenheit );

        // N2
//        double fahrenheit = 60.5;
//        double celsius = (fahrenheit - 32) * 0.56;
//        System.out.println(celsius );

        // N3
//        int year = 2000;
//        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
//        {
//            System.out.println(year + " წელი ნაკიანია");
//        }
//        else
//        {
//            System.out.println(year + " წელი არ არის ნაკიანია");
//        }

        // N4

//        int x = -566;
//        int y = 7;
//        if(x > 0 && y > 0)
//        {
//            System.out.println("წერტილი " + "(" + x +";" + y + ")" + " მდებარეობს I მეოთხედში");
//        }
//        else if(x < 0 && y > 0){
//            System.out.println("წერტილი " + "(" + x +";" + y + ")" + " მდებარეობს II მეოთხედში");
//        }
//        else if (x < 0 && y < 0 )
//        {
//            System.out.println("წერტილი " + "(" + x +";" + y + ")" + " მდებარეობს III მეოთხედში");
//        }
//        else if(x > 0 && y < 0)
//        {
//            System.out.println("წერტილი " + "(" + x + ";" + y + ")" + " მდებარეობს IV მეოთხედში");
//        }
//        else if (x == 0 && y == 0)
//        {
//            System.out.println("წერტილი " + "(" + x + ";" + y + ")" + " მდებარეობს სათავეზე");
//        }
//        else if (x == 0 && y != 0)
//        {
//            System.out.println("წერტილი " + "(" + x +";" + y + ")" + " მდებარეობს y ღერძზე");
//        }
//        else if (x != 0 && y == 0)
//        {
//            System.out.println("წერტილი " + "(" + x+ ";" + y + ")" + " მდებარეობს x ღერძზე");
//        }


        // N5

        char simbol = '*';
        int num1 = 5;
        int num2 = 8;
        int result = 0;
        if(simbol == '+')
        {
            result = num1 + num2;
            System.out.println(result);
        }
        else if (simbol == '-')
        {
            result = num1 - num2;
            System.out.println(result);
        }
        else if( simbol == '/')
        {
            result = num1 / num2;
            System.out.println(result);
        }
        else if(simbol == '*')
        {
            result = num1 * num2;
            System.out.println(result);
        }



    }
}
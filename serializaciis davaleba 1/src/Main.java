import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter countries name:");
            String CountryName = scanner.nextLine();

            System.out.println("enter countries population:");
            int CountryPopulation = scanner.nextInt();

            System.out.println("enter countries area:");
            double CountryArea = scanner.nextDouble();

            countries[i] = new Country(CountryName, CountryPopulation, CountryArea);
        }

        try(ObjectOutputStream e = new ObjectOutputStream(new FileOutputStream("countries.txt"))){
            e.writeObject(countries);
            System.out.println("countries serialized to file countries.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    }
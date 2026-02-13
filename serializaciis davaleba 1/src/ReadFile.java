import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {
    public static void main(String[] args)
    {
        try(ObjectInputStream e = new ObjectInputStream(new FilterInputStream("countries.txt"))){
            Country[] countries = (Country[]) e.readObject();
            for(Country country : countries){
                System.out.println(country);
            }
        }catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}

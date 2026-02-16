import java.io.*;
public class Data {

    public static void saveContacts(PhoneContacts[] contacts){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phoneContacts.txt"))){
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("unable to save contacts");
        }
    }

    public static PhoneContacts[] Contacts(){
        try(ObjectInputStream ois = new ObjectInputStream(new FilterInputStream("phoneContacts.txt"))){
            return (PhoneContacts[]) ois.readObject();
        }catch(Exception e){
            return new PhoneContacts[30];
        }
    }
}

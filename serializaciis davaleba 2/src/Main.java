import java.util.Scanner;

public class Main {
    private static PhoneContacts[] contacts = Data.Contacts();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        while (true){
            System.out.println("phone contacts:");
            System.out.println("1)add contacts");
            System.out.println("2)delete contacts");
            System.out.println("3)edit contacts");
            System.out.println("4)show contact");

            int option = scanner.nextInt();

           if(option == 1){
               addContact();
           }
           else if (option == 2) {
               deleteContact();
           }
           else if (option == 3) {
               editContact();
           }
           else if(option == 4){
               showContact();
           } else {
               System.out.println("this option does not exist");
           }
        }
        }

        private static void addContact(){
            for (int i = 0; i < contacts.length; i++) {
                if(contacts[i] == null){
                    System.out.println("enter first name:");
                    String firstname = scanner.nextLine();

                    System.out.println("enter last name:");
                    String lastname = scanner.nextLine();

                    System.out.println("enter phone number:");
                    int number = scanner.nextInt();

                    System.out.println("enter email:");
                    String email = scanner.nextLine();

                    contacts[i] = new PhoneContacts(firstname, lastname, number, email);
                    Data.saveContacts(contacts);
                    System.out.println("contact has been added");
                }

            }
            System.out.println("phone contacts are full");
        }


        private static void deleteContact(){
            System.out.println("enter contact N:");
            int n = scanner.nextInt();

            if(n >= 0 && n < contacts.length && contacts[n] != null) {
                contacts[n] = null;
                Data.saveContacts(contacts);
                System.out.println("your contact has been deleted");
            }else{
                System.out.println("this contact does not exist ");
            }
        }

        private static void editContact(){
            System.out.println("enter contact N:");
            int n = scanner.nextInt();
            if(n >= 0 && n < contacts.length && contacts[n] != null) {

                System.out.println("first name:");
                contacts[n].setFirstName(scanner.nextLine());
                System.out.println("last name:");
                contacts[n].setLastName(scanner.nextLine());
                System.out.println("phone number");
                contacts[n].setPhoneNumber(scanner.nextInt());
                System.out.println("email:");
                contacts[n].setEmail(scanner.nextLine());

                Data.saveContacts(contacts);
                System.out.println("this contact has been updated");
            }
            else{
                System.out.println("this contact does not exist");
            }
        }

        private static void showContact(){
            for (int i = 0; i < contacts.length; i++) {
                if(contacts[i] != null){
                    System.out.println(i + ")" + contacts[i]);
                }
            }
        }

    }
//public class transferMoney {
//    double balance;
//    String[] transactions;
//    public transferMoney(double balance)
//    {
//        this.balance = balance;
//        this.transactions = new String[10];
//    }
//
//    public boolean transferMoney(String account, double amount)
//    {
//        if(amount > 1000)
//        {
//            System.out.println("Failed to transfer: " + amount + "$ (amount is over the limit)" );
//            return false;
//        }
//        if(amount > balance){
//            System.out.println("Failed to transfer: " + amount + "$ (not enough money)");
//        }
//        balance -= amount;
//        account += amount;
//        System.out.println(amount + "$ is sent");
//        return true;
//
//    }
//
//}

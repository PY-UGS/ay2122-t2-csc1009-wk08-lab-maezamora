import java.util.Scanner;

public class BankMain extends CheckingAccount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter bank account number: ");
        int num = input.nextInt();
        CheckingAccount account = new CheckingAccount(num);
        System.out.println("Welcome " +account.getAccountNum());

        boolean quit = false;
        do{
            System.out.println("1.Deposit\n2.Withdraw\n3.Exit");
            System.out.println("Select an option");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Deposit to " + account.getAccountNum());
                    account.deposit();
                    break;
                case 2:
                    System.out.println("Withdraw from " + account.getAccountNum());
                    account.withdraw();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        while (!quit);
    }
}

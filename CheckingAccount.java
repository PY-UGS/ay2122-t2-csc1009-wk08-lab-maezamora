import java.util.Scanner;

public class CheckingAccount{
    private Float Balance=0.0f;
    private Integer AccountNum;

    Scanner input = new Scanner(System.in);

    public CheckingAccount(){
    }

    public CheckingAccount(Integer accountNum) {
        AccountNum = accountNum;
    }

    public Float getBalance() {
        return Balance;
    }

    public Integer getAccountNum() {
        return AccountNum;
    }

    public void deposit(){
        System.out.println("Current Balance: $" +getBalance());
        System.out.println("Enter amount to deposit: $");
        float amount = input.nextFloat();
        Balance = Balance + amount;
        System.out.println("Total balance: $" +getBalance());

    }

    public void withdraw(){
        System.out.println("Current Balance: $" +getBalance());
        System.out.println("Enter amount to withdraw: $");
        try{
            float withdrew = input.nextFloat();
            if(withdrew>Balance){
                float calc = withdrew - Balance;
                throw new InsufficientFundsException("Sorry, but your account is short by: $"+calc);
            }
            else {
                Balance = Balance - withdrew;
                System.out.println("The balance after withdrawal is: $" +getBalance());
            }
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}

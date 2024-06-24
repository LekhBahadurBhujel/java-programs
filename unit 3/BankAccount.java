public class BankAccount {
    int accountNumber;
    float balance;
    String accountHolderName;

    public BankAccount(int accountNumber, float balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        System.out.println("Account number: " + accountNumber + "\nBalance: " + balance + "\nAccount Holder Name: " + accountHolderName);
    }

    public void depositMoney(int depositAmt) {
        System.out.println("You have successfully deposited " + depositAmt + " rupee/s");
        balance = balance + depositAmt;
        System.out.println("Your new balance is " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(999, 25000, "Hari Bahadur");
        acc1.depositMoney(1000);
    }
}
package weekTwo.secondExercise.bankAccount;

public class Account {

    private String accountNumber;
    private String cardholderName;
    private double balance;


    public Account(String accountNumber, String cardholderName, double balance) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double value){
        if (value > this.balance){
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.balance -= value;
    }
    public void deposit(double value){
        this.balance += value;

    }
}

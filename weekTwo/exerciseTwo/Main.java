package weekTwo.exerciseTwo;

import weekTwo.exerciseTwo.bankAccount.Account;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("12345698", "Carlos", 3000);
        Account account1 = new Account("987456321", "Eduardo", 1500);

        account.withdraw(1500);
        account.withdraw(1200);
        account.withdraw(1500);

        account1.deposit(1500);

        System.out.println("Numero da conta: " + account.getAccountNumber()
                + " Titular: " + account.getCardholderName()
                + " Saldo: " + account.getBalance());

        System.out.println("Numero da conta: " + account1.getAccountNumber()
                + " Titular: " + account1.getCardholderName()
                + " Saldo: " + account1.getBalance());

    }
}

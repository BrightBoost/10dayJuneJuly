package exercises.main;

import exercises.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Maaike");
        bankAccount.setAccountNumber(123);
        bankAccount.setBalance(100);

        System.out.println(bankAccount.getAccountHolder() + " with account nr " + bankAccount.getAccountNumber() + " and balance " + bankAccount.getBalance());
    }
}

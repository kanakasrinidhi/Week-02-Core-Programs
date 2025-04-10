package JavaConstrucutors;

import java.util.Scanner;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accNum, String holder, double bal) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNum, String holder, double bal) {
        super(accNum, holder, bal);
    }

    void displaySavingsAccount() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accNum = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String holder = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        SavingsAccount acc = new SavingsAccount(accNum, holder, balance);
        acc.display();
        acc.displaySavingsAccount();

        sc.close();
    }
}

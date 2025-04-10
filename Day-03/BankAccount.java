package StaticInstanceopkeywords;

import java.util.Scanner;

class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();

        BankAccount account = new BankAccount(name, accNum);
        account.displayDetails();
        getTotalAccounts();
    }
}

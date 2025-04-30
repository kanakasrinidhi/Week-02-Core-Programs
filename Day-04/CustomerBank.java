import java.util.ArrayList;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: $" + balance);
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String name) {
        this.bankName = name;
    }

    void openAccount(Customer c) {
        customers.add(c);
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }

    void showAllAccounts() {
        System.out.println("Accounts in " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
    }
}

public class CustomerBank {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");

        Customer c1 = new Customer("Alice", 1500);
        Customer c2 = new Customer("Bob", 2500);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();

        bank.showAllAccounts();
    }
}

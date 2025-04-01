abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // Fixed interest for CurrentAccount
    }
}

class PersonalLoanAccount extends BankAccount implements Loanable {
    private double loanAmount;

    public PersonalLoanAccount(String accountNumber, String holderName, double balance, double loanAmount) {
        super(accountNumber, holderName, balance);
        this.loanAmount = loanAmount;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; // Eligible for loan if balance is more than or equal to 10,000
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05; // Fixed interest for PersonalLoanAccount
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("S123", "John Doe", 5000, 4);
        BankAccount currentAccount = new CurrentAccount("C456", "Jane Doe", 10000, 5000);
        BankAccount personalLoanAccount = new PersonalLoanAccount("L789", "Alex Smith", 15000, 50000);

        BankAccount[] accounts = {savingsAccount, currentAccount, personalLoanAccount};

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan();
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}

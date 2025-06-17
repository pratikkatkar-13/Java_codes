package Codes;
import java.util.Scanner;
import java.text.DecimalFormat;

class Account {
    int id;
    double balance;
    double interestRate;

    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

class SimpleInterest {
    public static double calculateInterest(Account account, int noOfYears) {
        double interestRateWithYears = account.interestRate + (account.interestRate * noOfYears * 0.01);
        return account.balance * (interestRateWithYears / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        double balance = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        int noOfYears = scanner.nextInt();
        scanner.close();

        Account account = new Account(id, balance, interestRate);
        double interest = calculateInterest(account, noOfYears);

        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(interest));
    }
}
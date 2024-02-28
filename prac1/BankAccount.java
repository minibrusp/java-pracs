import java.text.DecimalFormat;

public class BankAccount {
  private String accountNumber;
  private String accountHolder;
  private double balance;
  
  private static final DecimalFormat df = new DecimalFormat("0.00");

  public BankAccount(String accountNumber, String accountHolder, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public synchronized void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
      System.out.println("\nDeposit Success: you have " + this.balance + " remaining balance.");
    }
    else 
      System.out.println("\nDeposit failed: must enter a positive value");
  }

  public synchronized void withdraw(double amount) {
    if (amount <= this.balance) {
      this.balance -= amount;
      System.out.println("\nWithdraw Success: you have " + this.balance + " remaining balance.");
    }
    else 
      System.out.println("\nWithdraw failed: insufficient balance");
  }

  public void displayAccountInfo() {
    System.out.println(this.toString());
  }
  public String toString() {
    return "Account #: " + accountNumber + "\nAccountHolder: " + accountHolder + "\nBalance: " + df.format(balance);
  }
}
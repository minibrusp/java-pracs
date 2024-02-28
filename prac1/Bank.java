import java.util.ArrayList;

public class Bank {
  private ArrayList<BankAccount> accounts;

  public Bank() {
    this.accounts = new ArrayList<>();
    System.out.println("Bank Established");
  }

  public synchronized void addAccount(BankAccount account) {
    this.accounts.add(account);
  }
  public synchronized void removeAccount(String accountNumber) {
    BankAccount foundAccount = this.findAccount(accountNumber);
    this.accounts.remove(foundAccount);
  }

  public void displayAllAccounts() {
    for (BankAccount account : accounts) {
      System.out.println("\n" + account);
    }
  }
  public BankAccount findAccount(String accountNumber) {

    for (BankAccount account : accounts) {
      if (accountNumber == account.getAccountNumber())
        return account;
    }
    return null;
  }
}
public class Main {
  public static void main(String args[]) {

    Bank bank = new Bank();

    bank.displayAllAccounts();

    BankAccount acc1 = new BankAccount("001", "XIII DCat", 1000);
    BankAccount acc2 = new BankAccount("002", "Blackie DDog", 3500);
    BankAccount acc3 = new BankAccount("003", "Chuckie Finster", 2000);

    bank.addAccount(acc1);
    bank.addAccount(acc2);
    bank.addAccount(acc3);

    bank.displayAllAccounts();

    acc1.deposit(-1);

    acc1.deposit(100);

    acc1.withdraw(2000);

    acc1.withdraw(500);

    acc1.displayAccountInfo();

    System.out.println(bank.findAccount("002"));

    bank.removeAccount("002");

    bank.displayAllAccounts();


  }
}
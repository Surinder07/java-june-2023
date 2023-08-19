package Aug19;

public class BankMain {
    public static void main(String[] args) throws InsufficientBalanceException {
        Bank bank = new Bank();
        double deposit = bank.deposit(1000);

        System.out.println("Deposit amount is "+ deposit);

        double withdraw = bank.withdraw(2000);

        System.out.println("Balance withdraw amount is "+ withdraw);


    }
}

package Aug19;

public class Bank {
    // deposit
    // withdraw
    // balance
    double balance;
    double withdraw;

    public double deposit(double deposit){
        balance = balance + deposit;
        return balance;
    }
    public double withdraw(double withdraw) throws InsufficientBalanceException {

        if(withdraw > balance){
            throw new InsufficientBalanceException("Insufficient balance in your account ");
        }
        balance = balance - withdraw;
        return balance;
    }

}

public class RealBankAccount implements  BankAccount{
    private double balance;

    public RealBankAccount(double initialBalance){
        this.balance = initialBalance;
    }


    @Override
    public void withdraw(double amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Prelievo di " + amount + ". Saldo rimanente: " + balance);
        }else {
            System.out.println("Prelievo di " + amount + " non possibile, saldo insufficiente. " + balance);
        }
    }

    public double getBalance(){
        return balance;
    }
}

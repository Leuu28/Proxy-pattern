public class ProxyBankAccount implements  BankAccount{
    private RealBankAccount realAccount;
    private String userType;

    public ProxyBankAccount(RealBankAccount realAccount, String userType){
        this.realAccount = realAccount;
        this.userType = userType;
    }

    @Override
    public void withdraw(double amount) {
        if (userType.equals("Admin")){
            realAccount.withdraw(amount);
        }else{
            System.out.println("Accesso negato.");
        }
    }
}

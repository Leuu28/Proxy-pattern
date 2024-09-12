public class Main {
    public static void main(String[] args) {
        RealBankAccount realAccount = new RealBankAccount(10000);

        BankAccount proxyUser = new ProxyBankAccount(realAccount, "User");
        proxyUser.withdraw(5000);

        System.out.println("*************************************");

        BankAccount proxyAdmin = new ProxyBankAccount(realAccount, "Admin");
        proxyAdmin.withdraw(5000);

        proxyAdmin.withdraw(10000);
    }
}
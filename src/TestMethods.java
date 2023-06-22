public class TestMethods
{
    public static void main(String[] args) {
        Account accountJohnDoe = new Account (6646,969060);
        accountJohnDoe.deposit (100);
        accountJohnDoe.deposit (50);
        System.out.println (accountJohnDoe.getBalance());

        boolean managedToWithdraw = accountJohnDoe.sack (20);
        System.out.println(accountJohnDoe.getBalance());
        System.out.println(managedToWithdraw);

        Account accountLouiseLaine = new Account (6644,969063);
        accountLouiseLaine.deposit (1000);

        boolean transferEffected = accountLouiseLaine.transfer (300, accountJohnDoe);

        if (transferEffected) {
            System.out.println("Transfer completed successfully");

        } else {
            System.out.println("Insufficient funds");

        }
        System.out.println(accountLouiseLaine.getBalance());
        System.out.println(accountJohnDoe.getBalance());
    }

}
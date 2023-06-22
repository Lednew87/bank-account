public class TestSackNegative {

    public static void main(String[] args) {

        Account account = new Account (6646,969060);
        account.deposit (100);

        System.out.println(account.sack (101));

        account.sack (101);

        System.out.println(account.getBalance());

    }
}
public class TestAccountNoClient {

    public static void main(String[] args) {

        Account accountLouiseLaine = new Account (6646,969060);
        System.out.println(accountLouiseLaine.getBalance());

        accountLouiseLaine.setHolder(new Client());
        System.out.println(accountLouiseLaine.getHolder());

        accountLouiseLaine.getHolder().setName("Louise Laine");
        System.out.println(accountLouiseLaine.getHolder().getName());

    }
}
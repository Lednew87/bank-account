public class CreateAccount {

    public static void main(String[] args) {

        Account firstAccount = new Account (6646,969060);
        firstAccount.deposit (200);
        System.out.println(firstAccount.getBalance());

        firstAccount.deposit (100);
        System.out.println(firstAccount.getBalance());

        Account secondAccount = new Account (6645,969061);
        secondAccount.deposit (50);

        System.out.println("First account balance: " + firstAccount.getBalance());
        System.out.println("Second account balance: " + secondAccount.getBalance());

        System.out.println("Reference: " + firstAccount);
    }
}
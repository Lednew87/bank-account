public class TestBank {
    public static void main(String[] args) {
        Client johndoe = new Client();
        johndoe.setName("John Doe");
        johndoe.setSsn("222.222.222.-22");
        johndoe.setProfession("Developer");

        Account accountJohnDoe = new Account (6646,969060);
        accountJohnDoe.deposit (100);

        accountJohnDoe.setHolder(johndoe);
        System.out.println(accountJohnDoe.getHolder().getName());
        System.out.println(accountJohnDoe.getHolder());

    }
}
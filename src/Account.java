public class Account {

    private double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total = 0;

    public Account(int agency, int number) {
        Account.total++;
        System.out.println("The total of accounts is " + Account.total);
        this.agency = agency;
        this.number = number;
        this.balance = 100;
        System.out.println("I'm creating an account " + this.number);
    }

    public void deposit (double value) {
        this.balance = this.balance + value;
    }

    public boolean saca(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer (double value, Account destiny) {
        if (this.balance >= value) {
            this.balance -= value;
            destiny.deposit (value);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if (number <= 0) {
            System.out.println("We cannot deposit amounts less than or equal to 0.");
            return;
        }
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if (agency <= 0) {
            System.out.println("We cannot deposit amounts less than or equal to 0.");
            return;
        }
        this.agency = agency;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Client getHolder() {
        return this.holder;
    }

    public static int getTotal() {
        return Account.total;
    }

    public boolean sack(double i) {
        return false;
    }
}
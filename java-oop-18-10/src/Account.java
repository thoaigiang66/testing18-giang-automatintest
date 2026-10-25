abstract public class Account {
    private  double blance;
    private String owner;

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public  Account() {}
    public Account(double balance, String owner) {
     this.blance = balance;
     this.owner = owner;
    }

     public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.blance += amount;
     }
    abstract public  void  withdraw(double amount);

}

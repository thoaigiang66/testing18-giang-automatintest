// interface Account
// double getBalance();
// void setBalance(double balance);
// void withdraw(double an=mount);
//}

// public class AavingAccount implements Account
// khi ế thừa interface => Bắt trước define đầy đủ các function
// trong interface


public class SavingAccount extends Account {
    public  SavingAccount(double balance, String owner) {
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0 || amount > getBlance())
            throw new IllegalArgumentException("Invalid amount");
setBlance(getBlance() - amount);
System.out.println("Withdraw successful");
    }
}
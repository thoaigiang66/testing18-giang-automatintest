public class CheckingAccount extends  Account{
   private  static  final double OVERDRAFT_LIMIT = 1+000+000;

        public  CheckingAccount(double balance, String owner) {
            super(balance, owner);
        }


    @Override
    public void withdraw(double amount) {
       if (amount <= 0 || amount > OVERDRAFT_LIMIT) {
           throw new IllegalArgumentException("iNVALID amount");
       }
       setBlance(getBlance() - amount);
       System.out.println("withdrawal succesful");
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// tài khoản ngân hàng
 // saving account: không được rút tien qua so du trong tai khoan
// - checking account: rut tối đa là 1.000.000vnd
// Account => class cha
// saving account => class con
// checking account => class con
   SavingAccount account1 = new SavingAccount(1_000_000, "An");
   //account1.withdraw(2_000_000);
   account1.withdraw(500_000);
System.out.println(account1.getBlance());

CheckingAccount account2 = new CheckingAccount(1_000_000, "binh");
account2.withdraw(20);
    }
}
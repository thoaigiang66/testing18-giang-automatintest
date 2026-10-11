import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//selenium
// POP - page object model pattern
// VD login page
//-locator (thẻ HTML trên page đó)
// - loginBtn, usernameInput, passwordInput, Logo, Label,...
// - thuộc tính
// + clickLoginBtn()
// + fillUsername()
// + fillPassword()

// viet test case => tạo class để chứa các testcase của page đó
// - LoginTest
// từng testcase tương ứng với từng function của class LoginTest

// class de tuong tac với page trên website
// Driver, CjrpmeDriver,..

public class Main {
    public static void main(String[] args) {
// tạo doi tuong Student
        Student hs1 = new Student();
       // hs1.id = "123456";
        //        hs1.age = 20;
        //        hs1.email = "a@gmail.com";
        //        hs1.name = "Huy";
        //        System.out.println(hs1.id);
        //        System.out.println(hs1.age);
        //        System.out.println(hs1.email);
        //        System.out.println(hs1.name);

      //  hs1.input();
  //  hs1.display();
        System.out.println("======");
        Student hs2 = new Student();
       // hs2.input();
 //  hs2.display();
        Student hs3 = new Student("3", "D", "hcm", "090909", "m", "nam", 20);


 // tạo danh sach học sinh
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(hs1);
        listStudent.add(hs2);
        for (Student student : listStudent) {
            student.display();
        }
        System.out.println("example for automation test");
        LoginPage loginPage = new LoginPage();
        loginPage.login("ADMIN", "1234");
 // TODO: function để kiểm tra result tực te với result mog doi
        if (loginPage.isLoginSuccess()) {
            System.out.println("lOGIN SUCCESS");
        } else {
            System.out.println("lOGIN fail");
        }
    }
}

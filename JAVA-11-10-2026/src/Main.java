
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1.   Tao doi tuong Student
        Student hs1 = new Student();
        Student hs2 = new Student();

        Student hs3 = new Student(
                "3",
                "D",
                "HCM",
                "090909",
                "d@gmail.com",
                "Nam",
                20
        );

        // 2. Tao danh sach hoc sinh
        List<Student> listStudent = new ArrayList<>();

        listStudent.add(hs1);
        listStudent.add(hs2);
        listStudent.add(hs3);

        // 3. Hien thi danh sach hoc sinh
        System.out.println("===== DANH SACH HOC SINH =====");

        for (Student student : listStudent) {
            student.display();
            System.out.println("--------------------");
        }

        // 4. Tao doi tuong Car
        System.out.println("===== THONG TIN XE =====");

        Car car = new Car(
                "1",
                "Maybach",
                "Maybach2020",
                "Den",
                4,
                "Xang"
        );

        car.display();

        // 5. Vi du automation test - LoginPage
        System.out.println("===== AUTOMATION TEST =====");

        LoginPage loginPage = new LoginPage();

        loginPage.login("admin", "Admin123");

        // So sanh ket qua thuc te voi ket qua mong doi
        boolean expectedResult = true;
        boolean actualResult = loginPage.isLoginSuccess();

        if (actualResult == expectedResult) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }

        System.out.println("Login result: " + actualResult);
    }
}

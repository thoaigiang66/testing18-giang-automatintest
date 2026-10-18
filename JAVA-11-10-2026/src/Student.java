
import java.util.Scanner;

public class Student {

    String id;
    String name;
    int age;
    String address;
    String phone;
    String email;
    String gender;

    // Constructor khong tham so
    public Student() {
    }

    // Constructor co tham so
    public Student(String id, String name,
                   String address, String phone,
                   String email, String gender,
                   int age) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    // Nhap thong tin hoc sinh
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma hoc sinh: ");
        id = sc.nextLine();

        System.out.print("Nhap ten: ");
        name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();

        System.out.print("Nhap so dien thoai: ");
        phone = sc.nextLine();

        System.out.print("Nhap email: ");
        email = sc.nextLine();

        System.out.print("Nhap gioi tinh: ");
        gender = sc.nextLine();
    }

    // Hien thi thong tin hoc sinh
    public void display() {
        System.out.println("Ma hoc sinh: " + id);
        System.out.println("Ten hoc sinh: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Email: " + email);
        System.out.println("Dia chi: " + address);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("So dien thoai: " + phone);
    }
}

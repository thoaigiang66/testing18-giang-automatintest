import java.util.Scanner;

// public: the hien pham vi truy cap cua doi tuong
// private: những nơi khác sẽ không thể truy cập được
// protected
public class Student {
//  list các thuộc tinh hay biến của đối tượng
    String id;
    String name;
    int age;
    String address;
    String phone;
    String email;
    String gender;

 // ham khởi tao DOI TUONG - CO NÓ MỚI TAO DOI TUONGD DC
 // LƯU Ý: nếu không tạo 1 hàm khởi tạo => java tự độg tạo hàm kt mặc định
 // => dùng tu khóa new de tao
 // public Student() {
 //
 //}

 public Student(){
 // trong hàm ko có logic code -> gán giá trị mặc định cho tuwg thuoc tinh
//id = "123";
// name ="huy"
 }

// LƯU Ý: nếu dùng hàm khởi tạo c tham số => bắt buộc tạo hàm khởi tạo có tham sô
 public  Student(String id,
                 String name,
                 String address,
                 String phone,
                 String email,
                 String gender, int age) {
 // phan biệt ten của thuộc tính và tên của tham số
 // => this để phân biệt
 // nếu khác tên => không cần dung this
 this.id = id;
 this.name = name;
 //
 }
 // liệt kê cac phuong thuc (function)
 // gọi hàm nhập giá trị của đối tuong
 public void input() {
     Scanner sc = new Scanner(System.in);
     System.out.println("mOI BAN NHAP MA HOC SÍNH");
     id = sc.nextLine();
     System.out.println("mOI BAN NHAP TEN");
     name = sc.nextLine();
     System.out.println("mOI BAN NHAP tuoi");
     age = Integer.parseInt(sc.nextLine());
     System.out.println("mOI BAN NHAP dia chi");
     address = sc.nextLine();
     System.out.println("mOI BAN NHAP so dien thoai");
     phone = sc.nextLine();
     System.out.println("mOI BAN NHAP email");
     email = sc.nextLine();
     System.out.println("mOI BAN NHAP gioi tinh");
     gender = sc.nextLine();

 }
 public void display() {
     System.out.println("Mã học sinh: " + id);
     System.out.println(" Tên học sinh: " + name);
     System.out.println(" Email: " + email);
     System.out.println(" Địa chỉ: " + address);
     System.out.println("giới tính: " + gender);
     System.out.println(" sdt: " + phone);
 }
}


import java.util.Scanner;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/>
// or click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        // 1. Câu lệnh nhập xuất
        // Xuất
        System.out.println("hello world");

        // Biến (variable)
        // <kiểu dữ liệu> <tên biến>;
        // <kiểu dữ liệu> <tên biến> = <giá trị>;

        // Quy tắc đặt tên biến: camel case
        // Ví dụ: soNguyen, hocSinh,...

        int num1 = 10;
        float num2 = 10.5f;
        boolean isActive = true;
        char ch = 'a';
        String str = "hello world";

        System.out.println(isActive);
        System.out.println(str);

        // 2. Các toán tử

        // 2.1 Phép toán: +, -, *, /, %
        // / : chia
        // % : chia lấy dư

        int number1 = 10;
        int number2 = 20;

        int result = number1 + number2;

        System.out.println("Tổng 2 số nguyên là: " + result);

        // ++ => tăng biến lên 1 đơn vị
        // number1 = number1 + 1
        // tương đương: number1++

        // Gán giá trị number1 vào number3 trước,
        // sau đó mới tăng number1 lên 1

        int number3 = number1++;

        System.out.println("number3 = " + number3);
        System.out.println("number1 = " + number1);

        // ++number2:
        // Tăng number2 lên 1 trước,
        // sau đó mới gán giá trị cho number4

        int number4 = ++number2;

        System.out.println("number4 = " + number4);
        System.out.println("number2 = " + number2);

        // Phép trừ tương tự phép cộng
        // number--, --number

        number1 += 10; // number1 = number1 + 10
        number1 -= 10; // number1 = number1 - 10

        number1 = number2 + 10;

        // Phép nhân
        number1 *= 10;

        // Phép chia
        number1 /= 10;

        // Phép chia lấy dư
        number1 %= 10;

        // Hằng số (constant)
        // Biến lưu giá trị không đổi

        final int TIMEOUT = 1000;

        // TIMEOUT = 10; // SAI

        // Trong Automation Test:
        // TIMEOUT có thể dùng để lưu thời gian chờ,
        // địa chỉ trang web, locator,...

        // 2.2 So sánh
        // >, >=, <, <=, ==, !=, !
        // Kết quả trả về là boolean

        boolean isGreater = 10 > 5;
        boolean isEqual = 10 == 10;

        System.out.println("isGreater = " + isGreater);
        System.out.println("isEqual = " + isEqual);

        // 2.3 Nối nhiều điều kiện: &&, ||
        // Kết quả trả về là boolean

        boolean isCheck = (10 > 5) && (10 < 20);

        boolean isCheck2 = (10 > 5) || (10 > 20);

        System.out.println("isCheck = " + isCheck);
        System.out.println("isCheck2 = " + isCheck2);

        // 3. Nhập dữ liệu từ bàn phím
        // Scanner

        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên
        System.out.println("Moi ban nhap so nguyen: ");
        int number5 = Integer.parseInt(sc.nextLine());

        System.out.println("So nguyen ban nhap la: " + number5);

        // Nhập số thực
        System.out.println("Moi ban nhap so thuc: ");
        float number6 = Float.parseFloat(sc.nextLine());

        System.out.println("So thuc ban nhap la: " + number6);

        // Nhập chuỗi
        System.out.println("Moi ban nhap chuoi: ");
        String str1 = sc.nextLine();

        System.out.println("Chuoi ban nhap la: " + str1);

        // 4. Mảng
        String[] danhSachTen = {"Nguyen", "Hieu", "Tran"};

        System.out.println(danhSachTen[0]);
        System.out.println(danhSachTen[2]);

        int lengthDSTen = danhSachTen.length;

        System.out.println(danhSachTen[lengthDSTen - 1]);

        // 5. Condition statement
        // if (<biểu thức điều kiện>) {
        //     logic code
        // } else {
        //     logic code
        // }

        // Gọi hàm kiểm tra điểm thi
        kiemTraDiemThi();

        // BÀI 2: Tìm số lớn nhất trong 3 số
        // VD: 4, 8, 2 => 8

        sc.close();
    }

    // Tạo hàm để xử lý code liên quan tới điểm thi
    //
    // <phạm vi truy cập> static <kiểu dữ liệu> <tên hàm>(<tham số>) {
    //     code
    // }

    public static void  kiemTraDiemThi() {

        Scanner sc = new Scanner(System.in);

        // BÀI 1: Kiểm tra điểm thi đại học.
        // Nếu dưới điểm chuẩn thì FAIL
        //
        // Input:
        // - điểm thi đại học
        // - điểm chuẩn
        //
        // Output:
        // - PASS / FAIL
        //
        // Process:
        // Nếu điểm thi >= điểm chuẩn => PASS
        // Nếu điểm thi < điểm chuẩn => FAIL

        System.out.println("Moi ban nhap diem thi dh: ");
        int diemThi = Integer.parseInt(sc.nextLine());

        // Kiểm tra điểm thi hợp lệ
        if (diemThi < 0 || diemThi > 10) {
            System.out.println("Diem thi khong hop le");
            return;
        }

        System.out.println("Moi ban nhap diem chuan: ");
        int diemChuan = Integer.parseInt(sc.nextLine());

        // Kiểm tra điểm chuẩn hợp lệ
        if (diemChuan < 0 || diemChuan > 10) {
            System.out.println("Diem chuan khong hop le");
            return;
        }

        // Kiểm tra PASS / FAIL
        if (diemThi >= diemChuan) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
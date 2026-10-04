import java.util.Scanner;

public class Main {

    // =====================================================
    // BÀI 1: TÍNH CHU VI VÀ DIỆN TÍCH HÌNH CHỮ NHẬT
    // =====================================================
    public static void chuViDienTich(float dai, float rong) {

        // Validate dữ liệu đầu vào
        if (dai < 0 || rong < 0) {
            System.out.println("Chieu dai, chieu rong khong duoc am");
            return;
        }

        // Process
        float chuVi = 2 * (dai + rong);
        float dienTich = dai * rong;

        // Output
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }


    // =====================================================
    // BÀI 2: TÌM SỐ LỚN NHẤT TRONG 3 SỐ
    // =====================================================
    public static void soLonNhat(int num1, int num2, int num3) {

        // Giả sử num1 là số lớn nhất
        int maximum = num1;

        // So sánh num2 với maximum
        if (num2 > maximum) {
            maximum = num2;
        }

        // So sánh num3 với maximum
        if (num3 > maximum) {
            maximum = num3;
        }

        // Output
        System.out.println("So lon nhat la: " + maximum);
    }


    // =====================================================
    // BÀI 3: KIỂM TRA HỌC LỰC DỰA VÀO ĐIỂM TRUNG BÌNH
    // =====================================================
    public static void xepLoaiHocLuc(float diemTB) {

        // Validate điểm
        if (diemTB < 0 || diemTB > 10) {
            System.out.println("Diem khong hop le");
            return;
        }

        // Xếp loại
        if (diemTB >= 8.0) {
            System.out.println("Hoc luc: Gioi");

        } else if (diemTB >= 6.5) {
            System.out.println("Hoc luc: Kha");

        } else if (diemTB >= 5.0) {
            System.out.println("Hoc luc: Trung binh");

        } else {
            System.out.println("Hoc luc: Yeu");
        }
    }


    // =====================================================
    // BÀI 4: TÍNH TIỀN ĐIỆN
    // =====================================================
    public static void tinhTienDien(int soKwh) {

        // Validate
        if (soKwh < 0) {
            System.out.println("So kWh khong hop le");
            return;
        }

        int tienDien = 0;

        // Bậc 1: 1 - 50 kWh
        if (soKwh <= 50) {

            tienDien = soKwh * 1800;

        }

        // Bậc 2: 51 - 100 kWh
        else if (soKwh <= 100) {

            tienDien = 50 * 1800
                    + (soKwh - 50) * 2000;

        }

        // Bậc 3: 101 - 200 kWh
        else if (soKwh <= 200) {

            tienDien = 50 * 1800
                    + 50 * 2000
                    + (soKwh - 100) * 2500;

        }

        // Bậc 4: Trên 200 kWh
        else {

            tienDien = 50 * 1800
                    + 50 * 2000
                    + 100 * 2500
                    + (soKwh - 200) * 3000;
        }

        // Output
        System.out.println("So kWh: " + soKwh);
        System.out.println("Tien dien: "  + tienDien + " VND");
        // MÔT SỐ BÀI TẬP TƯƠNG ĐƯƠNG: TÍNH TIỀN THUẾ, TÍNH TIỀN TAXI
    }
// loop
 // bài 1: in các số từ 1 - 100
 public static void inSoTu1Den100() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(i);
        }
 }
 // bài 2: in các số chan tu 0 den 100
 public static void inSoChantu0Den100() {
     for (int i = 0; i <= 100; i += 2) {
         System.out.println(i);
     }
 }
 // Bài 3: tính tổng các số tu 1 - 300
 public static void sum1To300() {
 int sum = 0;
     for (int i = 1; i <= 300; i++) { sum += i;
     }
         System.out.println("Tong so tu 1 den 300 la: " + sum);

    }
  // bai 4: bảng cửu chương 5
    // =====================================================
    // MAIN
    // =====================================================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // =================================================
        // BÀI 1
        // =================================================
        System.out.println("=================================");
        System.out.println("BAI 1: TINH CHU VI, DIEN TICH");
        System.out.println("=================================");

        System.out.println("Nhap chieu dai: ");
        float dai = Float.parseFloat(sc.nextLine());

        System.out.println("Nhap chieu rong: ");
        float rong = Float.parseFloat(sc.nextLine());

        // Gọi hàm Bài 1
        chuViDienTich(dai, rong);


        // =================================================
        // BÀI 2
        // =================================================
        System.out.println("\n=================================");
        System.out.println("BAI 2: TIM SO LON NHAT");
        System.out.println("=================================");

        int num1 = 4;
        int num2 = 2;
        int num3 = 1;

        // Gọi hàm Bài 2
        soLonNhat(num1, num2, num3);


        // =================================================
        // BÀI 3
        // =================================================
        System.out.println("\n=================================");
        System.out.println("BAI 3: XEP LOAI HOC LUC");
        System.out.println("=================================");

        System.out.println("Nhap diem trung binh: ");
        float diemTB = Float.parseFloat(sc.nextLine());

        // Gọi hàm Bài 3
        xepLoaiHocLuc(diemTB);


        // =================================================
        // BÀI 4
        // =================================================
        System.out.println("\n=================================");
        System.out.println("BAI 4: TINH TIEN DIEN");
        System.out.println("=================================");

        System.out.println("Nhap so kWh dien: ");
        int soKwh = Integer.parseInt(sc.nextLine());

        // Gọi hàm Bài 4
        tinhTienDien(soKwh);


        // Đóng Scanner
        sc.close();
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // input: 1 số nguyên
    // output:sooso nguyen có phải là số nguyên tố hay khồn
    // process
    // điều kien bắt đầu voòng lặp: i = 2
    // điều kiện dừng: i <= n-1
    // bước nhảy: i++
    // th1: n truyền vô <2 => ko là số nguyên tố
    // th2: n ==2 => là số nguyên tố
    // th3: normal
    // + nếu n đang truyền vo chia hết % i == 0 => không là số nguyên tốt => dừng chương trình
    // + và ngược lại => duyệt tiếp

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        // for (int i = 2; i <= number -1; i++) {
        // if (number % i ==0) {
        //              return false;
        //}

        int i = 2;
        while (i <= number - 1) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        // duyệt tới number - 1 mà vẫn không chia hết => chắc chac là số nguyên tố
        return true;
    }

    // input: int number
    // output: tong cac chu so cua mot so -> int
    // process
    // 1234
    // tach so 4 tu 1234 => 1234 % 10 = 4
    // xoa 4 ra khoi 1234 => 1234 / 10 = 123
    // làm tương tự vs các số còn lại
    // dieu kien dung: khi number > 0
    public static int sumDigits(int number) {
        int sum = 0;
        // th1: nếu numver < 0 => abs để convert sang so dương (gtri tuyệt đối)
            int numberAbs = Math.abs(number);

            while (numberAbs > 0) {
                sum += numberAbs % 10;
                numberAbs /= 10;
        }

            return sum;
    }
    //bai1
public  static void  printArray(int[] listNumbers) {
        for (int i = 0; i < listNumbers.length; i++) {
            System.out.println(listNumbers[i]);
        }
}

    public static void printChan(int[] listNumbers) {
        // cach 1: for truyen thong - duyet theo index
        for (int i = 0; i < listNumbers.length; i++) {
            if (listNumbers[i] % 2 == 0) {
                System.out.println(listNumbers[i]);
            }
        }
    }

    public static void printLe(int[] listNumbers) {
        for (int i = 0; i < listNumbers.length; i++) {
            if (listNumbers[i] % 2 != 0) {
                System.out.println(listNumbers[i]);
            }
        }
        // cach 2: for cai tien - duyet theo item
        for (int number : listNumbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void printPrimes(int[] listNumbers)
    {
        for (int number : listNumbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        // bài 1: kiểm tra số có phải là số nguyên tố hay không
        // LƯU Ý: Số 2 là số nguyên tố nhỏ nhất
        // kết quả trả về của hàm phải là kiểu (true false) hàm boolean
        int number = 7;
        boolean check = isPrime(number);
        if (check) { //java tu hieu check == true
            System.out.println("So" + number + "la so nguyen to");
        } else {
            System.out.println("So" + number + " KO la so nguyen to");
        }
  // Bai 2: tính tổng cac chu số của 1 số
  // VD: 1234 => 10
  // cach1: neu vẫn xai for => convert tu number => string => dung function có sẵn của Stirng để đếm số l
  // luong chữ ố của 1 so
  // cach 2: dung while để xử lý trực tiếp tới number
        int number2 = -12345;
        int sum = sumDigits(number2);
        System.out.println("Tong chu so cua " + number2 + "la  " + sum);

        int[] listNumbers = {5, 3, 7, 1, 9, 10};
        // int phải có dấu ngoặcvuoog để thể hiện mảng số nguyen
        // bài 1: in cac so trong mang
        // bài 2: in các số chẵn. số lẻ trong mảng
        // bài 3: in các số nguyên tố trong mảng
        // function
        // dungg void
        // tham số: int[]
        System.out.println(" Cac so trong mang la: ");
        printArray(listNumbers);
        System.out.println(" cac so chan trong mang la: ");
        printArray(listNumbers);
        System.out.println("Cac so le trong mang la: ");
        printLe(listNumbers);
        System.out.println("Cac so nguyen to trong mang la: ");
        printPrimes(listNumbers);
        // vong lap long nhau
        // collection trong java

    }
}

import java.sql.Array;
import java.util.*;

public class Main {

    // 1. Hàm xóa ký tự nguyên âm
    public static String removeVowels(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 2. Hàm đếm số từ
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // 3. Hàm đảo ngược chuỗi
    public static String reverseString(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    // 4. Collection trong Java
    public static void learningCollection() {
        // Khai báo mảng số kiểu Integer (Object) để ép sang List
        Integer[] arr = {4, 2, 6, 8, 9};
        List<Integer> listInt = new ArrayList<>(Arrays.asList(arr));

        // Sắp xếp tăng dần
        Collections.sort(listInt);
        System.out.println("Tăng dần: " + listInt);

        // Sắp xếp giảm dần
        Collections.sort(listInt, Collections.reverseOrder());
        System.out.println("Giảm dần: " + listInt);

        // Đảo ngược mảng
        Collections.reverse(listInt);
        System.out.println("Đảo ngược: " + listInt);

        // Tìm max, min
        System.out.println("Max: " + Collections.max(listInt));
        System.out.println("Min: " + Collections.min(listInt));

        // Đếm số lần xuất hiện
        System.out.println("Count 4: " + Collections.frequency(listInt, 4));

        // Khai báo hoàn chỉnh List<String>
        List<String> listStr = new ArrayList<>();

        // Thêm item trong list
        listStr.add("hello");
        listStr.add("world");

        // Thêm item vào vị trí index 1
        listStr.add(1, "Phuong");
        System.out.println("Danh sách listStr ban đầu: " + listStr);

        // Đọc item tại chỉ số 1
        System.out.println("Item ở vị trí index 1: " + listStr.get(1));

        // --- UPDATE (Cập nhật phần tử) ---
        listStr.set(0, "Hello");
        System.out.println("Sau khi update index 0: " + listStr);

        // --- DELETE (Xóa phần tử) ---
        // - Xóa theo index
        listStr.remove(0);
        System.out.println("Sau khi xóa theo index 0: " + listStr);

        // - Xóa theo item (giá trị) và in lại đúng chuẩn System.out.println
        listStr.remove("world");
        System.out.println("Sau khi xóa theo giá trị 'world': " + listStr);
    }
// Bài tong các so trong mang
    public static void sum() {
        List<Integer> list = new ArrayList<>(Array.asList(5, 3, 7, 2, 9));
        int sum = 0;
        for (int i = 0; i < list.size(); i++);
        sum += list
 // tính trung bình
 double avg = (double) sum / list.size();
        System.out.println("avg: " +avg);
    }
    public static void removeSoAm() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, -2, 8, 9, -4));
        // cch 1: dung for
        for (int i = 0; i < list.size(); i++);
        if (list.get(i) < 0) {
            list.remove(i);
        }
    }

    // 5. Hàm main để chạy chương trình
    public static void main(String[] args) {
        String str = "Cybersoft";
        System.out.println("Xóa nguyên âm của 'Cybersoft': " + removeVowels(str));

        String input = "Hello World Java";
        String output = removeVowels(input);
        System.out.println("Chuỗi ban đầu: " + input);
        System.out.println("Sau khi xóa nguyên âm: " + output);

        String str2 = "xin chào các ban";
        System.out.println("Số từ trong str2: " + countWords(str2));

        String str4 = "Hello";
        System.out.println("Đảo ngược 'Hello': " + reverseString(str4));

        String str5 = "world";
        System.out.println("Đảo ngược 'world': " + reverseString(str5));

        System.out.println("\n--- CHẠY THỬ HÀM COLLECTION ---");
        learningCollection();
    }
}

// tính đóng gói
// private, protected, public
// private: chỉ nội bo bên trong class dung, bên ngòoài khng thể truy cập kể cả class con
// publlic: tâất cả class bên ngoài đều c thể su dụng
//protected: chỉ cho class con có thể dùng duoc, class khác không thể sử dụng
// Nguyên tắc:
// các thộc tinsh BẮT BUOC dùng private, trừ 1 số case thì dùng protected
// hàm khơi tạo BẮT BUỘC dùng public
// trong case mà các thuộc tính ở phạm vi private muốn truy cập tới
// ==> dùng getter, setter


// TÍNH TRỪU TƯỢNG
// class cha BẮT BỘC CHỈ DÙNG cho class con kế thua, khôngdduowcjc dung để tạo đối tượng
abstract public class Vehicle {

    private String id;
    private String name;
    private String model;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Constructor khong tham so
    public Vehicle() {
    }

    // Constructor co tham so
    public Vehicle(String id, String name,
                   String model, String color) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
    }
abstract void getInfor();
    // Hien thi thong tin phuong tien
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}

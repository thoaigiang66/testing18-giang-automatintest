public class car extends vehicle{
    int seats;
    String fullType;

    public car(){
        super(); // kế thừa hàm khởi tạo không tham số của class cha
    }

    public car(String id, String name,String model, String color, int seats,
               String fuelType) {
        super(id, name, model, color); //kế thừa hàm khởi tạo có tham số của class cha
        this.seats = seats;
        this.fullType = fuelType;
    }
    public void display(){
        super.display();
        System.out.println("seats: " + seats);
        System.out.println("Fuel type: " + fullType);
 // lưu ý: 1. không được dùng class cha vì class cha chỉ để kế thừa
 // 2.
  car mec = new car("1", "Maybach", "maybach2020", "den", 4, "xang");
  mec.display();
    }
}

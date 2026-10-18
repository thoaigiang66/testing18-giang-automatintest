
public class Car extends Vehicle {

    int seats;
    private String fuelType;

    public int getSeats() {
        return seats;
    }
 // khi class cha có hàm abstract
    // => class con phải define lại hàm đó, cùng kiểu dữ liệu, cùng tên hm
    // @Overridedde danh dau hàm này là của class cha
    @Override 
    public void  getInfor(){
        System.out.println("Seats: " + seats);
        System.out.println("Fuel type: " + fuelType);
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Constructor khong tham so
    public Car() {
        super();
    }

    // Constructor co tham so
    public Car(String id, String name,
               String model, String color,
               int seats, String fuelType) {

        super(id, name, model, color);

        this.seats = seats;
        this.fuelType = fuelType;
    }

    // Ghi de phuong thuc display cua class cha
    @Override
    public void display() {
        super.display();

        System.out.println("Seats: " + seats);
        System.out.println("Fuel type: " + fuelType);
    }
}

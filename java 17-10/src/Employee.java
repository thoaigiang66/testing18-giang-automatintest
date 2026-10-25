abstract public class Employee {
    private String id;
    private String name;
    private  String email;
    private double basesalary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Employee() {}
    public Employee(String id, String name, double basesalary) {
        this.id = id;
        this.name = name;
        this.basesalary = basesalary;
    }
    // do tính lương của mỗi class khác nhau nên define hàm tính lương
    // thuộc dạng abstract
    abstract public  double  calculateSalary();
}

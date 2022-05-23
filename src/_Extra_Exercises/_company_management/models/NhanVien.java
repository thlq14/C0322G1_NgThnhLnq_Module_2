package _Extra_Exercises._company_management.models;

public abstract class NhanVien {
    private String name;
    private int birth;
    private String address;

    public NhanVien() {
    }

    public NhanVien(String name, int birth, String address) {
        this.name = name;
        this.birth = birth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double salaryStaff();
    /* iv. Suy nghĩ xem class cha có cần phương thức abstract không? Vì sao?
     * Việc dùng abstract class sẽ giúp cho chúng ta dễ dàng control được ý muốn của mình.
     * Nếu bạn muốn các thằng con của abstract class phải làm đều gì đó thì bạn khai báo abstract method,
     * còn nếu như muốn cho các thằng con dùng chung thì bạn để method thông thường.
     */

    @Override
    public String toString() {
        return "" +
                "name = '" + name + '\'' +
                ", birth = " + birth +
                ", address = '" + address + '\'';
    }
}

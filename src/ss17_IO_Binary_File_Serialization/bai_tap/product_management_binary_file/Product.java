package ss17_IO_Binary_File_Serialization.bai_tap.product_management_binary_file;

public class Product {
    private int id;
    private String name;
    private String production;
    private double amount;

    public Product() {
    }

    public Product(int id, String name, String production, double amount) {
        this.id = id;
        this.name = name;
        this.production = production;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", production = '" + production + '\'' +
                ", amount = " + amount +
                '}';
    }
}

package _Extra_Exercises._staff_management.models;

import java.time.LocalDate;

public class Product extends Staff {
    private double numberProduct;
    private double priceProduct;

    public Product() {
    }

    public Product(double numberProduct, double priceProduct) {
        this.numberProduct = numberProduct;
        this.priceProduct = priceProduct;
    }

    public Product(int id, String staffId, String name, LocalDate birth, String address, double numberProduct, double priceProduct) {
        super(id, staffId, name, birth, address);
        this.numberProduct = numberProduct;
        this.priceProduct = priceProduct;
    }

    public double getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(double numberProduct) {
        this.numberProduct = numberProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(), super.getStaffId(), super.getName(), super.getBirth(), super.getAddress(),
                this.getNumberProduct(), this.getPriceProduct(), "Product");
    }

    @Override
    public String toString() {
        return "Product {" + super.toString() +
                "', numberProduct = " + numberProduct +
                ", priceProduct = " + priceProduct +
                '}';
    }
}

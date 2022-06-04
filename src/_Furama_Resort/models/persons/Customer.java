package _Furama_Resort.models.persons;

import java.time.LocalDate;

public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String customerAddress;

    public Customer() {
    }

    public Customer(String customerId, String customerType, String customerAddress) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public Customer(int id, String name, LocalDate birth, String gender, int idCard, int phoneNumber, String email, String customerId, String customerType, String customerAddress) {
        super(id, name, birth, gender, idCard, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(), super.getName(), super.getBirth(), super.getGender(),
                super.getIdCard(), super.getPhoneNumber(), super.getEmail(),
                this.getCustomerId(), this.getCustomerType(), this.getCustomerAddress());
    }

    @Override
    public String toString() {
        return "Customer {" + super.toString() +
                ", customerId = '" + customerId + '\'' +
                ", customerType = '" + customerType + '\'' +
                ", customerAddress = '" + customerAddress + '\'' +
                '}';
    }
}

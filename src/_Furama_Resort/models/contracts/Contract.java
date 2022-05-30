package _Furama_Resort.models.contracts;

import _Furama_Resort.models.bookings.Booking;
import _Furama_Resort.models.persons.Customer;

public class Contract {
    private String idContract;
    private Booking idBooking;
    private String prePayment;
    private String totalPayment;
    private String idCustomer;

    public Contract() {
    }

    public Contract(String idContract, Booking idBooking, String prePayment, String totalPayment, String idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.prePayment = prePayment;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Booking idBooking) {
        this.idBooking = idBooking;
    }

    public String getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(String prePayment) {
        this.prePayment = prePayment;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract {" +
                "idContract = " + idContract +
                ", idBooking = " + idBooking +
                ", prePayment = " + prePayment +
                ", totalPayment = " + totalPayment +
                ", idCustomer = " + idCustomer +
                '}';
    }
}

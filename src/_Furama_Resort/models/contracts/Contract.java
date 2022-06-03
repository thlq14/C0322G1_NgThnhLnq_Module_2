package _Furama_Resort.models.contracts;

public class Contract {
    private String idContract;
    private String idBooking;
    private String prePayment;
    private String totalPayment;
    private String idCustomer;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, String prePayment, String totalPayment, String idCustomer) {
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

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
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

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s",
                this.getIdContract(), this.getIdBooking(), this.getPrePayment(),
                this.getTotalPayment(), this.getIdCustomer());
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

package _Furama_Resort.models.bookings;

import _Furama_Resort.models.facilitys.Facility;
import _Furama_Resort.models.persons.Customer;

import java.time.LocalDate;

public class Booking {
    private Integer idBooking;
    private LocalDate startDate;
    private LocalDate endDate;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(Integer idBooking, LocalDate startDate, LocalDate endDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking {" +
                "idBooking = " + idBooking +
                ", startDate = '" + startDate + '\'' +
                ", endDate = '" + endDate + '\'' +
                ", customer = " + customer +
                ", facility = " + facility +
                '}';
    }
}

package _Furama_Resort.models.bookings;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String customerId;
    private String nameService;
    private String facilityId;

    public Booking(int id, String bookingId, LocalDate startDate, LocalDate endDate, String customerId, String nameService, String facilityId) {
    }

    public Booking(String bookingId, LocalDate startDate, LocalDate endDate, String customerId, String nameService, String facilityId) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.nameService = nameService;
        this.facilityId = facilityId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",
                this.getBookingId(), this.getStartDate(), this.getEndDate(),
                this.getCustomerId(), this.getNameService(), this.getFacilityId());
    }

    @Override
    public String toString() {
        return "Booking {" +
                "bookingId = " + bookingId +
                ", startDate = " + startDate +
                ", endDate = " + endDate +
                ", customerId = '" + customerId + '\'' +
                ", nameService = '" + nameService + '\'' +
                ", facilityId = " + facilityId +
                '}';
    }
}

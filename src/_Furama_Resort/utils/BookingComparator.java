package _Furama_Resort.utils;

import _Furama_Resort.models.Booking;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate startDate1 = LocalDate.parse(o1.getStartDate(), formatter);
//        LocalDate startDate2 = LocalDate.parse(o2.getStartDate(), formatter);
//        LocalDate endDate1 = LocalDate.parse(o1.getEndDate(), formatter);
//        LocalDate endDate2 = LocalDate.parse(o2.getEndDate(), formatter);

        if (o1.getStartDate().compareTo(o2.getStartDate()) < 0) {
            return 1;
        } else if (o1.getStartDate().compareTo(o2.getStartDate()) > 0) { // yyyy-MM-dd
            return -1;
        } else {
            if (o1.getEndDate().compareTo(o2.getEndDate()) > 0) {
                return 1;
            } else if (o1.getEndDate().compareTo(o2.getEndDate()) < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

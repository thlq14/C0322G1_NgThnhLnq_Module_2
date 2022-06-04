package _Furama_Resort.utils.comparators;

import _Furama_Resort.models.bookings.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {

        if (o1.getStartDate().compareTo(o2.getStartDate()) < 0) {
            return 1;
        } else if (o1.getStartDate().compareTo(o2.getStartDate()) > 0) {
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

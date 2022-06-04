package _Furama_Resort.services.impl;

import _Furama_Resort.models.bookings.Booking;
import _Furama_Resort.services.service.PromotionService;
import _Furama_Resort.utils.comparators.BookingComparator;

import java.util.Set;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());


    @Override
    public void displayService() {

    }

    @Override
    public void displayVoucher() {

    }
}

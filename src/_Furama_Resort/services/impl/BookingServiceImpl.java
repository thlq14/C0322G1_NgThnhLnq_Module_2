package _Furama_Resort.services.impl;

import _Furama_Resort.models.Booking;
import _Furama_Resort.models.facilitys.Facility;
import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.services.service.BookingService;
import _Furama_Resort.utils.BookingComparator;

import java.time.LocalDate;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    public Set<Booking> bookingSet() {
        return bookingSet;
    }

    @Override
    public void displayListBooking() {
        for (Booking item : bookingSet) {
            System.out.println(item); // toString
        }
    }

    @Override
    public void addNewBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }

        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Enter Rental Start Date: ");
        LocalDate startDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter Rental End Date: ");
        LocalDate endDate = LocalDate.parse(scanner.nextLine());
        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        bookingSet.add(booking);
        System.out.println("Added Booking Success.");
    }

    public static Customer chooseCustomer() {
        if (customerList.isEmpty()) {
            System.out.println("NOT found Customer.");
        } else {
            System.out.println("List Customer: ");
            for (Customer item : customerList) {
                System.out.println(item); // toString
            }
        }

        boolean flag = true;
        Customer customer = null;
        int id;
        while (flag) {
            System.out.println("Enter ID Customer: ");
            id = Integer.parseInt(scanner.nextLine());
            for (Customer item : customerList) {
                if (id == item.getId()) {
                    flag = false;
                    customer = item;
                }
            }
            if (flag) {
                System.out.println("Error: Enter ID Customer Again..");
            }
        }
        return customer;
    }


    public static Facility chooseFacility() {
        System.out.println("List Facility: ");
        for (Map.Entry<Facility, Integer> item : facilityList.entrySet()) {
            System.out.println(item.getKey()); // toString
        }

        boolean check = true;
        Facility facility = null;
        String id;
        while (check) {
            System.out.println("Enter ID Facility: ");
            id = scanner.nextLine();
            for (Map.Entry<Facility, Integer> item : facilityList.entrySet()) {
                if (id.equals(item.getKey().getIdFacility())) {
                    check = false;
                    facility = item.getKey();
                }
            }
            if (check) {
                System.out.println("Error: Enter ID Facility Again..");
            }
        }
        return facility;
    }
}

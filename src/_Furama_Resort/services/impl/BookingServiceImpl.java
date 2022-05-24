package _Furama_Resort.services.impl;

import _Furama_Resort.models.Booking;
import _Furama_Resort.models.facilitys.Facility;
import _Furama_Resort.models.facilitys.Villa;
import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.services.service.BookingService;
import _Furama_Resort.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(189, "Jiren", 22, "Male", 6843, 616782, "jiren@gmail.com", "35383rth", "Diamond", "Planet 11"));
        customerList.add(new Customer(761, "Hit", 29, "Male", 7854, 453987, "hit@gmail.com", "hit784", "Platinum", "Planet 6"));
        facilityList.put(new Villa("villa685", "Villa qwerty", 784, 794, 3, "Day", "Normal", 20, 5), 0);
        facilityList.put(new Villa("vil426", "Villa one", 714, 145, 10, "Night", "Vip", 15, 7), 0);

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
        String startDate = scanner.nextLine();
        System.out.println("Enter Rental End Date: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        bookingSet.add(booking);
        System.out.println("Added Booking Success.");
    }

    @Override
    public void editBooking() {

    }

    public static Customer chooseCustomer() {
        System.out.println("List Customer: ");
        for (Customer item : customerList) {
            System.out.println(item); // toString
        }
        System.out.println("Enter ID Customer: ");
        boolean flag = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (flag) {
            for (Customer item : customerList) {
                if (id == item.getId()) {
                    flag = false;
                    return item;
                }
            }
            if (flag) {
                System.out.println("Error: Enter ID Customer Again..");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("List Facility: ");
        for (Map.Entry<Facility, Integer> item : facilityList.entrySet()) {
            System.out.println(item.getKey()); // toString
        }
        System.out.println("Enter ID Facility: ");
        boolean check = true;
        String id = scanner.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> item : facilityList.entrySet()) {
                if (id.equals(item.getKey().getIdFacility())) {
                    check = false;
                    return item.getKey();
                }
            }
            if (check) {
                System.out.println("Error: Enter ID Facility Again..");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}

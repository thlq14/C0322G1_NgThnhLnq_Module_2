package _Furama_Resort.services.impl;

import _Furama_Resort.models.bookings.Booking;
import _Furama_Resort.models.facilitys.Facility;
import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.services.service.BookingService;
import _Furama_Resort.utils.BookingComparator;
import _Furama_Resort.utils.ReadAndWriteFile;

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
        List<String[]> list = ReadAndWriteFile.readFile("src/_Furama_Resort/data/booking.csv");
        bookingSet.clear();
        for (String[] item: list) {
            Booking booking = new Booking(item[0], LocalDate.parse(item[1]), LocalDate.parse(item[2]), item[3], item[4], item[5]);
            bookingSet.add(booking);
        }
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
        System.out.println("Enter Id Booking: ");
        String bookingId = scanner.nextLine();
        System.out.println("Enter Rental Start Date: ");
        LocalDate startDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter Rental End Date: ");
        LocalDate endDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Enter Id Customer: ");
        String customerId = chooseCustomer();
        System.out.println("Enter Name Service : ");
        String nameService = scanner.nextLine();
        System.out.println("Enter Id Facility: ");
        String facilityId = chooseFacility();
        Booking booking = new Booking(bookingId, startDate, endDate, customerId, nameService, facilityId);
        bookingSet.add(booking);
        String line = booking.getBookingId() + "," + booking.getStartDate() + "," + booking.getEndDate() + ","
                + booking.getCustomerId() + "," + booking.getNameService() + "," + booking.getFacilityId();
        ReadAndWriteFile.writeFile("src/_Furama_Resort/data/booking.csv", line);
        System.out.println("Added Booking Success.");
    }

    public static String chooseCustomer() {
        if (customerList.isEmpty()) {
            System.out.println("NOT found Customer.");
        } else {
            System.out.println("List Customer: ");
            for (Customer item : customerList) {
                System.out.println(item); // toString
            }
        }

        boolean flag = true;
        String customer = null;
        int id;
        while (flag) {
            System.out.println("Enter ID Customer: ");
            id = Integer.parseInt(scanner.nextLine());
            for (Customer item : customerList) {
                if (id == item.getId()) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Error: Enter ID Customer Again..");
            }
        }
        return null;
    }


    public static String chooseFacility() {
        System.out.println("List Facility: ");
        for (Map.Entry<Facility, Integer> item : facilityList.entrySet()) {
            System.out.println(item.getKey()); // toString
        }

        boolean check = true;
        String facility = null;
        String id;
        while (check) {
            System.out.println("Enter ID Facility: ");
            id = scanner.nextLine();
            for (Map.Entry<Facility, Integer> item : facilityList.entrySet()) {
                if (id.equals(item.getKey().getIdFacility())) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("Error: Enter ID Facility Again..");
            }
        }
        return null;
    }
}

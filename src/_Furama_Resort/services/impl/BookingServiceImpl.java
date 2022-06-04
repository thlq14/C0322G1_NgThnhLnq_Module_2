package _Furama_Resort.services.impl;

import _Furama_Resort.models.bookings.Booking;
import _Furama_Resort.models.facilitys.Facility;
import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.services.service.BookingService;
import _Furama_Resort.utils.comparators.BookingComparator;
import _Furama_Resort.utils.files.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    private static List<Customer> customerList = new ArrayList<>();
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static final String PATH_BOOKING = "src/_Furama_Resort/data/booking.csv";

    public static Set<Booking> bookingSet() {
        return bookingSet;
    }

    @Override
    public void display() {
        ReadAndWriteFile.readBooking(PATH_BOOKING);
        System.out.println("List Booking: ");
        for (Booking item : bookingSet) {
            System.out.println(item); // toString
        }
    }

    @Override
    public void add() {
        ReadAndWriteFile.readBooking(PATH_BOOKING);

        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }

        System.out.println("Enter Id Booking: ");
        String bookingId = scanner.nextLine();

        System.out.println("Enter Rental Start Date: ");
        DateTimeFormatter dateStart = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(scanner.nextLine(), dateStart);

        System.out.println("Enter Rental End Date: ");
        DateTimeFormatter dateEnd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate endDate = LocalDate.parse(scanner.nextLine(), dateEnd);

        System.out.println("Enter Id Customer: ");
        String customerId = chooseCustomer();

        System.out.println("Enter Name Service : ");
        String nameService = scanner.nextLine();

        System.out.println("Enter Id Facility: ");
        String facilityId = chooseFacility();

        Booking booking = new Booking(id, bookingId, startDate, endDate, customerId, nameService, facilityId);
        bookingSet.add(booking);

        ReadAndWriteFile.writeBooking(PATH_BOOKING, bookingSet);
        System.out.println("Added Booking Success.");
    }

    public static String chooseCustomer() {
        ReadAndWriteFile.readCustomer(PATH_BOOKING);
        if (customerList.isEmpty()) {
            System.out.println("NOT found Customer.");
        } else {
            System.out.println("List Customer: ");
            for (Customer item : customerList) {
                System.out.println(item);
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
            System.out.println(item.getKey());
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
                }
            }
            if (check) {
                System.out.println("Error: Enter ID Facility Again..");
            }
        }
        return null;
    }
}

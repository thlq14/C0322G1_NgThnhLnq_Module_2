package _Furama_Resort.services.impl;

import _Furama_Resort.models.Booking;
import _Furama_Resort.models.Contract;
import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.services.service.ContactService;

import java.util.*;

public class ContractServiceImpl implements ContactService {
    static Scanner scanner = new Scanner(System.in);
    static List<Contract> contractList = new ArrayList<>();

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().bookingSet();

        for (Booking item : bookingSet) {
            bookingQueue.add(item);
        }

        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("Creating Contract for Booking with Information: " + booking);
            System.out.println("Creating Contract for Customer with Information: " + customer);
            System.out.println("Enter Id Contract: ");
            String idContract = scanner.nextLine();
            System.out.println("Enter Previous Payment: ");
            String prePayment = scanner.nextLine();
            System.out.println("Enter Total Payment: ");
            String totalPayment = scanner.nextLine();
            Contract contract = new Contract(idContract, booking, prePayment, totalPayment, customer);
            contractList.add(contract);
            System.out.println("Created New Contract Success.");
        }
    }

    @Override
    public void displayListContract() {
        for (Contract item : contractList) {
            System.out.println(item);
        }
    }

    @Override
    public void editContract() {

    }
}

package _Furama_Resort.services.impl;

import _Furama_Resort.models.bookings.Booking;
import _Furama_Resort.models.contracts.Contract;
import _Furama_Resort.services.service.ContactService;
import _Furama_Resort.utils.ReadAndWriteFile;

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
            String customerId = booking.getCustomerId();
            System.out.println("Creating Contract for Booking with Information: " + booking);
            System.out.println("Creating Contract for Customer with Information: " + customerId);
            System.out.println("Enter Id Contract: ");
            String idContract = scanner.nextLine();
            System.out.println("Enter Previous Payment: ");
            String prePayment = scanner.nextLine();
            System.out.println("Enter Total Payment: ");
            String totalPayment = scanner.nextLine();
            Contract contract = new Contract(idContract, booking, prePayment, totalPayment, customerId);
            contractList.add(contract);
            String line = contract.getIdContract() + "," + contract.getIdBooking() + "," + contract.getPrePayment() + ","
                    + contract.getTotalPayment() + "," + contract.getIdCustomer();
            ReadAndWriteFile.writeFile("src/_Furama_Resort/data/contract.csv", line);
            System.out.println("Created New Contract Success.");
        }
    }

    @Override
    public void displayListContract() {
//        List<String[]> list = ReadAndWriteFile.readFile("src/_Furama_Resort/data/contract.csv");
//        contractList.clear();
//        for (String[] item : list) {
//            Contract contract = new Contract(item[0], item[1], item[2], item[3], item[4]);
//            contractList.add(contract);
//        }
        for (Contract item : contractList) {
            System.out.println(item);
        }
    }

    @Override
    public void editContract() {

    }
}

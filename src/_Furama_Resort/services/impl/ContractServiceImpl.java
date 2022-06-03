package _Furama_Resort.services.impl;

import _Furama_Resort.models.bookings.Booking;
import _Furama_Resort.models.contracts.Contract;
import _Furama_Resort.services.service.ContactService;
import _Furama_Resort.utils.files.ReadAndWriteFile;

import java.util.*;

public class ContractServiceImpl implements ContactService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Contract> contractList = new ArrayList<>();
    private static final String PATH_CONTRACT = "src/_Furama_Resort/data/contract.csv";
    private static Queue<Booking> bookingQueue = new LinkedList<>();
    private static Set<Booking> bookingSet = new BookingServiceImpl().bookingSet();

    @Override
    public void add() {
        contractList = ReadAndWriteFile.readContract(PATH_CONTRACT);
        for (Booking item : bookingSet) {
            bookingQueue.add(item);
        }

        while (!bookingQueue.isEmpty()) {
            String booking = bookingQueue.element().getBookingId();
            String customer = bookingQueue.element().getCustomerId();
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

            ReadAndWriteFile.writeContract(PATH_CONTRACT, contractList);
            System.out.println("Created New Contract Success.");
        }
    }

    @Override
    public void display() {
        contractList = ReadAndWriteFile.readContract(PATH_CONTRACT);
        System.out.println("List Contract: ");
        for (Contract item : contractList) {
            System.out.println(item);
        }
    }

    @Override
    public void edit() {
        contractList = ReadAndWriteFile.readContract(PATH_CONTRACT);
        for (Booking item : bookingSet) {
            bookingQueue.add(item);
        }
    }
}

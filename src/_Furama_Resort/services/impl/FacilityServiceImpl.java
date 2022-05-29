package _Furama_Resort.services.impl;

import _Furama_Resort.models.facilitys.Facility;
import _Furama_Resort.models.facilitys.House;
import _Furama_Resort.models.facilitys.Room;
import _Furama_Resort.models.facilitys.Villa;
import _Furama_Resort.models.persons.Employee;
import _Furama_Resort.services.service.FacilityService;
import _Furama_Resort.utils.ReadAndWriteFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

//    static {
//        facilityList.put(new Villa("vil685", "Villa qwerty", 784, 794, 3, "Day", "Normal", 20, 5), 0);
//        facilityList.put(new Villa("vil426", "Villa one", 714, 145, 10, "Night", "Vip", 15, 7), 0);
//    }

    @Override
    public void displayListFacility() {
        System.out.println("List Facility: ");
        for (Map.Entry<Facility, Integer> item : facilityList.entrySet()) {
            System.out.println(item);
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter Id Facility: ");
        String facilityId = scanner.nextLine();
        System.out.println("Enter Name Service: ");
        String nameService = scanner.nextLine();
        System.out.println("Enter Area Use: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Rental Price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Rental People Max: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Style Rental: ");
        String styleRental = scanner.nextLine();
        System.out.println("Enter Standard Villa: ");
        String standardVilla = scanner.nextLine();
        System.out.println("Enter Area Pool: ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Floor Villa: ");
        int floorVilla = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(facilityId, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floorVilla);
        facilityList.put(villa, 0);
        String line = villa.getIdFacility() + "," + villa.getNameService() + "," + villa.getAreaUse() + ","
                + villa.getRentalPrice() + "," + villa.getRentalPeopleMax() + "," + villa.getStyleRental() + ","
                + villa.getStandardVilla() + "," + villa.getAreaPool() + "," + villa.getFloorVilla();
        ReadAndWriteFile.writeFile("src/_Furama_Resort/data/villa.csv", line);
        System.out.println("Added Villa Success.");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter Id Facility: ");
        String facilityId = scanner.nextLine();
        System.out.println("Enter Name Service: ");
        String nameService = scanner.nextLine();
        System.out.println("Enter Area Use: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Rental Price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Rental People Max: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Style Rental: ");
        String styleRental = scanner.nextLine();
        System.out.println("Enter Standard House: ");
        String standardHouse = scanner.nextLine();
        System.out.println("Enter Floor House: ");
        int floorHouse = Integer.parseInt(scanner.nextLine());
        House house = new House(facilityId, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardHouse, floorHouse);
        facilityList.put(house, 0);
        String line = house.getIdFacility() + "," + house.getNameService() + "," + house.getAreaUse() + ","
                + house.getRentalPrice() + "," + house.getRentalPeopleMax() + "," + house.getStyleRental() + ","
                + house.getStandardHouse() + "," + house.getFloorHouse();
        ReadAndWriteFile.writeFile("src/_Furama_Resort/data/house.csv", line);
        System.out.println("Added House Success.");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter Id Facility: ");
        String facilityId = scanner.nextLine();
        System.out.println("Enter Name Service: ");
        String nameService = scanner.nextLine();
        System.out.println("Enter Area Use: ");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Rental Price: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Rental People Max: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Style Rental: ");
        String styleRental = scanner.nextLine();
        System.out.println("Enter Free Service: ");
        String freeService = scanner.nextLine();
        Room room = new Room(facilityId, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, freeService);
        facilityList.put(room, 0);
        String line = room.getIdFacility() + "," + room.getNameService() + "," + room.getAreaUse() + ","
                + room.getRentalPrice() + "," + room.getRentalPeopleMax() + "," + room.getStyleRental() + ","
                + room.getFreeService();
        ReadAndWriteFile.writeFile("src/_Furama_Resort/data/room.csv", line);
        System.out.println("Added Room Success.");
    }

    @Override
    public void editFacilityById() {
//        int countEdit = 0;
//        System.out.println("Enter ID Customer want to Update: ");
//        int inputUpdate = Integer.parseInt(scanner.nextLine());
//        for (Map.Entry<Facility, Integer> item : facilityList.entrySet()) {
//            if (item.getKey().getIdFacility().equals(inputUpdate)) {
//                System.out.println("Enter Id Facility: ");
//                String facilityId = scanner.nextLine();
//                System.out.println("Enter Name Service: ");
//                String nameService = scanner.nextLine();
//                System.out.println("Enter Area Use: ");
//                double areaUse = Double.parseDouble(scanner.nextLine());
//                System.out.println("Enter Rental Price: ");
//                int rentalPrice = Integer.parseInt(scanner.nextLine());
//                System.out.println("Enter Rental People Max: ");
//                int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
//                System.out.println("Enter Style Rental: ");
//                String styleRental = scanner.nextLine();
//                System.out.println("Enter Standard Villa: ");
//                String standardVilla = scanner.nextLine();
//                System.out.println("Enter Area Pool: ");
//                double areaPool = Double.parseDouble(scanner.nextLine());
//                System.out.println("Enter Floor Villa: ");
//                int floorVilla = Integer.parseInt(scanner.nextLine());
//                Villa villa = new Villa(facilityId, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floorVilla);
//                facilityList.keySet().
//                countEdit++;
//                System.out.println("Updated Employee Success.");
//            }
//        }
//        if (countEdit == 0) {
//            System.out.println("ID NOT found!!");
//        }
    }
}

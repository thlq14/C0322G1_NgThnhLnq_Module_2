package _Furama_Resort.services.impl;

import _Furama_Resort.models.facilitys.Facility;
import _Furama_Resort.models.facilitys.House;
import _Furama_Resort.models.facilitys.Room;
import _Furama_Resort.models.facilitys.Villa;
import _Furama_Resort.services.service.FacilityService;
import _Furama_Resort.utils.files.ReadAndWriteFile;
import _Furama_Resort.utils.regex.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static Map<Villa, Integer> villas = new LinkedHashMap<>();
    private static Map<House, Integer> houses = new LinkedHashMap<>();
    private static Map<Room, Integer> rooms = new LinkedHashMap<>();

    public static final String PATH_VILLA = "src/_Furama_Resort/data/villa.csv";
    public static final String PATH_HOUSE = "src/_Furama_Resort/data/house.csv";
    public static final String PATH_ROOM = "src/_Furama_Resort/data/room.csv";

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

        System.out.println("List Facility: ");

        villas = ReadAndWriteFile.readVilla(PATH_VILLA);
        for (Map.Entry<Villa, Integer> item : villas.entrySet()) {
            System.out.println(item.getKey() + " Number of Used: " + item.getValue());
        }

        houses = ReadAndWriteFile.readHouse(PATH_HOUSE);
        for (Map.Entry<House, Integer> item : houses.entrySet()) {
            System.out.println(item.getKey() + " Number of Used: " + item.getValue());
        }

        rooms = ReadAndWriteFile.readRoom(PATH_ROOM);
        for (Map.Entry<Room, Integer> item : rooms.entrySet()) {
            System.out.println(item.getKey() + " Number of Used: " + item.getValue());
        }
    }

    @Override
    public void addVilla() {

        villas = ReadAndWriteFile.readVilla(PATH_VILLA);

        String facilityId = RegexData.inputIdVilla();

        String nameService = RegexData.inputName();

        double areaUse = Double.parseDouble(RegexData.inputUseArea());

        int rentalPrice = Integer.parseInt(RegexData.inputRentalPrice());

        int rentalPeopleMax = Integer.parseInt(RegexData.inputPeopleMax());

        System.out.println("Enter Style Rental: Rental By: 1. Years; 2. Months; 3. Days; 4. Hours: ");
        String styleRental;
        int chooseStyle;
        do {
            chooseStyle = Integer.parseInt(scanner.nextLine());
            switch (chooseStyle) {
                case 1:
                    styleRental = "Year";
                    break;
                case 2:
                    styleRental = "Month";
                    break;
                case 3:
                    styleRental = "Day";
                    break;
                case 4:
                    styleRental = "Hour";
                    break;
                default:
                    styleRental = "Error: Enter Again: ";
            }
        } while (chooseStyle < 1 || chooseStyle > 4);

        String standardVilla = RegexData.inputStandardVilla();

        double areaPool = Double.parseDouble(RegexData.inputAreaPool());

        int floorVilla = Integer.parseInt(RegexData.inputFloor());

        Villa villa = new Villa(facilityId, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floorVilla);
        villas.put(villa, 0);

        ReadAndWriteFile.writeVilla(PATH_VILLA, villas);
        System.out.println("Added Villa Success.");
    }

    @Override
    public void addHouse() {

        houses = ReadAndWriteFile.readHouse(PATH_HOUSE);

        String facilityId = RegexData.inputIdHouse();

        String nameService = RegexData.inputName();

        double areaUse = Double.parseDouble(RegexData.inputUseArea());

        int rentalPrice = Integer.parseInt(RegexData.inputRentalPrice());

        int rentalPeopleMax = Integer.parseInt(RegexData.inputPeopleMax());

        System.out.println("Enter Style Rental: Rental By: 1. Years; 2. Months; 3. Days; 4. Hours: ");
        String styleRental;
        int chooseStyle;
        do {
            chooseStyle = Integer.parseInt(scanner.nextLine());
            switch (chooseStyle) {
                case 1:
                    styleRental = "Year";
                    break;
                case 2:
                    styleRental = "Month";
                    break;
                case 3:
                    styleRental = "Day";
                    break;
                case 4:
                    styleRental = "Hour";
                    break;
                default:
                    styleRental = "Error: Enter Again: ";
            }
        } while (chooseStyle < 1 || chooseStyle > 4);

        String standardHouse = RegexData.inputStandardHouse();

        int floorHouse = Integer.parseInt(RegexData.inputFloor());

        House house = new House(facilityId, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardHouse, floorHouse);
        houses.put(house, 0);

        ReadAndWriteFile.writeHouse(PATH_HOUSE, houses);
        System.out.println("Added House Success.");
    }

    @Override
    public void addRoom() {

        rooms = ReadAndWriteFile.readRoom(PATH_ROOM);

        String facilityId = RegexData.inputIdRoom();

        String nameService = RegexData.inputName();

        double areaUse = Double.parseDouble(RegexData.inputUseArea());

        int rentalPrice = Integer.parseInt(RegexData.inputRentalPrice());

        int rentalPeopleMax = Integer.parseInt(RegexData.inputPeopleMax());

        System.out.println("Enter Style Rental: Rental By: 1. Years; 2. Months; 3. Days; 4. Hours: ");
        String styleRental;
        int chooseStyle;
        do {
            chooseStyle = Integer.parseInt(scanner.nextLine());
            switch (chooseStyle) {
                case 1:
                    styleRental = "Year";
                    break;
                case 2:
                    styleRental = "Month";
                    break;
                case 3:
                    styleRental = "Day";
                    break;
                case 4:
                    styleRental = "Hour";
                    break;
                default:
                    styleRental = "Error: Enter Again: ";
            }
        } while (chooseStyle < 1 || chooseStyle > 4);

        System.out.println("Enter Free Service: ");
        String freeService = scanner.nextLine();

        Room room = new Room(facilityId, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, freeService);
        rooms.put(room, 0);

        ReadAndWriteFile.writeRoom(PATH_ROOM, rooms);
        System.out.println("Added Room Success.");
    }
}

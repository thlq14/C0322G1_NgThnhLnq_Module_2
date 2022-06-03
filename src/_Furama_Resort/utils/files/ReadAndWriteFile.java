package _Furama_Resort.utils.files;

import _Furama_Resort.models.bookings.Booking;
import _Furama_Resort.models.contracts.Contract;
import _Furama_Resort.models.facilitys.House;
import _Furama_Resort.models.facilitys.Room;
import _Furama_Resort.models.facilitys.Villa;
import _Furama_Resort.models.persons.Customer;
import _Furama_Resort.models.persons.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ReadAndWriteFile {
    public static void writeFile(String source, List<String> list) {
        File file = new File(source);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String item : list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeEmployee(String pathFile, List<Employee> employeeList) {
        List<String> list = new ArrayList<>();
        for (Employee item : employeeList) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeCustomer(String pathFile, List<Customer> customerList) {
        List<String> list = new ArrayList<>();
        for (Customer item : customerList) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeVilla(String pathFile, Map<Villa, Integer> villaList) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<Villa, Integer> item : villaList.entrySet()) {
            list.add(item.getKey().getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeHouse(String pathFile, Map<House, Integer> houseList) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<House, Integer> item : houseList.entrySet()) {
            list.add(item.getKey().getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeRoom(String pathFile, Map<Room, Integer> roomList) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<Room, Integer> item : roomList.entrySet()) {
            list.add(item.getKey().getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeBooking(String pathFile, Set<Booking> bookingList) {
        List<String> list = new ArrayList<>();
        for (Booking item : bookingList) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeContract(String pathFile, List<Contract> contractList) {
        List<String> list = new ArrayList<>();
        for (Contract item : contractList) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static List<String> readFile(String source) {
        File file = new File(source);
        List<String> list = new ArrayList<>();
        String line;
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Employee> readEmployee(String path) {
        List<String> list = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            employeeList.add(new Employee(Integer.parseInt(item[0]), item[1], LocalDate.parse(item[2]), item[3], Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], item[7], item[8], item[9], Integer.parseInt(item[10])));
        }
        return employeeList;
    }

    public static List<Customer> readCustomer(String path) {
        List<String> list = readFile(path);
        List<Customer> customerList = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            customerList.add(new Customer(Integer.parseInt(item[0]), item[1], LocalDate.parse(item[2]), item[3], Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], item[7], item[8], item[9]));
        }
        return customerList;
    }

    public static Map<Villa, Integer> readVilla(String path) {
        List<String> list = readFile(path);
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            villaList.put(new Villa(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8])), 0);
        }
        return villaList;
    }

    public static Map<House, Integer> readHouse(String path) {
        List<String> list = readFile(path);
        Map<House, Integer> houseList = new LinkedHashMap<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            houseList.put(new House(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], Integer.parseInt(item[7])), 0);
        }
        return houseList;
    }

    public static Map<Room, Integer> readRoom(String path) {
        List<String> list = readFile(path);
        Map<Room, Integer> roomList = new LinkedHashMap<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            roomList.put(new Room(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6]), 0);
        }
        return roomList;
    }

    public static List<Booking> readBooking(String path) {
        List<String> list = readFile(path);
        List<Booking> bookingList = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            bookingList.add(new Booking(item[0], LocalDate.parse(item[1]), LocalDate.parse(item[2]), item[3], item[4], item[5]));
        }
        return bookingList;
    }

    public static List<Contract> readContract(String path) {
        List<String> list = readFile(path);
        List<Contract> contractList = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            contractList.add(new Contract(item[0], item[1], item[2], item[3], (item[4])));
        }
        return contractList;
    }
}

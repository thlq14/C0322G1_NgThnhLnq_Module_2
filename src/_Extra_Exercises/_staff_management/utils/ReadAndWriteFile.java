package _Extra_Exercises._staff_management.utils;

import _Extra_Exercises._staff_management.models.Manager;
import _Extra_Exercises._staff_management.models.Product;
import _Extra_Exercises._staff_management.models.Staff;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String source, String list) {
        File file = new File(source);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(list);
            bufferedWriter.newLine();
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

    public static void writeStaff(String path, List<Staff> staff) {
        List<String> list = new ArrayList<>();
        for (Staff item : staff) {
            list.add(item.getInfo());
        }
        String staffStr = "";
        for (String item : list) {
            staffStr += item + "\n";
        }
        writeFile(path, staffStr);
    }

    public static List<String[]> readFile(String source) {
        File file = new File(source);
        List<String[]> list = new ArrayList<>();
        String line;
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arr = line.split(",");
                list.add(arr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void readStaff(String path, List<Staff> staff) {
        List<String[]> list = readFile(path);
        for (String[] item : list) {
            if (item[7].equals("Manager")) {
                staff.add(new Manager(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Double.parseDouble(item[5]), Double.parseDouble(item[6])));
            } else {
                staff.add(new Product(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Double.parseDouble(item[5]), Double.parseDouble(item[6])));
            }
        }
    }

    public static void readManager(String path, List<Manager> managers) {
        List<String[]> list = readFile(path);
        for (String[] item : list) {
            if (item[7].equals("Manager")) {
                managers.add(new Manager(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Double.parseDouble(item[5]), Double.parseDouble(item[6])));
            }
        }
    }

    public static void readProduct(String path, List<Product> products) {
        List<String[]> list = readFile(path);
        for (String[] item : list) {
            if (item[7].equals("Product")) {
                products.add(new Product(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Double.parseDouble(item[5]), Double.parseDouble(item[6])));
            }
        }
    }
}

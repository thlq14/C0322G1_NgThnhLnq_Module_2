package _Extra_Exercises._staff_management.utils;

import _Extra_Exercises._staff_management.models.Manager;
import _Extra_Exercises._staff_management.models.Product;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
                assert bufferedWriter != null;
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeManager(String pathFile, List<Manager> managers) {
        List<String> list = new ArrayList<>();
        for (Manager item : managers) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeProduct(String pathFile, List<Product> products) {
        List<String> list = new ArrayList<>();
        for (Product item : products) {
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

    public static List<Manager> readManager(String path) {
        List<String> list = readFile(path);
        List<Manager> managers = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            managers.add(new Manager(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Double.parseDouble(item[5]), Double.parseDouble(item[6])));
        }
        return managers;
    }

    public static List<Product> readProduct(String path) {
        List<String> list = readFile(path);
        List<Product> products = new ArrayList<>();
        String[] item;
        for (String arr : list) {
            item = arr.split(",");
            products.add(new Product(Integer.parseInt(item[0]), item[1], item[2], LocalDate.parse(item[3]), item[4], Double.parseDouble(item[5]), Double.parseDouble(item[6])));
        }
        return products;
    }
}

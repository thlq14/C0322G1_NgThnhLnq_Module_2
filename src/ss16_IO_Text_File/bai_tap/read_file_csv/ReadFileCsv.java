package ss16_IO_Text_File.bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {
    public static List<String[]> readFile(String pathFile) {
        File file = new File(pathFile);
        List<String[]> list = new ArrayList<>();
        String line;
        if (!file.exists()) {
            System.err.println("File Doesn't Exist.");
        } else {
            try (FileReader fileReader = new FileReader(file)) {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((line = bufferedReader.readLine()) != null) {
                    String[] arr = line.split(",");
                    list.add(arr);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        List<String[]> list = ReadFileCsv.readFile("src/ss16_IO_Text_File/bai_tap/read_file_csv/file.csv");
        for (String[] item : list) {
            Country country = new Country(Integer.parseInt(item[0]), item[1], item[2]);
            countryList.add(country);
        }
        System.out.println("List Country: ");
        for (Country item : countryList) {
            System.out.println(item);
        }
    }
}
